package oop.keyword7;

public class Test01 {
	public static void main(String []args) {
		Bank a= new Bank("유재석",0.3,5000000);
		Bank b= new Bank("강호동",0.5,3500000);
		Bank c= new Bank("신동엽",0.2,8000000);
		
		a.print();
		b.print();
		c.print();
	}
}
