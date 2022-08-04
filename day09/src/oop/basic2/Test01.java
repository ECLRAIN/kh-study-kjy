package oop.basic2;


public class Test01 {
	public static void main(String [] args) {
		Country a= new Country();
		
		a.Rank=1;
		a.name="브라질";
		a.point=1828.45;
		
		Country b= new Country();
		b.Rank=2;
		b.name="벨기에";
		b.point=1823.42;
		
		Country c= new Country();
		c.Rank=3;
		c.name="프랑스";
		c.point=1786.15;
		
		System.out.println(a.Rank);
		System.out.println(a.name);
		System.out.println(a.point);
		
		
	}
}
