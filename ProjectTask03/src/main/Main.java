package main;

import controller.Controller;
import domain.User;
import util.RoleUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User admin = initUser();
        User user = login();
        if (validateAdmin(admin)){

        }


        System.out.println("Welcome: "+admin.getIme());
        System.out.println("Choose what woul you like to do: ");
        System.out.println("To add new user, press 1");
        System.out.println("To see all users, press 2");
        System.out.println("To see specific user, press 3");
        System.out.println("To edit user, press 4");
        System.out.println("To delete, press 5");
        Scanner scanner = new Scanner(System.in);

        int operation = scanner.nextInt();
        Controller.getInstance().chooseOperation(operation);

    }

    private static User login() {
        Scanner scanner = new Scanner(System.in);
        int numberOfTries=4;
        while (numberOfTries>0){
            User user = enterUserNameAndPassword(scanner);
            String userName = scanner.next();
            numberOfTries--;
        }
        return  null;


    }

    private static User enterUserNameAndPassword(Scanner scanner) {
        System.out.println("Enter user Name: ");
        String uName = scanner.next();
        System.out.println("Enter password: ");
        String pass = scanner.next();

        return null;
    }

    private static boolean validateAdmin(User admin) {
        return admin.getRole()==RoleUtil.ADMIN;
    }

    private static User initUser() {
        return new User("kosta","kostic","Kosta123", RoleUtil.ADMIN);
    }
}
