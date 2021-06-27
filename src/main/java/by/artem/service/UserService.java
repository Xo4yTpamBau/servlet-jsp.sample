package by.artem.service;

import by.artem.entity.Role;
import by.artem.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private static final List<User> userList = new ArrayList<>();

    public void registrationUser(String login, String password, String name) {
        userList.add(new User(login, password, name, Role.ADMIN, new ArrayList<>()));
    }

    public User getByLogin(String login) {
        for (User user : userList) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }

    public boolean containsByLogin (String login){
        for (User user : userList) {
            if (user.getLogin().equals(login)){
                return true;
            }
        }
        return false;
    }
    public void addElementIndividualUserHistory(Double element, User user){
        List<Double> individualUserHistory = user.getIndividualUserHistory();
        individualUserHistory.add(element);
    }

}
