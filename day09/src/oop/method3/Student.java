package oop.method3;

public class Student {
	//멤버필드=데이터 저장소
	String name;
	double Korean;
	double English;
	double Math;
	double sum;
	double avg;
	
	void setting(String name, double Korean, double English, double Math ) {
		this.name=name;
		this.Korean=Korean;
		this.English=English;
		this.Math=Math;
		this.sum=Korean+English+Math;
		this.avg=this.sum/3.0;
	}
		void print() {
			System.out.println("이름= "+this.name);
			System.out.println("국어: "+this.Korean+"영어: "+this.English+"수학: "+this.Math);
			System.out.println("총점: "+ this.sum);
			System.out.println("평균: "+this.avg);
		}

	
}
