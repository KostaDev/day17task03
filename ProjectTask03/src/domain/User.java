package domain;

public class User {

	private String ime;
	private String prezime;
	private String username;
	private final String password;
	private int role;
	
	public User(String ime, String prezime, String username, String password, int role) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.username = username;
		this.password = password;
		this.role = role;
	}


	public String getIme() {
		return ime;
	}


	public String getPrezime() {
		return prezime;
	}
	
	

	public String getUsername() {
		return username;
	}


	public String getPassword() {
		return password;
	}


	public int getRole() {
		return role;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}


	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public void setRole(int role) {
		this.role = role;
	}
	private String roleName(int r){
		String returnString="N/A";
		switch (r){
			case 1: returnString= "ADMIN";
			break;
			case 2:returnString= "EDITOR";
			break;
		}
		return returnString;
	}

	@Override
	public String toString() {
		return "User: ime=" + ime + ", prezime=" + prezime + ", username=" + username + ", role=" +roleName(role);
	}
	

}
