package com.example.aopzhujie.util;

import com.example.aopzhujie.dto.AnswerListDto;

import java.util.ArrayList;
import java.util.List;

/**
 * Author : liuwei
 * Date : 2017/10/15
 * Description :
 */
public class AnswerListToTreeUtils {

    public static List<AnswerListDto> listTreeMenu(List<AnswerListDto> list) {

        List<AnswerListDto> nodeList = new ArrayList<AnswerListDto>();
        for (AnswerListDto node1 : list) {
            boolean mark = false;
            for (AnswerListDto node2 : list) {
                if (node1.getParentid() != 0 && node1.getParentid().equals(node2.getId())) {
                    mark = true;
                    if (node2.getChildren() == null)
                        node2.setChildren(new ArrayList<AnswerListDto>());
                    node2.getChildren().add(node1);
                    break;
                }
            }
            if (!mark) {
                nodeList.add(node1);
            }
        }
        return nodeList;
    }
}
