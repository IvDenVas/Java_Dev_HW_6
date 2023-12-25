package org.example;


public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setX(4);
        calculator.setY(56);
        calculator.sum();
        Calculator calculator1 = new Calculator(100, 300);
        calculator1.sum();
    }

}