package org.skypro.calculator.controller;

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
    public double plusTwoNumber(@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2) {
        return calculatorService.plusTwoNumber(num1, num2);
    }

    @GetMapping("/minus")
    public double minusTwoNumber(@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2) {
        return calculatorService.minusTwoNumber(num1, num2);
    }

    @GetMapping("/multiply")
    public double multiplyTwoNumber(@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2) {
        return calculatorService.multiplyTwoNumber(num1, num2);
    }

    @GetMapping("/divide")
    public Double divideTwoNumber(@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2) {
        return calculatorService.divideTwoNumber(num1, num2);
    }
}
