package org.skypro.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double plusTwoNumber(double num1, double num2) {
        return num1 + num2;
    }

    public double minusTwoNumber(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplyTwoNumber(double num1, double num2) {
        return num1 * num2;
    }

    public double divideTwoNumber(double num1, double num2) {
        if (num2 == 0) {
            throw new RuntimeException("На ноль делить нельзя");
        }
        return num1 / num2;
    }

}
