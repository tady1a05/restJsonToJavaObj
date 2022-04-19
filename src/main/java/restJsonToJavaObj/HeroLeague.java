package restJsonToJavaObj;

import java.util.ArrayList;

public class HeroLeague {
	private String squadName;
	private String homeTown;
	private String formed;
	private String secretBase;
	private boolean active;
	private ArrayList<Member> members;

	public HeroLeague() {

	}

	public HeroLeague(String squadName, String homeTown, String formed, String secretBase, boolean active,
			ArrayList<Member> members) {
		this.squadName = squadName;
		this.homeTown = homeTown;
		this.formed = formed;
		this.secretBase = secretBase;
		this.active = active;
		this.members = members;
	}

	public String getSquadName() {
		return squadName;
	}

	public void setSquadName(String squadName) {
		this.squadName = squadName;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	public String getFormed() {
		return formed;
	}

	public void setFormed(String formed) {
		this.formed = formed;
	}

	public String getSecretBase() {
		return secretBase;
	}

	public void setSecretBase(String secretBase) {
		this.secretBase = secretBase;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public ArrayList<Member> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<Member> members) {
		this.members = members;
	}

	@Override
	public String toString() {
		return "HeroLeague [squadName=" + squadName + ", homeTown=" + homeTown + ", formed=" + formed + ", secretBase="
				+ secretBase + ", active=" + active + ", members=" + members + "]";
	}
}
