package com.mycompany.calculator;
//import java.util.Scanner;
/**
 *
 * @author mweih
 */
public class Calculator {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

abstract class Operator {
    protected int[] operationTerms;
    
    public abstract int GetNumbers(int index);
    
    public abstract void setNumbers(int number, int index);
    
 }

