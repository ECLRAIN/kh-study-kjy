package oop.method7;

public class What {
	String product;
	String singer;
	String album;
	int play;
	int like;
	double score;
	
	
	void setting(String product,String singer,String album,int play,int like) {
		this.product=product;
		this.singer=singer;
		this.album=album;
		this.play=play;
		this.like=like;
		this.score=play*2+like/2.0;
	}
	void print() {
		
		
		if(this.play>100000) {
			System.out.println(this.product+" 베스트");
		}
		if(this.like>100000) {
			System.out.println(this.product+" 인기곡");
		}
		System.out.println("가수: "+this.singer);
		System.out.println("앨범: "+this.album);
		System.out.println("재생수"+this.play);
		System.out.println("좋아요"+this.like);
		
		System.out.println("랭킹점수="+score);
		
		System.out.println();
	
	}
}
