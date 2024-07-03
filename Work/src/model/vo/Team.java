package model.vo;

public class Team {
	String teamName;
	int teamPoint;
	String teamMaster;
	String teamMemberA;
	String teamMemberB;
	String teamMemberC;
	
	
	public Team() {
		super();
	}


	public Team(String teamName, int teamPoint, String teamMaster, String teamMemberA, String teamMemberB,
			String teamMemberC) {
		super();
		this.teamName = teamName;
		this.teamPoint = teamPoint;
		this.teamMaster = teamMaster;
		this.teamMemberA = teamMemberA;
		this.teamMemberB = teamMemberB;
		this.teamMemberC = teamMemberC;
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public int getTeamPoint() {
		return teamPoint;
	}


	public void setTeamPoint(int teamPoint) {
		this.teamPoint = teamPoint;
	}


	public String getTeamMaster() {
		return teamMaster;
	}


	public void setTeamMaster(String teamMaster) {
		this.teamMaster = teamMaster;
	}


	public String getTeamMemberA() {
		return teamMemberA;
	}


	public void setTeamMemberA(String teamMemberA) {
		this.teamMemberA = teamMemberA;
	}


	public String getTeamMemberB() {
		return teamMemberB;
	}


	public void setTeamMemberB(String teamMemberB) {
		this.teamMemberB = teamMemberB;
	}


	public String getTeamMemberC() {
		return teamMemberC;
	}


	public void setTeamMemberC(String teamMemberC) {
		this.teamMemberC = teamMemberC;
	}
	
	
}
