package com.example.aopzhujie.dto;

import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Date 2020/12/17 14:27
 * @Created by meijunjie
 */
@Data
@ApiOperation("分页入参")
@NoArgsConstructor
@AllArgsConstructor
public class PageIn {

    private int limit;

    private int pageNum;
}
