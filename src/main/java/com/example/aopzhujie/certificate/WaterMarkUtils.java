package com.example.aopzhujie.certificate;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;

/**
 * @Description
 * @Date 2020/12/31 16:25
 * @Created by meijunjie
 */
public class WaterMarkUtils {
    /**
     * @param srcImgPath 源图片路径
     * @param tarImgPath 保存的图片路径
     * @param waterMarkContent 水印内容
     * @param markContentColor 水印颜色
     * @param font 水印字体
     */
    public void addWaterMark(String srcImgPath, String tarImgPath, String waterMarkContent,String waterMarkContentTime,Color markContentColor,
                             Color markContentColorTime,Font font) {

        try {
            // 读取原图片信息
            File srcImgFile = new File(srcImgPath);//得到文件
            Image srcImg = ImageIO.read(srcImgFile);//文件转化为图片
            int srcImgWidth = srcImg.getWidth(null);//获取图片的宽
            int srcImgHeight = srcImg.getHeight(null);//获取图片的高



            // 加水印(姓名)
            BufferedImage bufImg = new BufferedImage(srcImgWidth, srcImgHeight, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = bufImg.createGraphics();
            g.drawImage(srcImg, 0, 0, srcImgWidth, srcImgHeight, null);
            g.setColor(markContentColor); //根据图片的背景设置水印颜色
            g.setFont(font);              //设置字体
            //设置水印的坐标
            int x = srcImgWidth - 5*getWatermarkLength(waterMarkContent, g);
            double y = srcImgHeight - 4.6*getWatermarkLength(waterMarkContent, g);
            g.drawString(waterMarkContent, x, (float) y);  //画出水印
            // 完成模板修改
            g.dispose();
            // 输出图片
            FileOutputStream outImgStream = new FileOutputStream(tarImgPath);
            ImageIO.write(bufImg, "jpg", outImgStream);
            outImgStream.flush();
            outImgStream.close();
            System.out.println("添加水印完成");

            ///加水印时间
            BufferedImage bufImgTime = new BufferedImage(srcImgWidth, srcImgHeight, BufferedImage.TYPE_INT_RGB);
            Graphics2D gTime = bufImgTime.createGraphics();
            gTime.drawImage(srcImg, 0, 0, srcImgWidth, srcImgHeight, null);
            gTime.setColor(markContentColorTime); //根据图片的背景设置水印颜色
            gTime.setFont(font);              //设置字体
            //设置水印的坐标
            int xTime = srcImgWidth - 4*getWatermarkLength(waterMarkContentTime, gTime);
            int yTime = srcImgHeight - 1*getWatermarkLength(waterMarkContentTime, gTime);
            gTime.drawString(waterMarkContentTime, xTime, yTime);  //画出水印
            gTime.dispose();
            FileOutputStream outImgStreamTime = new FileOutputStream(tarImgPath);
            ImageIO.write(bufImgTime, "jpg", outImgStream);
            System.out.println("添加水印完成2");

            outImgStreamTime.flush();
            outImgStreamTime.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public int getWatermarkLength(String waterMarkContent, Graphics2D g) {
        return g.getFontMetrics(g.getFont()).charsWidth(waterMarkContent.toCharArray(), 0, waterMarkContent.length());
    }
    public static void main(String[] args) {
        Font font = new Font("华文隶书", Font.PLAIN, 135);                     //水印字体
        String srcImgPath="D:/pdf/牟欣.jpg"; //源图片地址
        String tarImgPath="D:/pdf/牟欣5.jpg"; //待存储的地址
        String waterMarkContentName="牟欣";  //水印内容姓名
        String waterMarkContentTime="2020/12/12";//水印内容时间
        String waterMarkContentCourse="数据分析就业班";//水印内容课程名称
        Color color=new Color(255,0,0,128);
        Color color2=new Color(255,1,0,128); //水印图片色彩以及透明度
        new WaterMarkUtils().addWaterMark(srcImgPath, tarImgPath, waterMarkContentName,waterMarkContentTime, color,color2,font);

    }
}
