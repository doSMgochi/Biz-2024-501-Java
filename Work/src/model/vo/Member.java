package model.vo;

public class Member {
	String name;
	String rank;
	public Member() {
		super();
	}
	public Member(String name, String rank) {
		super();
		this.name = name;
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	
}
