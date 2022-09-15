package oop.keyword9;

public class Member {
	//field
	private final String id;
	private String password;
	private String nickname;
	
	//id를 반드시 설정하는 생성자
	public Member(String id, String password, String nickname) {
		this.id = id;
		this.password = password;
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getId() {
		return id;
	}
	
	public void print() {
		System.out.println("<회원 정보>");
		System.out.println("아이디 : " + this.id);
		System.out.println("닉네임 : " + this.nickname);
	}
}
