package com.example.aopzhujie.util;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

public class StringTools {
	
	public static void sWrite(HttpServletResponse response, String json) throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
//		response.setContentType("application/json");
		Writer w= response.getWriter();
		w.write(json);
	}
	
	public static String subStr(String str,int start,int end)throws Exception {
//		System.out.println(str);
		if(str==null||str==""){
			return null;
		}
		byte[] bt=str.getBytes("GBK");
		int num=end-start;
		byte[] c=new byte[num];
		int j=0;
		for(int i=start;i<end;i++){
			c[j]=bt[i];
			j++;
		}
		return new String(c,"GBK");
	}

	public static String subCity(String code) {


		String str = code.substring(4,6);

		if(str.equals("00")){
			str = code.substring(2,4);
			if(str.equals("00")){
				return code.substring(0,2);
			}else{
				return code.substring(0,4);
			}
		}else{
			return code;
		}
	}

	/**
	 * 将秒转化成时间String
	 */
	public static String SecondToString(String mediaTime){
		Long mediaInt = Long.valueOf(mediaTime);
		String newMediaTime = mediaInt/60+"分"+(mediaInt%60)+"秒";
		return newMediaTime;
	}

	/**
	 * 将秒转化成时间String
	 */
	public static String SecondToHourMinnite(String mediaTime){
		Long mediaInt = Long.valueOf(mediaTime);
		String newMediaTime = mediaInt/3600+"时"+(mediaInt%3600)/60+"分";
		return newMediaTime;
	}

}
