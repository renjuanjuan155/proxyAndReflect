package com.example.aopzhujie.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(description = "分页出参")
public class PageOut<T> {

	@ApiModelProperty(value = "总条数")
	private Long totalCount;

	@ApiModelProperty(value = "总页数")
	private Integer totalPage;

	@ApiModelProperty(value = "当前页数")
	private Integer pageNum;

	@ApiModelProperty(value = "每页大小")
	private Integer pageSize;

	@ApiModelProperty(value = "数据列表")
	private List<T> pageList;

}
