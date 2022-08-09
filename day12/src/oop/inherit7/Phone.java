package oop.inherit7;

//추상클래스  abstract class
//=상속을 위한 상위 클래스
//쓰면 객체 생성 불가
//추상 메소드를 가지게 됨
public abstract class Phone {
	protected String name,color;

	public Phone(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public abstract void call(); //call이라는 기능이 있어야 하는 데 모르겠네?
	public abstract void sms();//sms이라는 기능이 있어야 하는 데 모르겠네?
	
}
