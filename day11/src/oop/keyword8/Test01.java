package oop.keyword8;

public class Test01 {
	public static void main(String [] args) {
		//파이널은 마지막을 의미하는 키워드
		//변수에 붙든 메소드에 붙든 클래스에 붙든 아무튼 더이상 하지않음
		
		final int a;
		a=10;
		//a=20; 에러가 뜨는데 두번이상 초기화 금지
		System.out.println(a);
	}
}
