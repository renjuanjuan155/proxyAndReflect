package com.example.aopzhujie.util;

/**
 * 常量定义
 * <p>
 * Created by 张海 on 2017/04/29.
 */
public class ConstantsUtil {

    //数据库连接
    public abstract class DataSourceCode {
        public static final String DATA_000001 = "DATA_000001";         //主mysql连接池
        public static final String DATA_000002 = "DATA_000002";         //jdbc动态数据源
        public static final String DATA_000003 = "DATA_000003";         //主hana连接池
        public static final String DATA_000004 = "DATA_000004";         //帆软数据源
        public static final String DATA_000005 = "DATA_000005";         //APP-85 数据库
    }

    //请求方式
    public abstract class RequestMethod {
        public static final String GET = "GET";
        public static final String POST = "POST";
    }

    //通用的状态码
    public abstract class CommonCode {
        public static final int SUCCESS_CODE = 0;      //获取数据成功状态码
        public static final int ERROR_CODE = 1;        //获取数据出错状态码
        public static final int POINT_CODE = -2;        //获取数据出错状态码
    }

    //通用的消息
    public abstract class CommonMessage {
        public static final String SUCCESS_MESSAGE = "请求数据成功!";     //获取数据失败
        public static final String ERROR_MESSAGE = "请求数据出错!!";      //获取数据出错!
        public static final String INTERNAL_MESSAGE = "内部错误,请联系工程师!!";       //内部错误!
    }

    //自定义错误消息
    public abstract class ExceptionCode {
        public static final int INTERNAL_ERROR = 500;          // 内部错误
        public static final int PORTAL_ERROR = -100;           // 平台内部通用错误
        public static final int TO_LOGIN = -99;                // 跳转到登录
        public static final int SIGN_ERROR = -98;              // openApi请求sign校验错误
        public static final int NULL_ERROR = -97;              // 没有查到数据
    }

    //获取数据方式
    public abstract class ExecuteType {
        public static final int PROCEDURE = 1;     //存储过程
        public static final int EXECUTESQL = 2;     //自定义sql
        public static final int FROMOTHER = 3;     //第三方系统
    }

    //开放接口数据来源
    public abstract class OpenExecuteType {
        public static final String PROVIDE = "PROVIDE_"; //路由接口编码
        public static final String REP = "REP_";     //平台报表接口编码
    }

    //api操作系统类型
    public abstract class SysOperationLogType {
        public static final String API = "API"; // 统一接口
        public static final String BUSINESS = "BUSINESS"; // 业务系统
    }

    /**
     * 云存储配置KEY
     */
    public final static String CLOUD_STORAGE_CONFIG_KEY = "CLOUD_STORAGE_CONFIG_KEY";

    /**
     * 阿里云短信平台
     */
    public abstract class SysSmsConfig {
        // 注册
        public static final long TYPE_ONE = 1;
        // 密码找回
        public static final long TYPE_TWO = 2;
        // 登录
        public static final long TYPE_THREE = 3;
        // 有效时间 60*5 秒
        public static final long SMS_EXT_TIMES = 300;
        // 阿里云短信平台自定义编码
        public static final String SMS_TYPE_CODE_ALIYUN = "SMS_ALIYUN";
        // type=1 注册 模板编码
        public static final String REGISTER_TEMPLATE_CODE = "SMS_105925130";
        // type=2 密码找回 模板编码
        public static final String FIND_TEMPLATE_CODE = "SMS_105925130";
        // 短信发送结果
        public static final String OK = "OK";
    }

    /**
     * 微信支付配置
     */
    public abstract class WxPayTradeType {
        // 公众号支付
        public static final String JSAPI = "JSAPI";
        // 扫码支付
        public static final String NATIVE = "NATIVE";
        // App支付
        public static final String APP = "APP";
    }
}


