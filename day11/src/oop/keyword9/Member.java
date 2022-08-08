package oop.keyword9;

public class Member {
	private static String id;
	private String pw;
	private String nickname;
	public static String getId() {
		return id;
	}
	public static void setId(String id) {
		Member.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public Member(String id,String pw, String nickname) {
		this.id=id;
		this.pw = pw;
		this.nickname = nickname;
	}
	
	public void print() {
		System.out.println(this.id);
		System.out.println(this.nickname);
	}
	
}
