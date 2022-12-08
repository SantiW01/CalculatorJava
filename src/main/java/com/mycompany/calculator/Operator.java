/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;
/**
 *
 * @author mweih
 */
abstract class Operator {
    protected int[] operationTerms = new int[2];
    
    public abstract int GetNumbers(int index);
    
    public abstract void setNumbers(int number, int index);
    
 }