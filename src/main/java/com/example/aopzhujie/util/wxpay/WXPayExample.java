package com.example.aopzhujie.util.wxpay;

import com.example.aopzhujie.config.ShujujiaWxPayConfig;
import com.github.wxpay.sdk.WXPay;

import java.util.HashMap;
import java.util.Map;

/**
 * 微信支付测试类
 * Created by zhanghai on 2017/10/27.
 */
public class WXPayExample {


    /**
     * 作用：统一下单<br>
     * 场景：公共号支付、扫码支付、APP支付
     * <p>
     * JSAPI--公众号支付、NATIVE--原生扫码支付、APP--app支付
     *
     * @return API返回数据
     * @throws Exception
     */
    public static void unifiedOrder() throws Exception {
        ShujujiaWxPayConfig config = new ShujujiaWxPayConfig();
        config.setAppID("wx09e23f217d77502f");
        config.setMchID("1489140422");
        config.setKey("lovedataWYXLLS1029384523LOVEDATA");

        WXPay wxpay = new WXPay(config);

        Map<String, String> data = new HashMap<String, String>();
        // 商品描述 必填 浏览器打开的网站主页title名 -商品概述
        data.put("body", "数据家");
        // 商户订单号 必填 商户系统内部订单号，要求32个字符内，只能是数字、大小写字母_-|*@ ，且在同一个商户号下唯一。
        data.put("out_trade_no", "2016090910595900000012");
        data.put("device_info", "");
        // 标价币种 非必填 符合ISO 4217标准的三位字母代码，默认人民币：CNY
        data.put("fee_type", "CNY");
        //  标价金额 必填 订单总金额，单位为分
        data.put("total_fee", "1"); //金额单位 分
        // 终端IP 必填 APP和网页支付提交用户端ip，Native支付填调用微信支付API的机器IP
        data.put("spbill_create_ip", "118.190.165.121");
        // 通知地址 必填 异步接收微信支付结果通知的回调地址，通知url必须为外网可访问的url，不能携带参数。
        data.put("notify_url", "http://pay.lovedata.cn/pay/wxPayNofiy");
        // 交易类型 必填 取值如下：JSAPI，NATIVE，APP
        data.put("trade_type", "NATIVE");  // 此处指定为扫码支付
        // 商品ID 非必填 trade_type=NATIVE时（即扫码支付），此参数必传。此参数为二维码中包含的商品ID，商户自行定义。
        data.put("product_id", "12");

        try {
            Map<String, String> resp = wxpay.unifiedOrder(data);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 订单查询
     *
     * @throws Exception
     */
    public static void orderQuery() throws Exception {
        ShujujiaWxPayConfig config = new ShujujiaWxPayConfig();
        WXPay wxpay = new WXPay(config);

        Map<String, String> data = new HashMap<String, String>();
        data.put("out_trade_no", "2016090910595900000012");

        try {
            Map<String, String> resp = wxpay.orderQuery(data);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 退款查询
     *
     * @throws Exception
     */
    public static void refundQuery() throws Exception {
        ShujujiaWxPayConfig config = new ShujujiaWxPayConfig();
        WXPay wxpay = new WXPay(config);

        Map<String, String> data = new HashMap<String, String>();
        data.put("out_trade_no", "2016090910595900000012");

        try {
            Map<String, String> resp = wxpay.refundQuery(data);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        unifiedOrder();

    }

}
