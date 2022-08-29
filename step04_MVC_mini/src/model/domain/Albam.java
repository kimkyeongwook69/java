package model.domain;

public class Albam {
	private String AlbamName;
	private int AlbamRanking;
	
	public Albam() {}
	
	public Albam(String AlbamName, int AlbamRanking) {
		this.AlbamName = AlbamName;
		this.AlbamRanking = AlbamRanking;
	}

	public String getName() {
		return AlbamName;
	}
	
	public void setName(String AlbamName) {
		this.AlbamName = AlbamName;
	}
	
	public int getAge() {
		return AlbamRanking;
	}
	
	public void setAge(int AlbamRanking) {
		if(AlbamRanking > 0) {
			this.AlbamRanking = AlbamRanking;
		} else {
			System.out.println("입력한 앨범 랭킹은 유효하지 않습니다. ");
		}
	}
	
	
	public String toString() {
		return AlbamName + " " + AlbamRanking;
	}
	
	
	
	
	
}
