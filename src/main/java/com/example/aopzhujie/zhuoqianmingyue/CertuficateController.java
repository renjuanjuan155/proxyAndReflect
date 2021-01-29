package com.example.aopzhujie.zhuoqianmingyue;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

/**
 * @Description
 * @Date 2021/1/6 19:43
 * @Created by meijunjie
 */
@RestController
@RequestMapping("/download")
public class CertuficateController {

    //在页面直接下载图片
    @RequestMapping(value = "/certificate",method = RequestMethod.GET)
    public void getCertificate(@RequestParam("userId") Long userId, HttpServletResponse response) throws UnsupportedEncodingException {


        String imgPath = "http://img.lovedata.cn/portal_pic/item/6f485aa88eea4409bce90b849ccead4a.png";

        File file = new File(imgPath);
        response.setHeader("Content-Disposition",
                String.format("attachment;filename=%s", URLEncoder.encode(String.valueOf(userId)+".png", "utf-8")));
        response.setContentType("application/octet-stream");

        try {
            BufferedOutputStream bufferOut = new BufferedOutputStream(response.getOutputStream());
            BufferedInputStream bufferedIn = new BufferedInputStream(new FileInputStream(file));

            int length ;
            byte[] buffer = new byte[1024 * 10];
            while ((length = bufferedIn.read(buffer)) > -1) {
                bufferOut.write(buffer, 0, length);
            }
            bufferOut.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @RequestMapping(value = "/down",method = RequestMethod.GET)
    public String get(){
        return "http://img.lovedata.cn/portal_pic/item/6f485aa88eea4409bce90b849ccead4a.png";
    }

    //直接返回图片在网页显示
    @RequestMapping(value = "/image/get")
    public void getImage(HttpServletRequest request, HttpServletResponse response) {
        FileInputStream fis = null;
        response.setContentType("image/gif");
        try {
            OutputStream out = response.getOutputStream();
            File file = new File("D:/pdf"+File.separator+"牟欣.jpg");
            fis = new FileInputStream(file);
            byte[] b = new byte[fis.available()];
            fis.read(b);
            out.write(b);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
