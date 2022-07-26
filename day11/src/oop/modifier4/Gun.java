package oop.modifier4;

public class Gun {
	//field
	private int bullet;
	
	//setter & getter
	public void setBullet(int bullet) {
		if(bullet > 0) {
			this.bullet = bullet;
		}
	}
	public int getBullet() {
		return this.bullet;
	}
	public void print() {
		System.out.println("권총에 남은 총알 수 : " + this.bullet + "발");
	}
	public void fire() {
		if(this.bullet > 0) {
			this.bullet--;
			System.out.println("빵야!");
		}
		else {
			System.out.println("딸깍!");
		}
	}
	//constructor
	public Gun() {
		this.setBullet(2);
	}
}


