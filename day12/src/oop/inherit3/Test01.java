package oop.inherit3;

public class Test01 {
	public static void main(String[] args) {
	//상위 클래스는 객체 생성을 하지 않는다(추상적인 형태)
			//Browser a = new Browser();
			
			Chrome b = new Chrome();
			b.setUrl("https://www.google.com");
			b.refresh();
			b.move();
			b.develop();
			b.chromeStore();
			
			Edge c = new Edge();
			c.setUrl("https://www.kakao.com");
			c.refresh();
			c.move();
			c.fullScreen();
			
			Whale d = new Whale();
			d.setUrl("https://www.naver.com");
			d.refresh();
			d.move();
			d.papago();
			d.naverSearch();
		}
	}