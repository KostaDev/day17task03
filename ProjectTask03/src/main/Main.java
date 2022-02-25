package main;

import domain.User;
import util.RoleUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User admin = new User("kosta","kostic","Kosta123", RoleUtil.ADMIN);
        System.out.println("Welcome: "+admin.getIme());
        System.out.println("Choose what woul you like to do: ");
        System.out.println("To add new user, press 1");
        System.out.println("To see all users, press 2");
        System.out.println("To see specific user, press 3");
        System.out.println("To edit user, press 4");
        System.out.println("To delete, press 5");
        Scanner scanner = new Scanner(System.in);

        int operation = scanner.nextInt();


    }
}
