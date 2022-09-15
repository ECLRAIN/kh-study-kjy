package oop.inherit8;

public class Magician extends Player {

	public Magician(String id) {
		super(id);
	}
	public Magician(String id, int level) {
		super(id, level);
	}

	@Override
	public void attack() {
		System.out.println("마법사가 공격합니다!");
	}

	@Override
	public void move() {
		System.out.println("마법사가 이동합니다!");
	}
	
}
