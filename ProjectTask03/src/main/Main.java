package main;

import controller.Controller;
import crud.Crud;
import domain.User;
import repository.UserRepository;
import util.RoleUtil;

import java.util.Scanner;

public class Main {
    static{
        initUser();
    }

    static User user = login();
    public static void main(String[] args) {


        if (validateAdmin(user)){
            doAdminOperations();
        }

    }

    private static void doAdminOperations() {
        System.out.println("Welcome: "+user.getIme());
        System.out.println("Choose what woul you like to do: ");
        System.out.println("To add new user, press 1");
        System.out.println("To see all users, press 2");
        System.out.println("To see specific user, press 3");
        System.out.println("To edit user, press 4");
        System.out.println("To delete, press 5");
        Scanner scanner = new Scanner(System.in);

        int operation = scanner.nextInt();
        Controller.getInstance().chooseOperation(operation);
        while(operation !=0) {
            System.out.println("Choose what woul you like to do: ");
            operation = scanner.nextInt();
            Controller.getInstance().chooseOperation(operation);
        }
    }

    private static User login() {
        Scanner scanner = new Scanner(System.in);
        int numberOfTries=4;
        while (numberOfTries>=0){
            User user = enterUserNameAndPassword(scanner);
            if (user!=null) return user;
            numberOfTries--;
            System.out.println("Ostalo Vam je jos: "+numberOfTries+" pokusaja");
        }
        return  null;



    }

    private static User enterUserNameAndPassword(Scanner scanner) {
        System.out.println("Enter user Name: ");
        String uName = scanner.next();
        System.out.println("Enter password: ");
        String pass = scanner.next();
        return Crud.logIn(uName,pass);

    }

    private static boolean validateAdmin(User admin) {
        return admin.getRole()==RoleUtil.ADMIN;
    }

    private static void initUser() {
        User user = new  User("kosta","kostic", "koki","Kosta123", RoleUtil.ADMIN);
        UserRepository.getInstance().getUserList().add(user);
    }
}
