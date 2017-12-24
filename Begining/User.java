package Begining;

public class User {

	private String username;
	private int userid;
	

	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	@Override
	public String toString() {
		return "User [username=" + username + ", userid=" + userid + "]";
	}


	public User(String username, int userid) {
		super();
		this.username = username;
		this.userid = userid;
	}

	
}
