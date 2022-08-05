package oop.constructor2;

public class Test01 {
	public static void main(String[] args) {
		Player a = new Player("마리오", "전사", 50);
		Player b = new Player("루이지", "마법사");
		Player c = new Player("피오나", "마법사");

		//b의 레벨이 올랐다
		//b.level++;//비추천
		b.levelUp();//추천

		a.print();
		b.print();
		c.print();
	}
}