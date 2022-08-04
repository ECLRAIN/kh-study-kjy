package oop.method4;

public class Menu {
	//멤버필드
	String name;
	String menu;
	int price;
	boolean event;
	//멤버 메소드
	//보이드 셋팅을 2개이상쓰면 3개짜리면 3개에 4개짜리는 4개
	void setting(String name,String menu,int price) {
		this.setting(name, menu, price, false);
	}
	
	void setting(String name,String menu,int price, boolean event){
		this.name=name;
		this.menu=menu;
		this.price=price;
		this.event=event;
	}
	void print() {
		System.out.println("메뉴정보");
		System.out.println("이름: "+this.name);
		System.out.println("분류: "+this.menu);
		System.out.println("가격: "+this.price);
		
		if(this.event==true) {
			System.out.println("행사 가격");
		}
	}
	
}
