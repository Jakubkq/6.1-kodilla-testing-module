package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;


import java.util.Scanner;

public class TestingMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double a = 10;
        double b = 5;

        double result = calculator.Add(a, b);
        if (result == 15) {
            System.out.println("test zaliczony");
        }
        else {
            System.out.println("test niezaliczony");
        }

        double result1  = calculator.substract(a , b);
        if (result1 == 5) {
            System.out.println("test zaliczony");
        }
        else {
            System.out.println("test niezaliczony");
        }
        }
    }




