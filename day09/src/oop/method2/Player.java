package oop.method2;

public class Player {
	//멤버 필드
	String name;
	String event;
	String type;
	int gold;
	int silver;
	int bronze;
	
	//멤버 메소드
	void setting(String name, String event, String type,
						int gold, int silver, int bronze) {
		this.name = name;
		this.event = event;
		this.type = type;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
	}
	void print() {
		System.out.println("<선수 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("종목 : " + this.event);
		System.out.println("구분 : " + this.type);
		System.out.println("금/은/동 : "+this.gold+"/"+this.silver+"/"+this.bronze);
	}
}









