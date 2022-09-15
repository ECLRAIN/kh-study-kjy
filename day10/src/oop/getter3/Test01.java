package oop.getter3;

public class Test01 {
	public static void main(String[] args) {
		Score s1 = new Score("마리오", 1, 90, 80, 70);
		Score s2 = new Score("루이지", 1, 85, 85, 83);
		Score s3 = new Score("쿠파", 3, 70, 60, 55);
		
		s1.print();
		s2.print();
		s3.print();
	}
}
