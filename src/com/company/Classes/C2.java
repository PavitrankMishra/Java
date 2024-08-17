package com.company.Classes;

import java.util.*;

class Calculator {
    public int num1;
    public int num2;
    public int num3;

    public double calculateAverage(int n1, int n2 , int n3) {
        double result = 0;
        result = Math.round((n1+n2+n3)/3);
        return result;
    }
}
public class C2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        calc.num1 = 15;
        calc.num2 = 10;
        calc.num3 = 25;
        double res = calc.calculateAverage(calc.num1, calc.num2, calc.num3);
        System.out.println(res);
    }
}
