package com.kh.test.main;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/*
		 키보드로 1개의 정수형(int) 데이터를 입력 받아,
		 1~100 사이의 값일 때만 2의 배수인지 아닌지를 출력 처리한다.
		 */
		
		Scanner 스캐너 = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		
		int 숫자 = 스캐너.nextInt();
		
		//만약에 숫자가 1 ~ 100 사이일 때 
			// 2의 배수인지 아닌지 if else 확인
		if(숫자 >= 1 && 숫자 <= 100) {
			if((숫자 % 2) == 0) {
				System.out.println("2의 배수입니다.");
			} else {
				System.out.println("2의 배수가 아닙니다");
			}
		} else {
			System.out.println("1부터 100사이 값만 입력해주세요");
			//1 ~ 100 사이가 아니면 1 ~ 100 사이 값만 입력해주세요. 출력
		}
		
		System.out.println("=== if  else if   else");
		
		int 숫자1 = 5;
		
		if(숫자1 > 0) {
			System.out.println("양수입니다.");
		} else if (숫자1 < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0 입니다.");
		}
		
	}
}
