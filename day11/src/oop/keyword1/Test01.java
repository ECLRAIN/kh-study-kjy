package oop.keyword1;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(3 * 5);
		
		Calculator c = new Calculator(3, 5);
		System.out.println(c.getAnswer());
	}
}
