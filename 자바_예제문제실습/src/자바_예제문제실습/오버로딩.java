package 자바_예제문제실습;

public class 오버로딩 {
	public void test() {}
	public void test(String str, int in) {}
	public void test(int i, String st) {}
	public void test(String s) {}
	
	private void test(int a) {}
	
	public void test(char a, double r) {}
	
	void test(char ch) {}
	
	public void test(boolean a, char d) {}
	
	public void test(boolean b) {}
	
	public void test(short s, long f) {}
	public void test(short c) {}
	
	public void test(int a, String b, char d) {}
	public void test(int a, String b, int d) {}

	public void test(String c, int b, double d) {}
	public void test(String c, int b, String d) {}
	
	public void test(boolean a, boolean b, long d) {}
	public void test(boolean a, boolean b) {}
	
	public String test(String a, boolean b) {
		return "테스트";
	}
	
	public int test(short i, short s) {
		return 0;
	}
	public double test(String i, short s) {
		return 0.1;
	}
	
}
