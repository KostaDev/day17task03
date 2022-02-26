package crud;

import java.util.Scanner;

import domain.User;
import repository.UserRepository;
import util.RoleUtil;

public class Crud {

	static Scanner s = new Scanner(System.in);
	
	
	public static void createNewUser() {
		System.out.println("Enter user name: ");
		String name = s.nextLine();
		
		System.out.println("enter user surname: ");
		String surname = s.nextLine();
		
		System.out.println("Enter user username: ");
		String username = s.nextLine();
		
		System.out.println("Enter user password: ");
		String password = s.nextLine();
		
	//	System.out.println("Enter user role: ");
	//	int role = s.nextInt();
	//	RoleUtil newRole = RoleUtil.ADMIN;
		
		
		
		if((!exists(username)) & startsWithLetter(password) & containsNumber(password)) {
			System.out.println("Confirm your password please: ");
			String passwordConfirm = s.nextLine();
			if(passwordConfirm.equals(password)) {
				
				User newUser = new User(name, surname, username, password, RoleUtil.USER);
				UserRepository.getInstance().getUserList().add(newUser);
				System.out.println("Added new User "+ name + " " + surname);
				
			}
			else {
				System.out.println("Wrong password confirmation! ");
			}
			
		}
		else {
			System.out.println("Wrong input!");
		}
		
	}
	
	public static void showAll() {
		for(User users : UserRepository.getInstance().getUserList()) {
			System.out.println(users);
		}
	}
	
	public static void showUser() {
		System.out.println("Enter username: ");
		String usernameSearch = s.nextLine();
		for(User users : UserRepository.getInstance().getUserList()) {
			if(users.getUsername().equals(usernameSearch)) {
				System.out.println(users);
			}
		}
	}
	
	public static void editUser() {
		User user = null;
		System.out.println("Enter username: ");
		String usernameSearch = s.nextLine();
		for(User users : UserRepository.getInstance().getUserList()) {
			if(users.getUsername().equals(usernameSearch)) {
				user = users;
			}
			else {
				System.out.println("There is no User with this username!");
				return;
			}
		}
		
		System.out.println("Enter user name: ");
		String name = s.nextLine();
		
		System.out.println("enter user surname: ");
		String surname = s.nextLine();
		
		System.out.println("Enter user username: ");
		String username = s.nextLine();
		
		if((!exists(username)) || (exists(username) & user.getUsername().equals(username))) {
			user.setIme(name);
			user.setPrezime(surname);
			user.setUsername(username);
			System.out.println("User updated!");
		}
		
		else {
			System.out.println("This username already exists!");
		}
		
	}
	
	public static void deleteUser() {
		User user = null;
		System.out.println("Enter username: ");
		String usernameSearch = s.nextLine();
		for(User users : UserRepository.getInstance().getUserList()) {
			if(users.getUsername().equals(usernameSearch)) {
				user = users;
			}
			else {
				System.out.println("There is no User with this username!");
			}
		}
		UserRepository.getInstance().getUserList().remove(user);
		System.out.println("Deleted user " + user.getIme() + " " + user.getPrezime());
	}
	
	public static boolean exists(String username) {
		boolean answer = false;
		for(User users : UserRepository.getInstance().getUserList()) {
			if(users.getUsername().equals(username)) {
				answer = true;
				break;
			}
		}
		return answer;
	}
	
	public static boolean startsWithLetter(String username) {
		if(Character.isLetter(username.charAt(0))) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean containsNumber(String username) {
		boolean answer = false;
		for(int i = 0; i<username.length(); i++) {
			if(Character.isDigit(username.charAt(i))) {
				answer = true;
				break;
			}
			
		}
		return answer;
	}

}
