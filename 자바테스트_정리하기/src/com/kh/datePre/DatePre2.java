package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre2 {
	public static void main(String[] args) {
		Date now = new Date();
		//날짜 형식 0000년 00월 00일
		//년 월 일 형식으로 -이외 / _ 글자를 넣게 되면 자동으로 시 분 초는 값을 읽어오지 못함 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy 년 MM 월 dd 일");
		
		//날짜를 문자열로 format형식
		String format = sdf.format(now);
		//출력
		System.out.println(format);
		//문자열을 날짜로 parse를 사용해서 변경
		try {
			Date parseDate = sdf.parse(format);
			System.out.println(parseDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
