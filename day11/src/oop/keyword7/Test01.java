package oop.keyword7;

public class Test01 {
	public static void main(String[] args) { 
//		Account.setBasicRate(1.2);//기본이율 설정
		
		Account ac1 = new Account("유재석", 0.3, 5000000);
		Account ac2 = new Account("강호동", 0.5, 3500000);
		Account ac3 = new Account("신동엽", 0.2, 8000000);
		
		ac1.print();
		ac2.print();
		ac3.print();
		
	}
}
