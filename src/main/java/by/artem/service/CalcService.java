package by.artem.service;

import by.artem.entity.User;

import java.util.ArrayList;
import java.util.List;

public class CalcService {

    private static final List<Double> allHistory = new ArrayList<>();
    UserService userService = new UserService();

    public List<Double> getAll(){
        return new ArrayList<>(allHistory);
    }

    public List<Double> getIndividualUSerHistory(User user){
       return new ArrayList<>(user.getIndividualUserHistory());
    }

    public double sum(double num1, double num2, User user){
        double result = num1 + num2;
        allHistory.add(result);
        userService.addElementIndividualUserHistory(result, user);
        return result;
    }

    public double sub(double num1, double num2, User user){
        double result = num1 - num2;
        allHistory.add(result);
        userService.addElementIndividualUserHistory(result, user);
        return result;
    }

    public double mod(double num1, double num2, User user){
        double result = num1 * num2;
        allHistory.add(result);
        userService.addElementIndividualUserHistory(result, user);
        return result;
    }

    public double div(double num1, double num2, User user){
        double result = num1 / num2;
        allHistory.add(result);
        userService.addElementIndividualUserHistory(result, user);
        return result;
    }
}
