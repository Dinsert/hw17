package org.skypro.calculator.controller;

import static java.lang.String.*;

import org.skypro.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/calculator")
@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public double plusTwoNumber(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculatorService.plusTwoNumber(num1, num2);
    }

    @GetMapping("/minus")
    public double minusTwoNumber(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculatorService.minusTwoNumber(num1, num2);
    }

    @GetMapping("/multiply")
    public double multiplyTwoNumber(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculatorService.multiplyTwoNumber(num1, num2);
    }

    @GetMapping("/divide")
    public double divideTwoNumber(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculatorService.divideTwoNumber(num1, num2);
    }
}
