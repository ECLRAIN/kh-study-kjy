package select;
//db에 한줄을 옮겨 담을 수 있도록 필드를 구성
public class Country {
	private int rank;
	private String nation;
	private double score;
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String name) {
		this.nation = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Country [rank=" + rank + ", nation=" + nation + ", score=" + score + "]";
	}
	
	
}
