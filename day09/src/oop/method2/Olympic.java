package oop.method2;

public class Olympic {
	//멤버필드=데이터 저장소
	String name;
	String competition;
	String season;
	int gold;
	int sliver;
	int bronze;
	
	//설정 메소드
	void setting(String name,String competition,String season, int gold, int sliver, int bronze) {
		this.name=name;
		this.competition=competition;
		this.season=season;
		this.gold=gold;
		this.sliver=sliver;
		this.bronze=bronze;
	}
	void print() {
		System.out.println("이름= "+this.name);
		System.out.println("종목= "+this.competition);
		System.out.println("계절= "+this.season);
		System.out.println("금메달= "+this.gold);
		System.out.println("은메달= "+this.sliver);
		System.out.println("동메달= "+this.bronze);
		
	}
}
