package oop.modifier5;

public class Test01 {
	public static void main(String[] args) {
		
		Gun g1 = new Gun();
		Gun g2 = new Gun();
		Gun g3 = new Gun();
		
		Police a = new Police("포돌이", "순경", "영등포경찰서", g1);
		Police b = new Police("포순이", "경장", "당산파출소", g2);
		Police c = new Police("포그리", "순경", "마포경찰서", g3);
		
		a.shoot();
		a.shoot();
		
		b.shoot();
		
		c.shoot();
		c.shoot();
		c.shoot();
		
		a.print();
		b.print();
		c.print();
		
	}
}
