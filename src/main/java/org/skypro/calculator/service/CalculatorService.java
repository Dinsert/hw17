package org.skypro.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int plusTwoNumber(int num1, int num2) {
        return num1 + num2;
    }

    public int minusTwoNumber(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplyTwoNumber(int num1, int num2) {
        return num1 * num2;
    }

    public double divideTwoNumber(double num1, double num2) {
        return num1 / num2;
    }

}
