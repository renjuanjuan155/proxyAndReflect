package com.example.aopzhujie.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期处理
 */
public class DateUtils {
	/** 时间格式(yyyy-MM-dd) */
	public final static String DATE_PATTERN = "yyyy-MM-dd";
	/** 时间格式(yyyy-MM-dd HH:mm:ss) */
	public final static String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
	
	public static String format(Date date) {
        return format(date, DATE_PATTERN);
    }

    public static String format(Date date, String pattern) {
        if(date != null){
            SimpleDateFormat df = new SimpleDateFormat(pattern);
            return df.format(date);
        }
        return null;
    }

    public static String calculateTimeDifference(Date date) {
        Date now = new Date();
        int count = 0;
        count = (int) ((now.getTime() - date.getTime()) / ((long) 1000 * 3600 * 24 * 3));
        if(count==0){
            count = (int) ((now.getTime() - date.getTime()) / (1000 * 3600 * 24));
            if (count == 0) {
                count = (int) ((now.getTime() - date.getTime()) / (1000 * 3600));
                if (count == 0) {
                    count = (int) ((now.getTime() - date.getTime()) / (1000 * 60));
                    if (count == 0) {
                        count = (int) ((now.getTime() - date.getTime()) / (1000));
                        return count + "秒前";
                    } else {
                        return count + "分钟前";
                    }
                } else {
                    return count + "小时前";
                }
            }else{
                return "昨天";
            }
        }else{
            //3天及以上的  年-月-日
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            return format.format(date);
        }
    }
}
