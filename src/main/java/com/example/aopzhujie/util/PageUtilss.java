package com.example.aopzhujie.util;

import com.example.aopzhujie.dto.PageOut;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class PageUtilss {

	public static void copyPropertyFromPageInfo(PageInfo<?> pageInfo, PageOut<?> target) {
		target.setPageNum(pageInfo.getPageNum());
		target.setPageSize(pageInfo.getPageSize());
		target.setTotalPage(pageInfo.getPages());
		target.setTotalCount(pageInfo.getTotal());
	}

	public static <K, V> PageOut<V> convertFromPageInfo(PageInfo<K> pageInfo, Class<V> targetClass) throws InstantiationException, IllegalAccessException {
		if (pageInfo == null) {
			return null;
		}
		PageOut<V> pageOut = new PageOut<V>();
		pageOut.setPageNum(pageInfo.getPageNum());
		pageOut.setPageSize(pageInfo.getPageSize());
		pageOut.setTotalPage(pageInfo.getPages());
		pageOut.setTotalCount(pageInfo.getTotal());
		pageOut.setPageList(new ArrayList<V>(pageInfo.getPageNum()));
		for (K k : pageInfo.getList()) {
			V v = targetClass.newInstance();
			BeanUtils.copyProperties(k, v);
			pageOut.getPageList().add(v);
		}
		return pageOut;
	}

	public static <K, V> List<V> convertList(List<K> src, Class<V> targetClass) throws InstantiationException, IllegalAccessException {
		if (src == null) {
			return null;
		}
		List<V> list = new ArrayList<V>(src.size());
		for (K k : src) {
			V v = targetClass.newInstance();
			BeanUtils.copyProperties(k, v);
			list.add(v);
		}
		return list;
	}
}
