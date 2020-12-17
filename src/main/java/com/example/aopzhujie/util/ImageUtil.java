package com.example.aopzhujie.util;

import net.coobird.thumbnailator.Thumbnails;
import org.springframework.stereotype.Component;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by kinson on 2018/8/3.
 */
@Component
public class ImageUtil {

    /**
     * 指定比例压缩图片
     * @param imageStream
     * @param imgType
     * @param rate
     * @return
     * @throws IOException
     */
    public static InputStream compressImageByRate(InputStream imageStream,String imgType,Float rate) throws IOException {
        //使用组件,按比例压缩图片
        BufferedImage tag = Thumbnails.of(imageStream).scale(rate).asBufferedImage();
        //将压缩后的图片转成inputStre,并返回
        return imageToStream(tag,imgType);
    }

    /**
     * 指定大小压缩图片
     * @param imageStream
     * @param imgType
     * @param width
     * @param height
     * @return
     * @throws IOException
     */
    public static InputStream compressImageBySize(InputStream imageStream,String imgType,int width,int height) throws IOException {
        //使用组件,按指定大小压缩图片
        BufferedImage tag = Thumbnails.of(imageStream).size(width,height).asBufferedImage();
        //将压缩后的图片转成inputStre,并返回
        return imageToStream(tag,imgType);
    }


    /**
     * 将BufferedImage转成InputStream
     * @param image
     * @param imgType
     * @return
     */
    public static InputStream imageToStream(BufferedImage image,String imgType) throws IOException {
        InputStream inputStream =null;

        BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null),    BufferedImage.TYPE_INT_RGB);
        //bufferedImage is the RenderedImage to be written
        Graphics2D g2 = bufferedImage.createGraphics();
        g2.drawImage(image, null, null);

        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage, imgType, outStream);
        inputStream = new ByteArrayInputStream(outStream.toByteArray());


        return inputStream;
    }

    /**
     * 通过图片url读取图片的inputStream
     * @param urlStr
     * @return
     */
    public InputStream getImageBySrcUrl(String urlStr) {
        InputStream imageInputStream =null;
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(urlStr);
            BufferedImage image = ImageIO.read(url);
            imageInputStream = imageToStream(image,"jpg");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageInputStream;
    }

    /**
     * 根据原图url获取压缩图的inputStream
     * @param srcUrl
     * @param width
     * @param height
     * @return
     * @throws IOException
     */
    public InputStream getSmallImageBySrcUrl(String srcUrl,int width,int height) throws IOException {
        InputStream smallImage = null;
        //通过URL获取原图
        InputStream originalImage =  this.getImageBySrcUrl(srcUrl);
        if(originalImage!=null){
            //压缩原图获得略缩图
            smallImage = this.compressImageBySize(originalImage,"jpg",width,height);
        }else{
            //原图资源获取失败
        }
        //返回略缩图流
        return smallImage;
    }

}
