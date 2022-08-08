package modifier4;

public class Gun {
	//총알
	private int bullet=2;

	
	//getter
	public int getBullet() {

		return bullet;

	}
	//setter
	public void setBullet(int bullet) {

		this.bullet = bullet;

	}

	//메소드
	public void fire() {//실행시에 빵야!라고 프린트하고 한발 줄어들게 bullet--/ 총알이 없다면 딸깍이라고 할것
		if(bullet<=0) {//없다면
			System.out.println("딸각");
		}
		else {
			System.out.println("빵야");
			this.bullet--;
		}
	}
	

	//남은 총알을 프린트할것
	public void print() {
		System.out.println("남은 총알: "+this.bullet);
	}

	
	//생성자
	public Gun(int bullet) {

		this.bullet=bullet;
	}


}
