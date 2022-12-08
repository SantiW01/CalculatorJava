/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

/**
 *
 * @author mweih
 */
public class Substract extends Operator {
    @Override
    public void setNumbers(int number, int index) {
        this.operationTerms[index] = number;
    }
    
    @Override
    public int GetNumbers(int index) {
        return operationTerms[index];
    }
}
