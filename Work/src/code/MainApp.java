package code;

import model.vo.Team;

public class MainApp {
	public boolean addMember() {
		try {
			Team team = new Team();
			// Database 에 멤버 추가

			if (team.getTeamMemberA() == null) {
				team.setTeamMemberA(null);

				return true;
			} else if (team.getTeamMemberB() == null) {
				team.setTeamMemberB(null);

				return true;
			} else if (team.getTeamMemberC() == null) {
				team.setTeamMemberC(null);

				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
