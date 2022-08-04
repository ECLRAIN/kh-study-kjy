package oop.method3;

public class Test05 {
	public static void main(String []args) {
		Student a= new Student();
		a.setting("피카츄",90,90,85);
		Student b= new Student();
		b.setting("라이츄",90,90,85);
		Student c= new Student();
		c.setting("파이리",90,70,85);
		
		a.print();
		b.print();
		c.print();
	}
}
