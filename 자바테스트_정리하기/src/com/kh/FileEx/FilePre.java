package com.kh.FileEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePre {
	public static void main(String[] args) throws IOException {
		String 파일이름 = "practice.txt";
		
		//파일이 존재하는지 확인
		//존재하지 않는다면 만들어줌
		//존재한다면 이미 존재합니다. 라는 문구 출력
		File file = new File(파일이름);
		if(file.exists()) {
			System.out.println("파일이 이미 존재합니다.");
		} else {
			file.createNewFile();
			System.out.println("파일을 만들었습니다.");
		}
		//파일에 글을 작성하기
		//Java \n File \n 객체 \n 종료하기 실행
		FileWriter 파일작성 = new FileWriter(file);
		파일작성.write("Java \n");
		파일작성.write("File \n");
		파일작성.write("객체 \n");
		
		파일작성.close();
		
		System.out.println("파일작성을 완료했습니다.");
	}
}
