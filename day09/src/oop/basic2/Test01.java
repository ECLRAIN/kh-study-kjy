package oop.basic2;

public class Test01 {
	public static void main(String[] args) {
		//3개의 나라 정보(객체or인스턴스) 생성
		Country a = new Country();
		Country b = new Country();
		Country c = new Country();
		
		//정보 설정
		a.rank = 1;
		a.name = "브라질";
		a.point = 1828.45;
		
		b.rank = 2;
		b.name = "벨기에";
		b.point = 1823.42;
		
		c.rank = 3;
		c.name = "프랑스";
		c.point = 1786.15;
		
		//정보 출력
		System.out.println(a.rank);
		System.out.println(a.name);
		System.out.println(a.point);
		
		System.out.println(b.rank);
		System.out.println(b.name);
		System.out.println(b.point);
		
		System.out.println(c.rank);
		System.out.println(c.name);
		System.out.println(c.point);
	}
}










