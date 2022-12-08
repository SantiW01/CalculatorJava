/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;
import java.util.Scanner;
/**
 *
 * @author mweih
 */
public class UserOption {
    private int firstSetNumber;
    private int secondSetNumber;
    private int result;
    protected int UserChoose(int userChoose) {
            switch(userChoose) {
            case 1 -> {
                Plus plus = new Plus();
                Scanner FirstNumberPlus = new Scanner(System.in);
                System.out.println("Input first number: ");
                int firstNumber = FirstNumberPlus.nextInt();
                Scanner SecondNumberPlus = new Scanner(System.in);
                System.out.println("Input second number: ");
                int secondNumber = SecondNumberPlus.nextInt();
                plus.setNumbers(firstNumber, 0);
                plus.setNumbers(secondNumber, 1);
                firstSetNumber = plus.GetNumbers(0);
                secondSetNumber = plus.GetNumbers(1);
                result = firstSetNumber + secondSetNumber;
            }
            case 2 -> {
                Substract substracion = new Substract();
                Scanner firstNumberSubstracion = new Scanner(System.in);
                System.out.println("Input first number: ");
                int firstNumber = firstNumberSubstracion.nextInt();
                Scanner secondNumberSubstraction = new Scanner(System.in);
                System.out.println("Input second number: ");
                int secondNumber = secondNumberSubstraction.nextInt();
                substracion.setNumbers(firstNumber, 0);
                substracion.setNumbers(secondNumber, 1);
                firstSetNumber = substracion.GetNumbers(0);
                secondSetNumber = substracion.GetNumbers(1);
                result = firstSetNumber - secondSetNumber;
            }
            case 3 -> {
                Divide divide = new Divide();
                Scanner firstNumberDivide = new Scanner(System.in);
                System.out.println("Input first number: ");
                int firstNumber = firstNumberDivide.nextInt();
                Scanner secondNumberTimes = new Scanner(System.in);
                System.out.println("Input second number: ");
                int secondNumber = secondNumberTimes.nextInt();
                divide.setNumbers(firstNumber, 0);
                divide.setNumbers(secondNumber, 1);
                firstSetNumber = divide.GetNumbers(0);
                secondSetNumber = divide.GetNumbers(1);
                result = firstSetNumber * secondSetNumber;
            }
            case 4 -> {
                Times times = new Times();
                Scanner firstNumberTimes = new Scanner(System.in);
                System.out.println("Input first number: ");
                int firstNumber = firstNumberTimes.nextInt();
                Scanner secondNumberDivide = new Scanner(System.in);
                System.out.println("Input second number: ");
                int secondNumber = secondNumberDivide.nextInt();
                times.setNumbers(firstNumber, 0);
                times.setNumbers(secondNumber, 1);
                firstSetNumber = times.GetNumbers(0);
                secondSetNumber = times.GetNumbers(1);
                result = firstSetNumber / secondSetNumber;
            }
        }

            return result;
    }
}
