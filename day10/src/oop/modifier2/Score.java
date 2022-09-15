package oop.modifier2;

public class Score {
	//field(private)
	private String name;
	private int level;
	private int korean, english, math;
	
	//method(public)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		if(level != 1 && level != 2 && level != 3) {
			return;
		}
		this.level = level;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		if(korean < 0 || korean > 100) {
			return;
		}
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		if(english < 0 || english > 100) {
			return;
		}
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		if(math < 0 || math > 100) {
			return;
		}
		this.math = math;
	}
	public int getTotal() {
		return this.korean + this.english + this.math;
	}
	public float getAverage() {
		return this.getTotal() / 3f;
	}
	public String getGrade() {
		float average = this.getAverage();
		if(average >= 90) return "A";
		else if(average >= 80) return "B";
		else if(average >= 70) return "C";
		else return "F";
	}
	public void print() {
		System.out.println("<학생 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("학년 : " + this.level);
		System.out.println("국어 : " + this.korean + "점");
		System.out.println("영어 : " + this.english + "점");
		System.out.println("수학 : " + this.math + "점");
		System.out.println("총점 : " + this.getTotal() + "점");
		System.out.println("평균 : " + this.getAverage() + "점");
		System.out.println("등급 : " + this.getGrade());
	}
	
	//constructor(public)
	public Score(String name, int level, int korean, int english, int math) {
		this.setName(name);
		this.setLevel(level);
		this.setKorean(korean);
		this.setEnglish(english);
		this.setMath(math);
	}
	
	//기본생성자
	public Score() {}
	
}





