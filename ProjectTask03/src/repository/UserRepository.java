package repository;

import domain.User;

import java.util.ArrayList;
import java.util.List;

public  class UserRepository {
    private static UserRepository instance;
    private static List<User> userList;

    private UserRepository() {
        userList = new ArrayList<>();
    }

    public static List<User> getUserList() {
        return userList;
    }

    public static UserRepository getInstance() {
        if (instance==null) {
            instance=new UserRepository();
        }
        return instance;
    }
}
