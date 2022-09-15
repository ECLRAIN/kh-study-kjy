package oop.method4;

public class Menu {
	//field
	String name;
	int price;
	String type;
	boolean event;
	
	//method
	
	//method overloading : 같은 이름으로 메소드를 여러 개 준비하는 것
	void setting(String name, int price, String type) {
		this.setting(name, price, type, false);
	}
	void setting(String name, int price, String type, boolean event) {
		this.name = name;
		this.price = price;
		this.type = type;
		this.event = event;
	}
	void print() {
		System.out.println("<메뉴 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("구분 : " + this.type);
		System.out.print("가격 : " + this.price+"원");
		if(this.event == true) {
			System.out.print("( 행사 상품 )");
		}
		System.out.println();
		//System.out.println("행사중 : " + this.event);
	}
}









