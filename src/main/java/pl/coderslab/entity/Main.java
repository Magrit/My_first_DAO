package pl.coderslab.entity;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserDAO userDAO = new UserDAO();
        List<User> userList = userDAO.findAll();
    }
}
