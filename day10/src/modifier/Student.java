package modifier;

public class Student {
	//변수는 외부 접근을 차단하겠다
	//private 키워드를 추가
	//클래스 외부의 접근을 차단
	
	private String name;
	private int score;
	
//	-메소드는 조건 등이 사용 가능하므로 외부에 공개해야 한다
//	-퍼블릭은 공개임 퍼블릭 키워드를 추가
//	아무데서나 접근이 가능
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getScore() {
		return score;
	}
	void setScore(int score) {
		if(score>=0 && score<=100) {
		this.score = score;
		}
	}
	
	Student(String name, int score) {
		this.setName(name);
		this.setScore(score);
	}
	
	void print() {
		System.out.println();
		System.out.println();
	}
	
}
