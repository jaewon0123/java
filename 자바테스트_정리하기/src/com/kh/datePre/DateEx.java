package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		// Date로 현재 날짜를 받아서 년 - 월- 일 출력하기
		// Date는 최초 1회만 호출 Date now = new Date
		//SimpleDateFormat sdf1 = new SimpleDateFormat
		Date now = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String date1 = sdf1.format(now);
		System.out.println("년 - 월 - 일 / " + date1);	
		
		//문자열(SimpleDateFormat - String) -> 날짜(Date) 변경
		//Date parseDate1
		String 문자열1 = "2024-05-03";
		
		try {
			Date parseDate1 = sdf1.parse(문자열1);
			//Fri May 03 00:00:00 KST 2024 문자열에 시분초가 없기 때문에 0으로 표시
			System.out.println("parseDate1 : " + parseDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 시: 분 : 초
		//SimpleDateFormat sdf2 = new SimpleDateFormat
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		String date2 = sdf2.format(now);
		System.out.println("시 : 분 : 초 / " + date2);
		
		String 문자열2 = "11:08:54";
		
		try {
			Date parseDate2 = sdf2.parse(문자열2);
			System.out.println("parseDate2 : " + parseDate2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// 년 - 월- 일 시:분:초 출력하기
		//SimpleDateFormat sdf3 = new SimpleDateFormat
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date3 = sdf3.format(now);
		System.out.println("년 - 월 - 일  시 : 분 : 초 / " + date3);
		
		String 문자열3 = "2024-05-03 11:08:54";
		
		try {
			Date parseDate3 = sdf3.parse(문자열3);
			System.out.println("parseDate3 : " + parseDate3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
