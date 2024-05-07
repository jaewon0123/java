package ncs.test4;

import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) {
		//스캐너를 이용해서 입출력받기
		Scanner sc = new Scanner(System.in);
		
		//키보드로부터 상품 입력받기
		System.out.print("상품 이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("상품 가격을 입력하세요 : ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("상품 수량을 입력하세요 : ");
		int quantity = Integer.parseInt(sc.nextLine());
		
		
		// 입력받은 제품 객체 Product 넣은 후 생성 및 초기화
		Product 상품 = new Product(name, price, quantity);
		
		//상품 정보 출력
		System.out.println(상품.정보());
	}
	
}