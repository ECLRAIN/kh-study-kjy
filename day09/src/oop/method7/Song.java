package oop.method7;

public class Song {
	//field
	String name;
	String artist;
	String album;
	int play;
	int like;
	
	//method
	void setting(String name, String artist, String album, int play, int like) {
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.play = play;
		this.like = like;
	}
	
	void print() {
		System.out.println("<음원 정보>");
		
		System.out.print("제목 : " + this.name);
		if(this.play > 100000) {
			System.out.print("[베스트]");
		}
		if(this.like > 100000) {
			System.out.print("[인기곡]");
		}
		System.out.println();
		System.out.println("가수 : " + this.artist);
		System.out.println("앨범 : " + this.album);
		System.out.println("재생수 : " + this.play);
		System.out.println("좋아요 : " + this.like);
		
		int rankingPoint = this.play * 2 + this.like / 2;
		System.out.println("랭킹점수 : " + rankingPoint +"점");
	}
	
}









