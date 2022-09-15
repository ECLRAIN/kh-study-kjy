package oop.method4;

public class Test01 {
	public static void main(String[] args) {
		Menu a = new Menu();
		Menu b = new Menu();
		Menu c = new Menu();
		Menu d = new Menu();
		
		a.setting("아메리카노", 2500, "음료", true);
		b.setting("모카라떼", 3500, "음료");
		c.setting("치즈케이크", 5000, "디저트", true);
		d.setting("마카롱", 3000, "디저트");
		
		a.print();
		b.print();
		c.print();
		d.print();
	}
}
