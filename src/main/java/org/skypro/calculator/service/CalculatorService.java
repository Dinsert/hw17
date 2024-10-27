package org.skypro.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Double plusTwoNumber(Double num1, Double num2) {
        validate(num1,num2);
        return num1 + num2;
    }

    public Double minusTwoNumber(Double num1, Double num2) {
        validate(num1,num2);
        return num1 - num2;
    }

    public Double multiplyTwoNumber(Double num1, Double num2) {
        validate(num1,num2);
        return num1 * num2;
    }

    public Double divideTwoNumber(Double num1, Double num2) {
        validate(num1,num2);
        checkDivisionByZero(num2);
        return num1 / num2;
    }

    private void validate(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            throw new RuntimeException("Нельзя не передать значение");
        }
    }

    private void checkDivisionByZero(Double num2) {
        if (num2 == 0) {
            throw new RuntimeException("На ноль делить нельзя");
        }
    }
}
