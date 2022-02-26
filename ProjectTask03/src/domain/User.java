package domain;

import util.RoleUtil;

public class User {

	private String ime;
	private String prezime;
	private String username;
	private final String password;
	private RoleUtil role;
	
	public User(String ime, String prezime, String username, String password, RoleUtil role) {
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


	public RoleUtil getRole() {
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


	public void setRole(RoleUtil role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "User: ime=" + ime + ", prezime=" + prezime + ", username=" + username + ", role=" + role;
	}
	

}
