package domain;

import util.RoleUtil;

public class User {
	private final String ime;
	private final String prezime;
	private final String password;
	private final RoleUtil role;
	
	
	public User(String ime, String prezime, String password, RoleUtil role) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.password = password;
		this.role = role;
	}


	public String getIme() {
		return ime;
	}


	public String getPrezime() {
		return prezime;
	}


	public String getPassword() {
		return password;
	}


	public RoleUtil getRole() {
		return role;
	}


	@Override
	public String toString() {
		return "User: ime=" + ime + ", prezime=" + prezime + ", password=" + password + ", role=" + role;
	}
	

}
