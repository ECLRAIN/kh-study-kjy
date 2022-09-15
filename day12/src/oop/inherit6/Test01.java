package oop.inherit6;

public class Test01 {
	public static void main(String[] args) {
		Galaxy22s a = new Galaxy22s("010-1111-2222", "블랙");
		a.call();
		a.sms();
		a.samsungPay();
		a.bixby();
		
		GalaxyFold3 b = new GalaxyFold3("010-2222-3333", "실버");
		b.call();
		b.sms();
		b.samsungPay();
		b.iris();
		
		IPhone12 c = new IPhone12("010-3333-4444", "화이트");
		c.call();
		c.sms();
		c.siri();
		c.itunes();
		
		IPhone13 d = new IPhone13("010-4444-5555", "레드");
		d.call();
		d.sms();
		d.siri();
		d.faceTime();
		
	}
}
