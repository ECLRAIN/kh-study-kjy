package modifier4;

import modifier4.Gun;

public class Police {
	
	//필드

	private String name;

	private String rank;

	private String place;

	
	//Gun의 정보 불러오기
	Gun a= new Gun(2);
	

//세터 게터

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getRank() {

		return rank;

	}

	public void setRank(String rank) {

		this.rank = rank;

	}

	public String getPlace() {

		return place;

	}

	public void setPlace(String place) {

		this.place = place;

	}

	//메소드
	public void Shoot() {
		a.fire();
	}

	
	//출력
	public void print() {

		System.out.println("이름="+this.name);

		System.out.println("직급="+this.rank);

		System.out.println("근무지역="+this.place);
		
		a.print();
		
		System.out.println();
	}
	//생성자
	public Police(String name, String rank, String place) {

		this.setName(name);

		this.setRank(rank);

		this.setPlace(place);

	}

}