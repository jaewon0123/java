package com.kh.Hamburger;

public class HamburgerOrder {
//필드
	private String 고객명;
	private String 버거타입;
//메서드
	//Setter
	public void set고객명(String 고객명) {
		this.고객명 = 고객명;
	}
	public void set버거타입(String 버거타입) {
		this.버거타입 = 버거타입;
	}	
	//Getter
	public String get고객명() {
		return 고객명;
	}
	
	public String get버거타입() {
		return 버거타입;
	}
	//필수생성자
	public HamburgerOrder(String 고객명, String 버거타입) {
		this.고객명 = 고객명;
		this.버거타입 = 버거타입;
	}

	//Override toString alt shift s s
	@Override
	public String toString() {
		return "[고객명=" + 고객명 + ", 버거타입=" + 버거타입 + "]";
	}
	
}
