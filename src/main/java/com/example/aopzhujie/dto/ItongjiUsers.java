package com.example.aopzhujie.dto;


import java.util.Date;

/**
 * 前台用户表
 *
 * @author zhanghai
 * @email walk_hai@163.com
 * @date 2017-09-29 16:06:08
 */
public class ItongjiUsers {
    //主键
    private Long id;

    //职称（例如：特邀认证作者）
    private String title;

    //机构
    private String organization;


    //微信小程序会话密钥
    private String wxSpUserSessionKey;


    //学位
    private String degree;

    //说明
    private String remark;

    //创建人
    private Long creater;

    //创建时间
    private String createTime;

    //修改人
    private Long modifier;

    //修改时间
    private String modifyTime;

    //启用,禁用(0启用，1禁用)
    private Long disabled;

    //版本号
    private Long version;

    //身份证号
    private String idCard;

    //用户头衔
    private String userTitle;






    //1、启用 0、禁用
    private String status;
    //姓名
    private String name;
    //密码
    private String pwd;
    //真实姓名
    private String trueName;
    //昵称
    private String nickName;
    //简介
    private String introduction;
    //头像
    private String avatar;
    //是否第三方会员
    private String isThirdSite;
    /**第三方会员类型 -3新浪，-2 微信，-1qq  */
    private Integer thirdSiteUserType;
    //微信小程序密钥
    private String wxSpUserSessioKey;
    //第三方会员Id
    private String thirdSiteUserId;
    //第三方会员Id
    private String thirdSiteOpenId;
    //邮箱
    private String email;
    //01:已绑定 02:未绑定
    private String emailBind;
    //验证码
    private String emailBindCode;
    //所在公司，工作单位
    private String company;
    //职位
    private String career;
    //用户类型 01、普通用户 02、加V认证用户 03、加V专栏权限用户 04、加V活动权限用户 05、加V所有权限用户 06、主持人用户 07、嘉宾用户
    private String type;
    //名片图片url
    private String cardUrl;
    //名片上传时间
    private Date cardUploadTime;
    //名片审核时间
    private Date cardVerifyTime;
    //名片审核状态 0、认证未通过 1、认证通过 2、未认证 3、申请认证
    private String cardVerifyStatus;
    //名片审核状态说明
    private String cardVerifyNote;
    //省
    private String province;
    //市
    private String city;
    //区县
    private String county;
    //地址
    private String address;
    //邮编
    private String zip;
    //电话
    private String tel;
    //手机
    private String mobile;
    //性别
    private String sex;
    //生日
    private Date birthday;
    //是否接受短信 0、是 1、否'
    private String isReceiveMsg;
    //是否启用 0、是 1、否'
    private String isEnable;
    //是否注销 0、是 1、否
    private String isCanceled;
    //是否黑名单 0、是 1、否
    private String isBlackUser;
    //企业ID
    private Integer enterpriseId;
    
    private String contactMobile;

    //微信号
    private String wechat;

    private String industryId;

    private Long qqNum;

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getWxSpUserSessionKey() {
        return wxSpUserSessionKey;
    }

    public void setWxSpUserSessionKey(String wxSpUserSessionKey) {
        this.wxSpUserSessionKey = wxSpUserSessionKey;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getCreater() {
        return creater;
    }

    public void setCreater(Long creater) {
        this.creater = creater;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Long getModifier() {
        return modifier;
    }

    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getDisabled() {
        return disabled;
    }

    public void setDisabled(Long disabled) {
        this.disabled = disabled;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    /**
     * 设置：1、启用 0、禁用
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取：1、启用 0、禁用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置：姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置：密码
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 获取：密码
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置：真实姓名
     */
    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    /**
     * 获取：真实姓名
     */
    public String getTrueName() {
        return trueName;
    }

    /**
     * 设置：昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取：昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置：头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取：头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置：是否第三方会员
     */
    public void setIsThirdSite(String isThirdSite) {
        this.isThirdSite = isThirdSite;
    }

    /**
     * 获取：是否第三方会员
     */
    public String getIsThirdSite() {
        return isThirdSite;
    }

    /**
     * 设置：第三方会员类型
     */
    public void setThirdSiteUserType(Integer thirdSiteUserType) {
        this.thirdSiteUserType = thirdSiteUserType;
    }

    /**
     * 获取：第三方会员类型
     */
    public Integer getThirdSiteUserType() {
        return thirdSiteUserType;
    }

    /**
     * 设置：第三方会员Id
     */
    public void setThirdSiteUserId(String thirdSiteUserId) {
        this.thirdSiteUserId = thirdSiteUserId;
    }

    public String getWxSpUserSessioKey() {
        return wxSpUserSessioKey;
    }

    public void setWxSpUserSessioKey(String wxSpUserSessioKey) {
        this.wxSpUserSessioKey = wxSpUserSessioKey;
    }

    /**
     * 获取：第三方会员Id
     */
    public String getThirdSiteUserId() {
        return thirdSiteUserId;
    }

    /**
     * 设置：邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取：邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置：01:已绑定 02:未绑定
     */
    public void setEmailBind(String emailBind) {
        this.emailBind = emailBind;
    }

    /**
     * 获取：01:已绑定 02:未绑定
     */
    public String getEmailBind() {
        return emailBind;
    }

    /**
     * 设置：验证码
     */
    public void setEmailBindCode(String emailBindCode) {
        this.emailBindCode = emailBindCode;
    }

    /**
     * 获取：验证码
     */
    public String getEmailBindCode() {
        return emailBindCode;
    }

    /**
     * 设置：所在公司，工作单位
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 获取：所在公司，工作单位
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置：职位
     */
    public void setCareer(String career) {
        this.career = career;
    }

    /**
     * 获取：职位
     */
    public String getCareer() {
        return career;
    }

    /**
     * 设置：用户类型 01、普通用户 02、加V认证用户 03、加V专栏权限用户 04、加V活动权限用户 05、加V所有权限用户 06、主持人用户 07、嘉宾用户
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取：用户类型 01、普通用户 02、加V认证用户 03、加V专栏权限用户 04、加V活动权限用户 05、加V所有权限用户 06、主持人用户 07、嘉宾用户
     */
    public String getType() {
        return type;
    }

    /**
     * 设置：名片图片url
     */
    public void setCardUrl(String cardUrl) {
        this.cardUrl = cardUrl;
    }

    /**
     * 获取：名片图片url
     */
    public String getCardUrl() {
        return cardUrl;
    }

    /**
     * 设置：名片上传时间
     */
    public void setCardUploadTime(Date cardUploadTime) {
        this.cardUploadTime = cardUploadTime;
    }

    /**
     * 获取：名片上传时间
     */
    public Date getCardUploadTime() {
        return cardUploadTime;
    }

    /**
     * 设置：名片审核时间
     */
    public void setCardVerifyTime(Date cardVerifyTime) {
        this.cardVerifyTime = cardVerifyTime;
    }

    /**
     * 获取：名片审核时间
     */
    public Date getCardVerifyTime() {
        return cardVerifyTime;
    }

    /**
     * 设置：名片审核状态 0、认证未通过 1、认证通过 2、未认证 3、申请认证
     */
    public void setCardVerifyStatus(String cardVerifyStatus) {
        this.cardVerifyStatus = cardVerifyStatus;
    }

    /**
     * 获取：名片审核状态 0、认证未通过 1、认证通过 2、未认证 3、申请认证
     */
    public String getCardVerifyStatus() {
        return cardVerifyStatus;
    }

    /**
     * 设置：名片审核状态说明
     */
    public void setCardVerifyNote(String cardVerifyNote) {
        this.cardVerifyNote = cardVerifyNote;
    }

    /**
     * 获取：名片审核状态说明
     */
    public String getCardVerifyNote() {
        return cardVerifyNote;
    }

    /**
     * 设置：省
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取：省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置：市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取：市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置：区县
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * 获取：区县
     */
    public String getCounty() {
        return county;
    }

    /**
     * 设置：地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取：地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置：邮编
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * 获取：邮编
     */
    public String getZip() {
        return zip;
    }

    /**
     * 设置：电话
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取：电话
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置：手机
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取：手机
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置：性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取：性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置：生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取：生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置：是否接受短信 0、是 1、否'
     */
    public void setIsReceiveMsg(String isReceiveMsg) {
        this.isReceiveMsg = isReceiveMsg;
    }

    /**
     * 获取：是否接受短信 0、是 1、否'
     */
    public String getIsReceiveMsg() {
        return isReceiveMsg;
    }

    /**
     * 设置：是否启用 0、是 1、否'
     */
    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable;
    }

    /**
     * 获取：是否启用 0、是 1、否'
     */
    public String getIsEnable() {
        return isEnable;
    }

    /**
     * 设置：是否注销 0、是 1、否
     */
    public void setIsCanceled(String isCanceled) {
        this.isCanceled = isCanceled;
    }

    /**
     * 获取：是否注销 0、是 1、否
     */
    public String getIsCanceled() {
        return isCanceled;
    }

    /**
     * 设置：是否黑名单 0、是 1、否
     */
    public void setIsBlackUser(String isBlackUser) {
        this.isBlackUser = isBlackUser;
    }

    /**
     * 获取：是否黑名单 0、是 1、否
     */
    public String getIsBlackUser() {
        return isBlackUser;
    }

    /**
     * 设置：企业ID
     */
    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * 获取：企业ID
     */
    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getThirdSiteOpenId() {
        return thirdSiteOpenId;
    }

    public void setThirdSiteOpenId(String thirdSiteOpenId) {
        this.thirdSiteOpenId = thirdSiteOpenId;
    }

    public String getIndustryId() {
        return industryId;
    }

    public void setIndustryId(String industryId) {
        this.industryId = industryId;
    }

    public Long getQqNum() {
        return qqNum;
    }

    public void setQqNum(Long qqNum) {
        this.qqNum = qqNum;
    }

}
