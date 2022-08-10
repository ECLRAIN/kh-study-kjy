package oop.inherit9;

public class Warrior extends RPG{
	public Warrior(String id, int level) {
		super(id, level);
		this.setId(id);
		this.level=1;
	}
	
	@Override
	public void attack() {
		System.out.println("전사가 칼로 공격합니다!");
	}

	@Override
	public void move() {
		System.out.println("전사가 뛰어서 이동합니다!");
	}
	
	public void setLevel(int level) {
		if(level<=0) {
			return;
		}
	}

	public void print() {
		System.out.println("전사 정보");
		System.out.println("아이디"+this.id);
		System.out.println("레벨"+this.level);
	}
}
