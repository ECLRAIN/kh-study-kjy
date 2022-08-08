package oop.keyword7;

public class Bank {
	private String name;
	private static double interest;
	private double interestMVP;
	private int money;
	//스태틱전용 초기화구문
//	static {
//		interest=1.2;
//	}
	
	//셋터 겟터
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(interest<0) {
			return;
		}
		this.name = name;
	}
	public static double getInterest() {
		
		return interest;
	}
	public static void setInterest(double interest) {
		Bank.interest = interest;
	}
	public double getInterestMVP() {
		return interestMVP;
	}
	public void setInterestMVP(double interestMVP) {
		this.interestMVP = interestMVP;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	//프린터
	public void print() {
		System.out.println(this.name);
		System.out.println("기본이율"+1.2);
		System.out.println("우대이율"+this.interestMVP);
		System.out.println(this.money);
		System.out.println();
	}
	//생성자
	public Bank(String name, double interestMVP, int money) {
		
		this.name = name;
		//Bank.interest=1.2; //이건 잘못된거임 생성자에서는 스태틱을 초기화할 필요가 없다 한번만 초기화하도록 따로 설정
		this.interestMVP = interestMVP;
		this.money = money;
	}
	
	
}
