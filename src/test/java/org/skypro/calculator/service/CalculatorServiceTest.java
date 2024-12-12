package org.skypro.calculator.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

    private final CalculatorService out = new CalculatorService();
    private final Double num1 = 2d;
    private final Double num2 = 1d;
    private final Double zero = 0d;

    @Test
    void plusTwoNumber() {
        Double expected = num1 + num2;
        Double actual = out.plusTwoNumber(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowRuntimeExceptionAtWithoutArgumentsByPlusTwoNumber() {
        assertThrows(RuntimeException.class, () -> out.plusTwoNumber(null, null));
        assertThrows(RuntimeException.class, () -> out.plusTwoNumber(num1, null));
        assertThrows(RuntimeException.class, () -> out.plusTwoNumber(null, num2));
    }

    @Test
    void minusTwoNumber() {
        Double expected = num1 - num2;
        Double actual = out.minusTwoNumber(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowRuntimeExceptionAtWithoutArgumentsByMinusTwoNumber() {
        assertThrows(RuntimeException.class, () -> out.minusTwoNumber(null, null));
        assertThrows(RuntimeException.class, () -> out.minusTwoNumber(num1, null));
        assertThrows(RuntimeException.class, () -> out.minusTwoNumber(null, num2));
    }

    @Test
    void multiplyTwoNumber() {
        Double expected = num1 * num2;
        Double actual = out.multiplyTwoNumber(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowRuntimeExceptionAtWithoutArgumentsByMultiplyTwoNumber() {
        assertThrows(RuntimeException.class, () -> out.multiplyTwoNumber(null, null));
        assertThrows(RuntimeException.class, () -> out.multiplyTwoNumber(num1, null));
        assertThrows(RuntimeException.class, () -> out.multiplyTwoNumber(null, num2));
    }

    @Test
    void divideTwoNumber() {
        Double expected = num1 / num2;
        Double actual = out.divideTwoNumber(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowRuntimeExceptionAtWithoutArgumentsByDivideTwoNumber() {
        assertThrows(RuntimeException.class, () -> out.divideTwoNumber(null, null));
        assertThrows(RuntimeException.class, () -> out.divideTwoNumber(num1, null));
        assertThrows(RuntimeException.class, () -> out.divideTwoNumber(null, num2));
    }

    @Test
    void shouldThrowRuntimeExceptionAtDividingByZero() {
        assertThrows(RuntimeException.class, () -> out.divideTwoNumber(num1, zero));
    }
}