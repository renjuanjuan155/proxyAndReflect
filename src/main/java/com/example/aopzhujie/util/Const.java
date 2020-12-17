package com.example.aopzhujie.util;

import java.text.SimpleDateFormat;


/**
 * 用户记录各种常量
 * 
 * @author kwq
 */
public class Const  {
	private static final long serialVersionUID = -5499557044989645565L;

	public static final String UTF8 = "utf-8";
	/** 略缩图宽度 */
	public static final int SMALL_WIDTH = 390;
	/** 略缩图高度 */
	public static final int SMALL_HEIGHT = 450;

	public static final String MD5_SECRET = "D3924FF954AD4CE69BF587F083530B7E";
	/**
	 * 用户置于session中的key
	 */
	public static final String SESSION_USER_KEY = "UserBeanKey";
	
	/**
	 * 用户置于session中的key,当前站点
	 */
	public static final String CURRENT_SITE_CODE = "currentSiteCode";

	/**
	 * 用户置于session中的key，用户拥有站点列表
	 */
	public static final String CURRENT_SITE_CODE_LIST="cuerrntSiteCodeList";
	
	/**
	 * 用户置于session中的key，用户拥有站点列表长度
	 */
	public static final String SITE_LIST_SIZE="siteListSize";
	/**
	 * 
	 * Redis 缓存名称
	 */
	// public static final String JEDIS_CACHE_KEY_PRIVILEGE = "yw_p_"; // 访问权限

	// public static final String JEDIS_CACHE_NAME = "YW_"; // 通用缓存名

	// public static final String JEDIS_CACHE_I18N_NAME = "YW_i18n_"; // 国际化

	public static final String JEDIS_CACHE_VERSION = "YW_ver_"; // 数据版本号

	public static final String JEDIS_DATA_CACHE = "YW_$data_"; // 数据缓存

	/**
	 * 图片验证码保存在session中的名称
	 */
	public static final String VALID_CODE = "random_code";

	/**
	 * 权限访问
	 */
	public static final String CACHE_KEY_MENU_PRIVILEGE = "mp_";

	/**
	 * 角色对应的功能组
	 */
	public static final String CACHE_KEY_ROLE_FUNC_MAPPING = "RFM_";

	/**
	 * 登录使用的随机加密因子变量名
	 */
	public static final String LOGIN_MCRYPT_KEY = "_$token";

	/**
	 * 产品分类的缓存
	 */
	public static final String CACHE_KEY_VALID_CATEGORY_LIST = "_CVL";
	public static final String CACHE_KEY_VALID_BRAND_LIST = "_CBL";

	/**
	 * 缓存信息的key
	 */
	public static final String CACHE_KEY_AREA = "_$area_";
	public static final String CACHE_KEY_DELIVERY_AREA = "_$d_area_";
	public static final String CACHE_KEY_BRAND = "_$brand_";
	public static final String CACHE_KEY_CATEGORY = "_$category_";
	public static final String CACHE_KEY_PRODUCT = "_$product_";
	public static final String CACHE_KEY_PRODUCT_EXT_PROP_DEF = "_$pe_prop_";
	public static final String CACHE_KEY_DICT = "_$dict_";
	public static final String CACHE_KEY_TB_OAUTH = "_$oauth_";
	public static final String CACHE_KEY_TB_OAUTHS = "_$oauths_";
	public static final String CACHE_KEY_TMC_PROCESSOR = "_$tmc_";
	public static final String CACHE_KEY_ONSALE_ITEM = "_$os_oi_";
	public static final String CACHE_KEY_USER = "_$user_";
	public static final String CACHE_KEY_SMS_TEMPLATE = "_$st_";
	public static final String CACHE_KEY_ORG_CODE = "_$oc_";
	public static final String CACHE_KEY_ITEM = "os_it_";
	public static final String CACHE_KEY_SID_GEN = "_$sg_";
	public static final String JEDIS_CACHE_VALIDATION_CODE = "_$vc$_";
	public static final String CACHE_KEY_VALID_CODE_APP = "_$vcodeapp_";
	public static final String CACHE_KEY_ENTERPRISE = "_$ent_";
	/**
	 * 缓存用户登录次数
	 */
	public static final String USER_LOGIN_COUNT = "_$user_";

	/**
	 * 用户是否必须使用验证码
	 */
	public static final String USER_REQUIRE_VALID_CODE = "_$need_code_";

	public static final String CACHE_KEY_JOB_CATEGORY = "_$jc";

	public static SimpleDateFormat DF_YMD = new SimpleDateFormat("yyyy-MM-dd");
	public static SimpleDateFormat DF_LONG = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static String THIRD_PARTY_LOGIN_WEIBO_GETUID = "https://api.weibo.com/oauth2/get_token_info";

	public static String THIRD_PARTY_LOGIN_WEIBO = "https://api.weibo.com/2/users/show.json";

	public static String THIRD_PARTY_LOGIN_WECHAT = "https://api.weixin.qq.com/sns/userinfo";

	public static String WX_SMALLPROGRAM_LOGIN = "https://api.weixin.qq.com/sns/jscode2session";


	/**
	 * 积分等级
	 */
	public abstract class Point {
		public static final int POINT_1 = 1;
		public static final int POINT_2 = 2;
		public static final int POINT_3 = 5;
		public static final int POINT_4 = 10;
		public static final int POINT_5 = 30;
		public static final int POINT_6 = 100;
		public static final int POINT_7 = 200;
	}

	/**
	 * 默认头像
	 */
	public static String DEFAULT_AVATAR = "http://118.190.164.186/portal_pic/vip/defaultavatar.png";
	public static String DEFAULT_AVATAR_W = "http://118.190.164.186/portal_pic/vip/defaultavatar-w.png";

	/**
	 * 积分类型
	 */
	public static Integer COURSETYPE = 1;//课程
	public static Integer POSTTYPE = 2;//帖子
	public static Integer QUESTIONTYPE = 3;//问答
	public static Integer WORKTYPE = 4;//随堂练习
	public static Integer CATETYPE = 5;//入职分类
	public static Integer CLOCKTYPE = 6;//打卡

	/**
	 * 积分类型下子类型
	 */
	public static Integer SUBTYPEFIRST = 1;//课程视频播放(系列)/课程浏览（系列）/问答/发帖/作业/打卡提交
	public static Integer SUBTYPESECOND = 2;//问答回复/帖子回复
	public static Integer SUBTYPETHREE = 3;//问答点赞/帖子点赞
	public static Integer SUBTYPEFOUR = 4;//帖子精华
	public static Integer SUBTYPEFIVE = 5;//帖子置顶
	public static Integer SUBTYPESIX = 6;//课程视频播放（工具）/课程浏览（工具）/问答/发帖/作业/打卡提交
	public static Integer SUBTYPESEVEN = 7;//帖子回复的回复

	/**
	 * 积分对应分数
	 */
	public static Integer COURSE_SECTION_LEARNED_SERIAL = 10;//系列课程视频播放/课程浏览
	public static Integer COURSE_SECTION_LEARNED_TOOL = 3;//工具课程视频播放/课程浏览
	public static Integer QUESTION_SUBMMIT = 2;//问答提交
	public static Integer QUESTION_REPLY = 3;//问答回复
	public static Integer QUESTION_PRAISE = 1;//问答点赞
	public static Integer POST_SUBMIT = 10;//发帖
	public static Integer POST_REPLY = 3;//帖子回复
	public static Integer POST_REPLY_REPLY = 3;//帖子回复的回复
	public static Integer POST_TOP = 5;//帖子置顶
	public static Integer POST_ESSENCE = 5;//帖子精华
	public static Integer POST_PRAISE = 1;//帖子点赞
	public static Integer WORK_SUBMIT = 5;//随堂练习——提交
	public static Integer RESULT_SUBMIT_FEEDBACK = 100;//成果校验——提交并被反馈
	public static Integer CLOCK_SUBMIT = 10;//打卡

	/**
	 * 积分对应分数上限
	 */
	public static Integer COURSE_SECTION_LEARNED_DAYLIMIT = 100;//课程视频播放/课程浏览
	public static Integer QUESTION_SUBMMIT_DAYLIMIT = 10;//问答提交
	public static Integer QUESTION_REPLY_DAYLIMIT = 999999999;//问答回复
	public static Integer QUESTION_PRAISE_DAYLIMIT = 10;//问答点赞
	public static Integer POST_SUBMIT_DAYLIMIT = 50;//发帖
	public static Integer POST_REPLY_DAYLIMIT = 15;//帖子回复
	public static Integer POST_REPLY_REPLY_DAYLIMIT = 15;//帖子回复的回复
	public static Integer POST_TOP_DAYLIMIT = 999999999;//帖子置顶
	public static Integer POST_ESSENCE_DAYLIMIT = 999999999;//帖子精华
	public static Integer POST_PRAISE_DAYLIMIT = 10;//帖子点赞
	public static Integer WORK_SUBMIT_DAYLIMIT = 50;//随堂练习——提交
	public static Integer RESULT_SUBMIT_FEEDBACK_DAYLIMIT = 100;//成果校验——提交并被反馈
	public static Integer CLOCK_SUBMIT_DAYLIMIT = 30;//打卡
}
