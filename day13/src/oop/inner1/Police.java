package oop.inner1;
//중첩 클래스 nested class
//클래스 간의 소유관계를 표현
//클래스 내부에서 사용할 객체 설계
//스태틱덕분에 객체를 안만들고 접근

//중첩 클래스의 종류
//일반 중첩 클래스 
//스태틱 중첩 클래스
//지역 중첩 클래스
//익명 중첩 클래스 제일 중요
public class Police {
	private Gun gun;
					//^ 경찰이 권총을 소유
	public Police() {
		this.gun=new Gun();
	}
//	private class Gun{} //일반 중첩 클래스
	private static class Gun{} //스태틱 중첩 클래스
	public void print() {
		class Gun{} //지역 중첩 클래스
	}
}
