package oop.inner4;

public class Test01 {
	public static void main(String []args) {
		Button bt = new Button() {
			
			@Override
			public void push() {
				System.out.println("버튼 클릭");
				
			}
		};
		bt.push();
		//
		//자바 1.8부터는 함수형 인터페이스,추론 이라는 개념이 생긴다
		//함수형 인터페이스는 메소드가 하나뿐인 인터페이스를 말한다
		//어짜맆 익명중첩클래스로 객체를 만들거고 메소드가 하나라면 굳이 다 쳐야하나?
		//이렇게 완성된 형태는 람다라고함
		Button exit=()->{ 
			//()->=Button bt = new Button() 
			//{public void push() {System.out.println("버튼 클릭");}};bt.push();
			System.out.println("종료버튼클릭");
		};
		exit.push();
	}
}
