package by.artem.entity;

import java.util.List;

public class User {

    private String name;
    private String login;
    private String password;
    private Role role;
    private List<Double> individualUserHistory;

    public User(String name, String login, String password, Role role, List<Double> individualUserHistory) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.role = role;
        this.individualUserHistory = individualUserHistory;
    }


    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Double> getIndividualUserHistory() {
        return individualUserHistory;
    }

    public void setIndividualUserHistory(List<Double> individualUserHistory) {
        this.individualUserHistory = individualUserHistory;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
