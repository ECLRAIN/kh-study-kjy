package oop.basic3;

public class Test02 {
	public static void main(String [] args) {
		
		PricePlan a= new PricePlan(); //=객체 생성
		//객체 초기화
		a.agency="SK";
		a.name="5G언택트 52";
		a.PriceMon=52000;
		a.data=200;
		a.callM=1000;
		a.message=2000;
		
		PricePlan b= new PricePlan();
		b.agency="KT";
		b.name="5G세이브";
		b.PriceMon=45000;
		b.data=100;
		b.callM=900;
		b.message=1500;
		
		PricePlan c= new PricePlan();
		c.agency="LG";
		c.name="5G시그니처";
		c.PriceMon=130000;
		c.data=500;
		c.callM=2000;
		c.message=2000;
		
		System.out.println(a.agency);
		System.out.println(a.name);
		System.out.println(a.PriceMon);
		System.out.println(a.data);
		System.out.println(a.callM);
		System.out.println(a.message);
		
		System.out.println(b.agency);
		System.out.println(b.name);
		System.out.println(b.PriceMon);
		System.out.println(b.data);
		System.out.println(b.callM);
		System.out.println(b.message);
		
		System.out.println(c.agency);
		System.out.println(c.name);
		System.out.println(c.PriceMon);
		System.out.println(c.data);
		System.out.println(c.callM);
		System.out.println(c.message);
	}
}
