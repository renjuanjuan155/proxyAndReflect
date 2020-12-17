package com.example.aopzhujie.util;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TreeUtils {
	public static Map<String,Object> mapArray = new LinkedHashMap<String, Object>(); 
	  public List<Tree> menuCommon; 
	  public List<Object> list = new ArrayList<Object>();
	    
	  public List<Object> menuList(List<Tree> menu){   
	    this.menuCommon = menu; 
	    for (Tree x : menu) {   
	      Map<String,Object> mapArr = new LinkedHashMap<String, Object>();
	      if(x.getParentId() == 0){
	        mapArr.put("menuId", x.getMenuId());
	        mapArr.put("name", x.getName());
	        mapArr.put("parentId", x.getParentId());
	        mapArr.put("icon", x.getIcon());
	        mapArr.put("url", x.getUrl());
	        mapArr.put("expand", true);
	        mapArr.put("children", menuChild(x.getMenuId()));
	        list.add(mapArr); 
	      } 
	    }   
	    return list; 
	  } 
	   
	  public List<?> menuChild(Long id){
	    List<Object> lists = new ArrayList<Object>();
	    for(Tree a:menuCommon){ 
	      Map<String,Object> childArray = new LinkedHashMap<String, Object>();
	      if(a.getParentId().longValue() == id.longValue()){
	        childArray.put("menuId", a.getMenuId());
	        childArray.put("name", a.getName()); 
	        childArray.put("parentId", a.getParentId());
	        childArray.put("icon", a.getIcon());
	        childArray.put("url", a.getUrl());
	        childArray.put("children", menuChild(a.getMenuId()));
	        lists.add(childArray); 
	      } 
	    } 
	    return lists; 
	  } 

}
