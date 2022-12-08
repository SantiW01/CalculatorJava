package com.mycompany.calculator;
/**
 *
 * @author mweih
 */
public class Calculator {

    public static void main(String[] args) {
        int result;
        UserOption userOption = new UserOption();
        System.out.println("Choose which Operator do. 1 for Plus. 2 for Substraction. 3 for Times. 4 for Divide");
        UserChoice userChoice = new UserChoice();
        result = userOption.UserChoose(userChoice.userChoice);
        System.out.println(result);
    }
}