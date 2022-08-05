package oop.setter2;

public class Academy {
	//필드
	String name;
	int time;
	int price;
	String type;
	//setter method
	//이름 지을때 앞에 set붙이자
	void setName(String name) {
		this.name=name;
	}
	void setSpeed(int time) {
		this.time=time;	
	}
	void setPrice(int price) {
		if(price<0) {
		return;
		}
		this.price=price;
	}
	void setType(String type){
		switch (type) {
		case "온라인";
		case "오프라인";
		case "
			
			break;

		default:
			break;
		}
		this.type=type;
	}
	
}
