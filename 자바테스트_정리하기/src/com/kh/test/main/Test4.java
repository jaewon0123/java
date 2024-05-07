package com.kh.test.main;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner 스캐너 = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		/*
		 1부터 9까지 값을 스캐로 각각 입력받아 
		 */
		int 숫자1 = 스캐너.nextInt();
		//만약에 숫자1이 1~9까지 값이 아니라면
		//단축키 한번에 여러줄 복사하기 
		//shift를 누르고 원하는 위 아래 방향 화살표 원하는만큼 입력 ctrl alt 화살표
		if(숫자1 <1 || 숫자1 > 9) {
			System.out.println("1 부터 9 사이의 정수를 입력하세요.");
			return; //프로그램 종료
		}
		
		System.out.print("두 번째 정수 입력 : ");
		int 숫자2 = 스캐너.nextInt();
		if(숫자2 <1 || 숫자2 > 9) {
			System.out.println("1 부터 9 사이의 정수를 입력하세요.");
			return; //프로그램 종료
		}

		//합
		int 합 = 숫자1 + 숫자2;
		//빼기
		int 빼기 = 숫자1 - 숫자2;
		//곱하기
		int 곱 = 숫자1 * 숫자2;
		//몫
		int 몫 = 숫자1 / 숫자2;
		
		
		System.out.println(숫자1 + " + " + 숫자2 + " = " + 합);
		System.out.println(숫자1 + " - " + 숫자2 + " = " + 빼기);
		System.out.println(숫자1 + " * " + 숫자2 + " = " + 곱);
		System.out.println(숫자1 + " / " + 숫자2 + " = " + 몫);
	}
}