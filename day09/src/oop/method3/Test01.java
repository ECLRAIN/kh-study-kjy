package oop.method3;

public class Test01 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.setting("피카츄", 90, 90, 85);
		s2.setting("라이츄", 80, 90, 85);
		s3.setting("꼬부기", 100, 90, 90);
		
		s1.korean = 0;
		s1.total = s1.korean + s1.english + s1.math;
		s1.average = s1.total / 3.0;
		
		s1.print();
		s2.print();
		s3.print();
	}
}
