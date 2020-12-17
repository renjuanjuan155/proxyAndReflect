package com.example.aopzhujie.util.upload;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.*;

/**
 * base64 图片上传
 *
 * @date created by huangzenglei 2017/6/8
 */
public class Base64Upload {

    /**
     * 将文件转成base64 字符串
     *
     * @param path 文件路径
     * @return
     * @throws Exception
     */
    public static String fileToBase64(String path) throws Exception {
        File file = new File(path);
        FileInputStream inputFile = new FileInputStream(file);
        byte[] buffer = new byte[(int) file.length()];
        inputFile.read(buffer);
        inputFile.close();
        return new BASE64Encoder().encode(buffer);
    }

    /**
     * 将base64字符解码保存文件
     *
     * @param base64Code
     * @param targetPath
     * @throws Exception
     */
    public static void base64ToFile(String base64Code, String targetPath)
            throws Exception {
        byte[] buffer = new BASE64Decoder().decodeBuffer(base64Code);
        FileOutputStream out = new FileOutputStream(targetPath);
        out.write(buffer);
        out.close();
    }

    /**
     * base64转inputStream
     *
     * @param base64string
     * @return
     */
    public static InputStream Base64ToInputStream(String base64string) {
        ByteArrayInputStream stream = null;
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] bytes1 = decoder.decodeBuffer(base64string);
            stream = new ByteArrayInputStream(bytes1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stream;
    }


    /**
     * base64转byte[]
     *
     * @param base64String
     * @return
     */
    public static byte[] Base64ToByte(String base64String) {
        byte[] bytes = null;
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            bytes = decoder.decodeBuffer(base64String);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bytes;
    }

    /**
     * byte转stream
     *
     * @param bytes
     * @return
     */
    public static InputStream ByteToInputStream(byte[] bytes) {
        ByteArrayInputStream stream = null;
        try {
            stream = new ByteArrayInputStream(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stream;
    }


    private static void writeToLocal(String destination, InputStream input)
            throws IOException {
        int index;
        byte[] bytes = new byte[1024];
        FileOutputStream downloadFile = new FileOutputStream(destination);
        while ((index = input.read(bytes)) != -1) {
            downloadFile.write(bytes, 0, index);
            downloadFile.flush();
        }
        downloadFile.close();
        input.close();
    }

   /* public static void main(String[] args) {
        try {
            String base64Code = fileToBase64("D:/test.png");
            System.out.println(base64Code);
            base64ToFile(base64Code, "D:/test1.png");

            InputStream is = Base64ToInputStream(base64Code);

//            FileType fileType = FileTypeUtils.getType(is);

            writeToLocal("d:/test2.png", is);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }*/
}
