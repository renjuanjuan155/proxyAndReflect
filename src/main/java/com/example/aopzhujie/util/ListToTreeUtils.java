package com.example.aopzhujie.util;

import com.example.aopzhujie.model.Menu;

import java.util.ArrayList;
import java.util.List;

/**
 * Author : 杨杨
 * Date : 2017/10/11
 * Description :
 */
public class ListToTreeUtils {

    public static List<Menu> listTreeMenu(List<Menu> list) {

        List<Menu> nodeList = new ArrayList<Menu>();
        for (Menu node1 : list) {
            boolean mark = false;
            for (Menu node2 : list) {
                if (node1.getPid() != 0 && node1.getPid().equals(node2.getId())) {
                    mark = true;
                    if (node2.getChildren() == null)
                        node2.setChildren(new ArrayList<Menu>());
                    node2.getChildren().add(node1);
                    break;
                }
            }
            if (!mark) {
                nodeList.add(node1);
            }
        }
        return filtrateList(nodeList);
    }

    public static List<Menu>  filtrateList(List<Menu> nodeList){
        for (int i=0;i<nodeList.size();i++){
            Menu node=nodeList.get(i);
            node.setOpen(true);
            if (node.getChildren() == null){
                node.setChildren(new ArrayList<Menu>());
            }
            if (node.getDisabled()==1){
                nodeList.remove(i);
                continue;
            }
            for (int j=0;j<node.getChildren().size();j++){
                filtrateList(node.getChildren());
            }
        }
        return nodeList;
    }
}
