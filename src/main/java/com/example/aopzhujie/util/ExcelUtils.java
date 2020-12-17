package com.example.aopzhujie.util;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.xssf.usermodel.*;

import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

/**
 * author:hezhiqiang
 * Date:2019/7/12 14:36
 * remark:
 */
public class ExcelUtils {

    /**
     * 样式
     * @param xssfWorkbook
     * @param alignment
     * @param fontSize
     * @param isBold
     * @param fontColor
     * @param BackgroundColor
     * @param isBoder
     * @return
     */
    public static XSSFCellStyle createStyle(XSSFWorkbook xssfWorkbook, HorizontalAlignment alignment, Short fontSize, Boolean isBold, XSSFColor fontColor, XSSFColor BackgroundColor, Boolean isBoder) {
        XSSFCellStyle style = xssfWorkbook.createCellStyle();
        style.setAlignment(alignment);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        //创建字体
        XSSFFont font = xssfWorkbook.createFont();
        font.setFontHeightInPoints(fontSize);
        if (null != fontColor) {
            font.setColor(fontColor);
        }
        font.setBold(isBold);
        style.setFont(font);
        //设置背景
        if (null != BackgroundColor) {
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            style.setFillForegroundColor(BackgroundColor);
        }
        if (isBoder) {
            //四周边框
            style.setBorderBottom((short)1);
            style.setBorderLeft((short)1);
            style.setBorderRight((short)1);
            style.setBorderTop((short)1);
        }
        //自动换行
        style.setWrapText(true);
        return style;
    }

    /**
     * 创建CRM学员跟进信息Excel
     * @param list
     * @param response
     */
    public static void exportCrmStudentsToExcel(List<Map<String, Object>> list, HttpServletResponse response) {
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        OutputStream out = null;
        try {
            //EXCEL表格颜色
            XSSFColor b1 = new XSSFColor(new Color(247, 247, 247));
            XSSFColor b2 = new XSSFColor(new Color(234, 242, 242));
            XSSFColor f1 = new XSSFColor(new Color(33, 129, 210));
            XSSFColor f2 = new XSSFColor(new Color(255, 0, 0));
            //表头样式
            XSSFCellStyle headStyle = createStyle(xssfWorkbook, HorizontalAlignment.CENTER, (short)10, true, null, null, true);
            //内容样式
            XSSFCellStyle bodyStyle = createStyle(xssfWorkbook, HorizontalAlignment.CENTER, (short)10, false, null, null, true);
            //2.创建工作表
            XSSFSheet sheet = xssfWorkbook.createSheet("sheet1");
            //3.创建行
            XSSFRow row = sheet.createRow(0);
            //表头
            XSSFCell nameCell = row.createCell(0);
            nameCell.setCellValue("姓名");
            nameCell.setCellStyle(headStyle);
            XSSFCell sexCell = row.createCell(1);
            sexCell.setCellValue("性别");
            sexCell.setCellStyle(headStyle);
            XSSFCell birthDateCell = row.createCell(2);
            birthDateCell.setCellValue("出生日期");
            birthDateCell.setCellStyle(headStyle);
            XSSFCell phoneCell = row.createCell(3);
            phoneCell.setCellValue("手机号");
            phoneCell.setCellStyle(headStyle);
            XSSFCell attrCell = row.createCell(4);
            attrCell.setCellValue("属性");
            attrCell.setCellStyle(headStyle);
            XSSFCell regDateCell = row.createCell(5);
            regDateCell.setCellValue("报名时间");
            regDateCell.setCellStyle(headStyle);
            XSSFCell classesCell = row.createCell(6);
            classesCell.setCellValue("班级");
            classesCell.setCellStyle(headStyle);
            XSSFCell statusCell = row.createCell(7);
            statusCell.setCellValue("状态");
            statusCell.setCellStyle(headStyle);
            XSSFCell areaNameCell = row.createCell(8);
            areaNameCell.setCellValue("目前所在地");
            areaNameCell.setCellStyle(headStyle);
            XSSFCell curAddressCell = row.createCell(9);
            curAddressCell.setCellValue("求职意向地区");
            curAddressCell.setCellStyle(headStyle);
            XSSFCell recAddressCell = row.createCell(10);
            recAddressCell.setCellValue("收货地址");
            recAddressCell.setCellStyle(headStyle);
            XSSFCell weixinNumberCell = row.createCell(11);
            weixinNumberCell.setCellValue("微信号");
            weixinNumberCell.setCellStyle(headStyle);
            XSSFCell qqCell = row.createCell(12);
            qqCell.setCellValue("QQ号");
            qqCell.setCellStyle(headStyle);
            XSSFCell cctalkUserCell = row.createCell(13);
            cctalkUserCell.setCellValue("CCtalk用户名");
            cctalkUserCell.setCellStyle(headStyle);
            XSSFCell educationCell = row.createCell(14);
            educationCell.setCellValue("学历");
            educationCell.setCellStyle(headStyle);
            XSSFCell schoolCell = row.createCell(15);
            schoolCell.setCellValue("毕业院校");
            schoolCell.setCellStyle(headStyle);
            XSSFCell majorCell = row.createCell(16);
            majorCell.setCellValue("专业");
            majorCell.setCellStyle(headStyle);
            XSSFCell companyCell = row.createCell(17);
            companyCell.setCellValue("当前公司");
            companyCell.setCellStyle(headStyle);
            XSSFCell salaryCell = row.createCell(18);
            salaryCell.setCellValue("当前薪资");
            salaryCell.setCellStyle(headStyle);
            XSSFCell usernameCell = row.createCell(19);
            usernameCell.setCellValue("跟进负责人");
            usernameCell.setCellStyle(headStyle);
            XSSFCell expectCell = row.createCell(20);
            expectCell.setCellValue("学习期望");
            expectCell.setCellStyle(headStyle);
            XSSFCell recordNumCell = row.createCell(21);
            recordNumCell.setCellValue("沟通次数");
            recordNumCell.setCellStyle(headStyle);
            XSSFCell lastPlanContentCell = row.createCell(22);
            lastPlanContentCell.setCellValue("最近一次沟通计划");
            lastPlanContentCell.setCellStyle(headStyle);
            XSSFCell lastRecordContentCell = row.createCell(23);
            lastRecordContentCell.setCellValue("最近一次沟通内容");
            lastRecordContentCell.setCellStyle(headStyle);
            
            int rowNum = 1;
            if(list.size() > 0){
                for (int i = 0; i < list.size(); i++) {
                    XSSFRow rows = sheet.createRow(rowNum);
                    XSSFCell cells = rows.createCell(0);
                    cells.setCellValue(null == list.get(i).get("name") ? "" : String.valueOf(list.get(i).get("name")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(1);
                    cells.setCellValue(null == list.get(i).get("sexStr") ? "" : String.valueOf(list.get(i).get("sexStr")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(2);
                    cells.setCellValue(null == list.get(i).get("birthDate") ? "" : String.valueOf(list.get(i).get("birthDate")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(3);
                    cells.setCellValue(null == list.get(i).get("phoneNumber") ? "" : String.valueOf(list.get(i).get("phoneNumber")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(4);
                    cells.setCellValue(null == list.get(i).get("attribute") ? "" : String.valueOf(list.get(i).get("attribute")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(5);
                    cells.setCellValue(null == list.get(i).get("regDate") ? "" : String.valueOf(list.get(i).get("regDate")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(6);
                    cells.setCellValue(null == list.get(i).get("classes") ? "" : String.valueOf(list.get(i).get("classes")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(7);
                    cells.setCellValue(null == list.get(i).get("statusStr") ? "" : String.valueOf(list.get(i).get("statusStr")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(8);
                    cells.setCellValue(null == list.get(i).get("areaName") ? "" : String.valueOf(list.get(i).get("areaName")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(9);
                    cells.setCellValue(null == list.get(i).get("curAddress") ? "" : String.valueOf(list.get(i).get("curAddress")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(10);
                    cells.setCellValue(null == list.get(i).get("recAddress") ? "" : String.valueOf(list.get(i).get("recAddress")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(11);
                    cells.setCellValue(null == list.get(i).get("weixinNumber") ? "" : String.valueOf(list.get(i).get("weixinNumber")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(12);
                    cells.setCellValue(null == list.get(i).get("qq") ? "" : String.valueOf(list.get(i).get("qq")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(13);
                    cells.setCellValue(null == list.get(i).get("cctalkUser") ? "" : String.valueOf(list.get(i).get("cctalkUser")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(14);
                    cells.setCellValue(null == list.get(i).get("education") ? "" : String.valueOf(list.get(i).get("education")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(15);
                    cells.setCellValue(null == list.get(i).get("school") ? "" : String.valueOf(list.get(i).get("school")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(16);
                    cells.setCellValue(null == list.get(i).get("major") ? "" : String.valueOf(list.get(i).get("major")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(17);
                    cells.setCellValue(null == list.get(i).get("company") ? "" : String.valueOf(list.get(i).get("company")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(18);
                    cells.setCellValue(null == list.get(i).get("salary") ? "" : String.valueOf(list.get(i).get("salary")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(19);
                    cells.setCellValue(null == list.get(i).get("username") ? "" : String.valueOf(list.get(i).get("username")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(20);
                    cells.setCellValue(null == list.get(i).get("expect") ? "" : String.valueOf(list.get(i).get("expect")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(21);
                    cells.setCellValue(null == list.get(i).get("recordNum") ? "" : String.valueOf(list.get(i).get("recordNum")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(22);
                    cells.setCellValue(null == list.get(i).get("lastPlanContent") ? "" : String.valueOf(list.get(i).get("lastPlanContent")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(23);
                    cells.setCellValue(null == list.get(i).get("lastRecordContent") ? "" : String.valueOf(list.get(i).get("lastRecordContent")));
                    cells.setCellStyle(bodyStyle);
                    rowNum ++ ;
                }
            }
            out = response.getOutputStream();
            response.setContentType("application/x-msdownload");
            response.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode("CRM学员跟进.xlsx", "UTF-8"));
            xssfWorkbook.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 创建爱数据学员Excel
     * @param list
     * @param response
     */
    public static void exportEnterpriseToExcel(List<Map<String, Object>> list, HttpServletResponse response) {
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        OutputStream out = null;
        try {
            //EXCEL表格颜色
            XSSFColor b1 = new XSSFColor(new Color(247, 247, 247));
            XSSFColor b2 = new XSSFColor(new Color(234, 242, 242));
            XSSFColor f1 = new XSSFColor(new Color(33, 129, 210));
            XSSFColor f2 = new XSSFColor(new Color(255, 0, 0));
            //表头样式
            XSSFCellStyle headStyle = createStyle(xssfWorkbook, HorizontalAlignment.CENTER, (short)10, true, null, null, true);
            //内容样式
            XSSFCellStyle bodyStyle = createStyle(xssfWorkbook, HorizontalAlignment.CENTER, (short)10, false, null, null, true);
            //2.创建工作表
            XSSFSheet sheet = xssfWorkbook.createSheet("sheet1");
            //3.创建行
            XSSFRow row = sheet.createRow(0);
            //表头
//            XSSFCell nameCell = row.createCell(0);
//            nameCell.setCellValue("序号");
//            nameCell.setCellStyle(headStyle);
            XSSFCell sexCell = row.createCell(0);
            sexCell.setCellValue("姓名");
            sexCell.setCellStyle(headStyle);
            XSSFCell birthDateCell = row.createCell(1);
            birthDateCell.setCellValue("最近学习");
            birthDateCell.setCellStyle(headStyle);
            XSSFCell phoneCell = row.createCell(2);
            phoneCell.setCellValue("随堂练习");
            phoneCell.setCellStyle(headStyle);
            XSSFCell attrCell = row.createCell(3);
            attrCell.setCellValue("成果校验");
            attrCell.setCellStyle(headStyle);
            XSSFCell regDateCell = row.createCell(4);
            regDateCell.setCellValue("问答数量");
            regDateCell.setCellStyle(headStyle);
            XSSFCell classesCell = row.createCell(5);
            classesCell.setCellValue("课程完成率");
            classesCell.setCellStyle(headStyle);

            int rowNum = 1;
            if(list.size() > 0){
                for (int i = 0; i < list.size(); i++) {
                    XSSFRow rows = sheet.createRow(rowNum);
                    XSSFCell cells = rows.createCell(0);
                    cells.setCellValue(null == list.get(i).get("realName") ? "" : String.valueOf(list.get(i).get("realName")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(1);
                    cells.setCellValue(null == list.get(i).get("learnTime") ? "" : String.valueOf(list.get(i).get("learnTime")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(2);
                    cells.setCellValue(null == list.get(i).get("workSubmitNum") ? "" : String.valueOf(list.get(i).get("workSubmitNum")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(3);
                    cells.setCellValue(null == list.get(i).get("resultCheck") ? "" : String.valueOf(list.get(i).get("resultCheck")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(4);
                    cells.setCellValue(null == list.get(i).get("issueNum") ? "" : String.valueOf(list.get(i).get("issueNum")));
                    cells.setCellStyle(bodyStyle);
                    cells = rows.createCell(5);
                    cells.setCellValue(null == list.get(i).get("finishRate") ? "" : String.valueOf(list.get(i).get("finishRate")));
                    cells.setCellStyle(bodyStyle);
                    rowNum ++ ;
                }
            }
            out = response.getOutputStream();
            response.setContentType("application/x-msdownload");
            response.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode("爱数据企业用户.xlsx", "UTF-8"));
            xssfWorkbook.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
