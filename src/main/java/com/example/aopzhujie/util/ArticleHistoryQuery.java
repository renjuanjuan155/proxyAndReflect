package com.example.aopzhujie.util;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @描述 文章浏览记录处理前台传参工具类
 * @创建人 Kevin.Liao
 * @邮箱 kevin.qingwang.liao@gmail.com
 * @创建时间 2018/7/15 19:47
 */
public class ArticleHistoryQuery extends LinkedHashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    // 条件 用户id
    private int userId;
    //当前页码
    private int page;
    //每页条数
    private int limit;

    public ArticleHistoryQuery(Map<String, Object> params) throws  Exception{
        this.putAll(params);

        //分页参数
        try {
            this.page = Integer.parseInt(params.get("page").toString());
        }catch (Exception e){
            this.page = 1;
            throw new Exception("page参数异常");
        }
        try {
            this.limit = Integer.parseInt(params.get("limit").toString());
        }catch (Exception e){
            this.limit = 10;
            throw new Exception("limit参数异常");
        }
        this.put("offset", (page - 1) * limit);
        this.put("page", page);
        this.put("limit", limit);

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }


}
