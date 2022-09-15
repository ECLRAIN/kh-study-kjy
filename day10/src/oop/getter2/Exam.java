package oop.getter2;

public class Exam {
	//field
	String name;
	String subject;
	int essay, checklist;
	
	//constructor
	Exam(String name, String subject, int essay, int checklist){
		this.setName(name);
		this.setSubject(subject);
		this.setEssay(essay);
		this.setChecklist(checklist);
	}
	
	//method, setter, getter
	void print() {
		System.out.println("<시험 결과>");
		System.out.println("이름 : " + this.name);
		System.out.println("과목 : " + this.subject);
		System.out.println("서술형 점수 : " + this.essay+"점");
		System.out.println("평가자 체크리스트 점수 : " + this.checklist + "점");
		System.out.println("결과 : " + this.getResult());
	}
	
	void setName(String name) {
		this.name = name;
	}
	void setSubject(String subject) {
		this.subject = subject;
	}
	void setEssay(int essay) {
		if(essay >= 0 && essay <= 100) {
			this.essay = essay;
		}
	}
	void setChecklist(int checklist) {
//		if(checklist < 0 || checklist > 100) {//0점 미만 또는 100점 초과
		if(!(checklist >= 0 && checklist <= 100)) {//0점 이상이며 100점 이하가 아니면
			return;
		}
		this.checklist = checklist;
	}
	
	String getName() {
		return this.name;
	}
	String getSubject() {
		return this.subject;
	}
	int getEssay() {
		return this.essay;
	}
	int getChecklist() {
		return this.checklist;
	}
	//가상의 getter
	int getTotal() {
		return this.essay + this.checklist;
	}
	double getAverage() {
		//return (this.essay + this.checklist) / 2.0;
		return this.getTotal() / 2.0;
	}
	String getResult() {
		if(this.essay >= 40 && this.checklist >= 40 && this.getAverage() >= 60) {
			return "통과";
		}
		else {
			return "재평가";
		}
	}
}















