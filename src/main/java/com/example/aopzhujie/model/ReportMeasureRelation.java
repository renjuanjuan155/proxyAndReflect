package com.example.aopzhujie.model;

import com.example.aopzhujie.util.report.columns.Children;
import lombok.Data;

/**
 * @Description
 * @Date 2020/12/15 11:36
 * @Created by meijunjie
 */
@Data
public class ReportMeasureRelation {

    //报表唯一编码
    private String reportcode;
    //父节点编号
    private Long parentid;
    //是否子节点，0不是，1是
    private String isleaf;
    //id层级
    private String treecode;
    //排序
    private Integer sortid;
    //指标ID
    private Integer measureid;
    //指标名称
    private String measurename;
    //
    private String measurelab;
    //平台模块
    private String themename;
    //
    private String unittype;
    //标题每行列数
    private int childrenCount = 0;
    //节点层次（标题行数）
    private int lineCount = 1;

    private Long id;

    /**
     * 添加孩子节点
     *
     * @param node
     */
    public void addChild(ReportMeasureRelation node) {
        this.children.addChild(node);
    }

    /**
     * 孩子节点列表
     */
    private Children children = new Children();

    /**
     * 兄弟节点横向排序
     */
    public void sortChildren() {
        if (children != null && children.getSize() != 0) {
            // 排序
            children.sortChildren();
        }
    }
}
