package com.example.aopzhujie.certificate;

import com.example.aopzhujie.config.Constants;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

/**
 * @Description
 * @Date 2020/12/31 11:32
 * @Created by meijunjie
 */
public class PdfTest {

    public static String generateCode(String codeUrl, Integer userId, String userName) {
        Font font = new Font("微软雅黑", Font.PLAIN, 30);// 添加字体的属性设置

        String projectUrl = "D:\\pdf\\" ;
        String imgName = projectUrl + userId + ".png";
        try {
            // 加载本地图片
            String imageLocalUrl = "D:\\pdf\\牟欣.jpg";
            BufferedImage imageLocal = ImageIO.read(new File(imageLocalUrl));
            // 加载用户的二维码
            BufferedImage imageCode = ImageIO.read(new URL(codeUrl));
            // 以本地图片为模板
            Graphics2D g = imageLocal.createGraphics();
            // 在模板上添加用户二维码(地址,左边距,上边距,图片宽度,图片高度,未知)
            g.drawImage(imageCode, 575, imageLocal.getHeight() - 500, 350, 350, null);
            // 设置文本样式
            g.setFont(font);
            g.setColor(Color.BLACK);
            // 截取用户名称的最后一个字符
            String lastChar = userName.substring(userName.length() - 1);
            // 拼接新的用户名称
            String newUserName = userName.substring(0, 1) + "**" + lastChar + " 的邀请二维码";
            // 添加用户名称
            g.drawString(newUserName, 620, imageLocal.getHeight() - 530);
            // 完成模板修改
            g.dispose();
            // 获取新文件的地址
            File outputfile = new File(imgName);
            // 生成新的合成过的用户二维码并写入新图片
            ImageIO.write(imageLocal, "png", outputfile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 返回给页面的图片地址(因为绝对路径无法访问)
        imgName = Constants.PROJECT_URL + "codeImg/" + userId + ".png";

        return imgName;
    }

    public static void main(String[] args) {
        PdfTest pdfTest = new PdfTest();
        String codeUrl = "D:\\pdf\\牟欣.jpg";
        Integer userId = 111;
        String userName = "yoyo";
        PdfTest.generateCode(codeUrl,userId,userName);
    }
}
