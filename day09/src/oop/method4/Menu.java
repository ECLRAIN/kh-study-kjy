package oop.method4;

public class Menu {
	//멤버필드
	String name;
	String menu;
	int price;
	String event;
	//멤버 메소드
	void setting(String name,String menu,int price, String event){
		this.name=name;
		this.menu=menu;
		this.price=price;
		this.event="행사중";	
	}
	void print() {
		System.out.println("이름: "+this.name);
		System.out.println("분류: "+this.menu);
		System.out.println("가격: "+this.price);
		System.out.println("할인: "+this.event);
	}
	
}
