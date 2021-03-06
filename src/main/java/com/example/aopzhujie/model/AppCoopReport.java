package com.example.aopzhujie.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AppCoopReport implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.dim_date_id
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private String dimDateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.channel_code
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private String channelCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.channel
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private String channel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.promo_type_code
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private String promoTypeCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.promo_type
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private String promoType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.offer_id
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private Integer offerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.dept
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private String dept;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.category
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private String category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.fineline
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private String fineline;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.upc
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private String upc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.upc_desc
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private String upcDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.city_code
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private String cityCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.city
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.store_id
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private Integer storeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.store_name
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private String storeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.cost_center
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private String costCenter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.discount_code
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private String discountCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.discount_type
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private String discountType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.vendor_nbr
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private String vendorNbr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.vendor_nbr9
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private String vendorNbr9;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.vendor_name
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private String vendorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.units
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private BigDecimal units;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.discount
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private BigDecimal discount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.merch_sales
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private BigDecimal merchSales;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.compensation_number
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private BigDecimal compensationNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.compensation_ratio
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private BigDecimal compensationRatio;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.compensation_total
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private BigDecimal compensationTotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_coop_report.update_time
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.dim_date_id
     *
     * @return the value of app_coop_report.dim_date_id
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public String getDimDateId() {
        return dimDateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withDimDateId(String dimDateId) {
        this.setDimDateId(dimDateId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.dim_date_id
     *
     * @param dimDateId the value for app_coop_report.dim_date_id
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setDimDateId(String dimDateId) {
        this.dimDateId = dimDateId == null ? null : dimDateId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.channel_code
     *
     * @return the value of app_coop_report.channel_code
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withChannelCode(String channelCode) {
        this.setChannelCode(channelCode);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.channel_code
     *
     * @param channelCode the value for app_coop_report.channel_code
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.channel
     *
     * @return the value of app_coop_report.channel
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public String getChannel() {
        return channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withChannel(String channel) {
        this.setChannel(channel);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.channel
     *
     * @param channel the value for app_coop_report.channel
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.promo_type_code
     *
     * @return the value of app_coop_report.promo_type_code
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public String getPromoTypeCode() {
        return promoTypeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withPromoTypeCode(String promoTypeCode) {
        this.setPromoTypeCode(promoTypeCode);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.promo_type_code
     *
     * @param promoTypeCode the value for app_coop_report.promo_type_code
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setPromoTypeCode(String promoTypeCode) {
        this.promoTypeCode = promoTypeCode == null ? null : promoTypeCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.promo_type
     *
     * @return the value of app_coop_report.promo_type
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public String getPromoType() {
        return promoType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withPromoType(String promoType) {
        this.setPromoType(promoType);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.promo_type
     *
     * @param promoType the value for app_coop_report.promo_type
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setPromoType(String promoType) {
        this.promoType = promoType == null ? null : promoType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.offer_id
     *
     * @return the value of app_coop_report.offer_id
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public Integer getOfferId() {
        return offerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withOfferId(Integer offerId) {
        this.setOfferId(offerId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.offer_id
     *
     * @param offerId the value for app_coop_report.offer_id
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.dept
     *
     * @return the value of app_coop_report.dept
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public String getDept() {
        return dept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withDept(String dept) {
        this.setDept(dept);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.dept
     *
     * @param dept the value for app_coop_report.dept
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.category
     *
     * @return the value of app_coop_report.category
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withCategory(String category) {
        this.setCategory(category);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.category
     *
     * @param category the value for app_coop_report.category
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.fineline
     *
     * @return the value of app_coop_report.fineline
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public String getFineline() {
        return fineline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withFineline(String fineline) {
        this.setFineline(fineline);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.fineline
     *
     * @param fineline the value for app_coop_report.fineline
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setFineline(String fineline) {
        this.fineline = fineline == null ? null : fineline.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.upc
     *
     * @return the value of app_coop_report.upc
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public String getUpc() {
        return upc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withUpc(String upc) {
        this.setUpc(upc);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.upc
     *
     * @param upc the value for app_coop_report.upc
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setUpc(String upc) {
        this.upc = upc == null ? null : upc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.upc_desc
     *
     * @return the value of app_coop_report.upc_desc
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public String getUpcDesc() {
        return upcDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withUpcDesc(String upcDesc) {
        this.setUpcDesc(upcDesc);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.upc_desc
     *
     * @param upcDesc the value for app_coop_report.upc_desc
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setUpcDesc(String upcDesc) {
        this.upcDesc = upcDesc == null ? null : upcDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.city_code
     *
     * @return the value of app_coop_report.city_code
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withCityCode(String cityCode) {
        this.setCityCode(cityCode);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.city_code
     *
     * @param cityCode the value for app_coop_report.city_code
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.city
     *
     * @return the value of app_coop_report.city
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withCity(String city) {
        this.setCity(city);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.city
     *
     * @param city the value for app_coop_report.city
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.store_id
     *
     * @return the value of app_coop_report.store_id
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withStoreId(Integer storeId) {
        this.setStoreId(storeId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.store_id
     *
     * @param storeId the value for app_coop_report.store_id
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.store_name
     *
     * @return the value of app_coop_report.store_name
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withStoreName(String storeName) {
        this.setStoreName(storeName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.store_name
     *
     * @param storeName the value for app_coop_report.store_name
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.cost_center
     *
     * @return the value of app_coop_report.cost_center
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withCostCenter(String costCenter) {
        this.setCostCenter(costCenter);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.cost_center
     *
     * @param costCenter the value for app_coop_report.cost_center
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter == null ? null : costCenter.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.discount_code
     *
     * @return the value of app_coop_report.discount_code
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public String getDiscountCode() {
        return discountCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withDiscountCode(String discountCode) {
        this.setDiscountCode(discountCode);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.discount_code
     *
     * @param discountCode the value for app_coop_report.discount_code
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode == null ? null : discountCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.discount_type
     *
     * @return the value of app_coop_report.discount_type
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public String getDiscountType() {
        return discountType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withDiscountType(String discountType) {
        this.setDiscountType(discountType);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.discount_type
     *
     * @param discountType the value for app_coop_report.discount_type
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setDiscountType(String discountType) {
        this.discountType = discountType == null ? null : discountType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.vendor_nbr
     *
     * @return the value of app_coop_report.vendor_nbr
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public String getVendorNbr() {
        return vendorNbr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withVendorNbr(String vendorNbr) {
        this.setVendorNbr(vendorNbr);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.vendor_nbr
     *
     * @param vendorNbr the value for app_coop_report.vendor_nbr
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setVendorNbr(String vendorNbr) {
        this.vendorNbr = vendorNbr == null ? null : vendorNbr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.vendor_nbr9
     *
     * @return the value of app_coop_report.vendor_nbr9
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public String getVendorNbr9() {
        return vendorNbr9;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withVendorNbr9(String vendorNbr9) {
        this.setVendorNbr9(vendorNbr9);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.vendor_nbr9
     *
     * @param vendorNbr9 the value for app_coop_report.vendor_nbr9
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setVendorNbr9(String vendorNbr9) {
        this.vendorNbr9 = vendorNbr9 == null ? null : vendorNbr9.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.vendor_name
     *
     * @return the value of app_coop_report.vendor_name
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withVendorName(String vendorName) {
        this.setVendorName(vendorName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.vendor_name
     *
     * @param vendorName the value for app_coop_report.vendor_name
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName == null ? null : vendorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.units
     *
     * @return the value of app_coop_report.units
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public BigDecimal getUnits() {
        return units;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withUnits(BigDecimal units) {
        this.setUnits(units);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.units
     *
     * @param units the value for app_coop_report.units
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setUnits(BigDecimal units) {
        this.units = units;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.discount
     *
     * @return the value of app_coop_report.discount
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withDiscount(BigDecimal discount) {
        this.setDiscount(discount);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.discount
     *
     * @param discount the value for app_coop_report.discount
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.merch_sales
     *
     * @return the value of app_coop_report.merch_sales
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public BigDecimal getMerchSales() {
        return merchSales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withMerchSales(BigDecimal merchSales) {
        this.setMerchSales(merchSales);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.merch_sales
     *
     * @param merchSales the value for app_coop_report.merch_sales
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setMerchSales(BigDecimal merchSales) {
        this.merchSales = merchSales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.compensation_number
     *
     * @return the value of app_coop_report.compensation_number
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public BigDecimal getCompensationNumber() {
        return compensationNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withCompensationNumber(BigDecimal compensationNumber) {
        this.setCompensationNumber(compensationNumber);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.compensation_number
     *
     * @param compensationNumber the value for app_coop_report.compensation_number
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setCompensationNumber(BigDecimal compensationNumber) {
        this.compensationNumber = compensationNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.compensation_ratio
     *
     * @return the value of app_coop_report.compensation_ratio
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public BigDecimal getCompensationRatio() {
        return compensationRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withCompensationRatio(BigDecimal compensationRatio) {
        this.setCompensationRatio(compensationRatio);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.compensation_ratio
     *
     * @param compensationRatio the value for app_coop_report.compensation_ratio
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setCompensationRatio(BigDecimal compensationRatio) {
        this.compensationRatio = compensationRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.compensation_total
     *
     * @return the value of app_coop_report.compensation_total
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public BigDecimal getCompensationTotal() {
        return compensationTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withCompensationTotal(BigDecimal compensationTotal) {
        this.setCompensationTotal(compensationTotal);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.compensation_total
     *
     * @param compensationTotal the value for app_coop_report.compensation_total
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setCompensationTotal(BigDecimal compensationTotal) {
        this.compensationTotal = compensationTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_coop_report.update_time
     *
     * @return the value of app_coop_report.update_time
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public AppCoopReport withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_coop_report.update_time
     *
     * @param updateTime the value for app_coop_report.update_time
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_coop_report
     *
     * @mbg.generated Mon Feb 01 16:49:58 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dimDateId=").append(dimDateId);
        sb.append(", channelCode=").append(channelCode);
        sb.append(", channel=").append(channel);
        sb.append(", promoTypeCode=").append(promoTypeCode);
        sb.append(", promoType=").append(promoType);
        sb.append(", offerId=").append(offerId);
        sb.append(", dept=").append(dept);
        sb.append(", category=").append(category);
        sb.append(", fineline=").append(fineline);
        sb.append(", upc=").append(upc);
        sb.append(", upcDesc=").append(upcDesc);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", city=").append(city);
        sb.append(", storeId=").append(storeId);
        sb.append(", storeName=").append(storeName);
        sb.append(", costCenter=").append(costCenter);
        sb.append(", discountCode=").append(discountCode);
        sb.append(", discountType=").append(discountType);
        sb.append(", vendorNbr=").append(vendorNbr);
        sb.append(", vendorNbr9=").append(vendorNbr9);
        sb.append(", vendorName=").append(vendorName);
        sb.append(", units=").append(units);
        sb.append(", discount=").append(discount);
        sb.append(", merchSales=").append(merchSales);
        sb.append(", compensationNumber=").append(compensationNumber);
        sb.append(", compensationRatio=").append(compensationRatio);
        sb.append(", compensationTotal=").append(compensationTotal);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}