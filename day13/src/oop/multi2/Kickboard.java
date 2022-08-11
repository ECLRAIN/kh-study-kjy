package oop.multi2;

public class Kickboard implements Electronic, Transportation{

	@Override
	public void move() {
		System.out.println("킥보드로 이동합니다");
	}
	@Override
	public void on() {
		System.out.println("킥보드의 시동을 켭니다");
	}
	@Override
	public void off() {
		System.out.println("킥보드의 시동을 끕니다");
	}

}