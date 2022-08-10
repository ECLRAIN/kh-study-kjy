package oop.inherit9;

public abstract class RPG {
	//필드
	protected String id;
	private int level;
	//메소드 추상메소드
	
	
	
	}
	//메소드
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	//생성자
		public void PRG(String id) {
			this.setId(id);
		}
		public RPG(String id, int level) {
			this.setId(id);
			this.setLevel(1);
		}
	public abstract void attack();//?가 칼or활or마법로 공격합니다
	public abstract void move();//?가 이동합니다
	public final void print() {
		System.out.println("유저 정보");
		System.out.println("아이디: "+ this.id);
		System.out.println("레벨"+this.level);
	}
}
//