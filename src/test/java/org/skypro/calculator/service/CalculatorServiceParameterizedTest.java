package org.skypro.calculator.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorServiceParameterizedTest {

    private final CalculatorService out = new CalculatorService();

    @ParameterizedTest
    @CsvSource({"2, 1"})
    void plusTwoNumber(Double num1, Double num2) {
        Double expected = num1 + num2;
        Double actual = out.plusTwoNumber(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"2, 1"})
    void minusTwoNumber(Double num1, Double num2) {
        Double expected = num1 - num2;
        Double actual = out.minusTwoNumber(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"2, 1"})
    void multiplyTwoNumber(Double num1, Double num2) {
        Double expected = num1 * num2;
        Double actual = out.multiplyTwoNumber(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"2, 1"})
    void divideTwoNumber(Double num1, Double num2) {
        Double expected = num1 / num2;
        Double actual = out.divideTwoNumber(num1, num2);
        assertEquals(expected, actual);
    }

}