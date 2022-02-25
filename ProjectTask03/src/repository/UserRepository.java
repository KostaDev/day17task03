package repository;

import domain.User;

import java.util.List;

public class UserRepository {
    List<User> userList;

    public UserRepository(List<User> userList) {
        this.userList = userList;
    }
}
