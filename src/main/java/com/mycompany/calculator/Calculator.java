package com.mycompany.calculator;
//import java.util.Scanner;
/**
 *
 * @author mweih
 */
public class Calculator {

    public static void main(String[] args) {
    }
}

abstract class Operator {
    protected int[] operationTerms = new int[2];
    
    public abstract int GetNumbers(int index);
    
    public abstract void setNumbers(int number, int index);
    
 }

class Plus extends Operator { 
    @Override
    public void setNumbers(int number, int index) {
        this.operationTerms[index] = number;
    }
    
    @Override
    public int GetNumbers(int index) {
        return operationTerms[index];
    }
}

class Substracion extends Operator {
    @Override
    public void setNumbers(int number, int index) {
        this.operationTerms[index] = number;
    }
    
    @Override
    public int GetNumbers(int index) {
        return operationTerms[index];
    }
}

class Times extends Operator {
    @Override
    public void setNumbers(int number, int index) {
        this.operationTerms[index] = number;
    }
    
    @Override
    public int GetNumbers(int index) {
        return operationTerms[index];
    }
}

class Divide  extends Operator {
    @Override
    public void setNumbers(int number, int index) {
        this.operationTerms[index] = number;
    }
    
    @Override
    public int GetNumbers(int index) {
        return operationTerms[index];
    }
}


        /*Scanner inputFirstNumber = new Scanner(System.in);
        System.out.println("Input first number: ");
        
        int firstNumber = inputFirstNumber.nextInt();
        System.out.println(firstNumber);
        
        Scanner inputSecondNumber = new Scanner(System.in);
        System.out.println("Input second number: ");
        
        int secondNumber = inputSecondNumber.nextInt();
        Sytem.out.println(secondNumber);*/

 