package com.example.aopzhujie.dto;

import lombok.Data;

import java.util.List;

/**
 * @Description
 * @Date 2020/12/15 11:40
 * @Created by meijunjie
 */
@Data
public class AnswerListDto {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String avatar;

    private String name;

    private String nick_name;

    private Integer questionId;

    private Integer userId;

    private String content;

    private Integer replyId;

    private Integer accent;

    private Integer likecount;

    private Integer viewcount;

    private boolean praiseFlg;

    private String remark;

    private Integer parentid;

    private List<AnswerListDto> children;
}
