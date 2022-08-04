package oop.method4;

public class Test06 {
	public static void main(String[] args) {
		Menu a = new Menu();
		Menu b = new Menu();
		Menu c = new Menu();
		Menu d = new Menu();
		
		
		a.setting("아메리카노", "음료", 2500, null);
		
		b.setting("모카라떼", "음료", 3500, null);
		b.event="-";
		
		c.setting("치즈케이크", "디저트", 5000, null);
		
		d.setting("마카롱", "디저트", 3000, null);
		d.event="-";
		
		
		
		
		a.print();
		System.out.println();
		b.print();
		System.out.println();
		c.print();
		System.out.println();
		d.print();
		
	}
}
