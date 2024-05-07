package com.kh.test.main;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner 스캐너 = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int 숫자 = 스캐너.nextInt();

		switch (숫자) {
		case 1:
			System.out.println("입력이 되었습니다.");
			break;
		case 2:
			System.out.println("조회가 시작되었습니다.");
			break;
		case 3:
			System.out.println("수정이 정상적으로 되었습니다.");
			break;
		case 4:
			System.out.println("삭제되었습니다.");
			break;
		case 5:
			System.out.println("종료되었습니다.");
			break;
		default:
			System.out.println("다시 입력해주세요.");
		}
		스캐너.close();

	}
}