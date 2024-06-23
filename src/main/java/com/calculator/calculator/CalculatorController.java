package com.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping(path = "/calculator")
    public String answerWelcome(String welcomeToCalculator) {
        return calculatorService.welcomeToCalculator();
    }
    @GetMapping(path = "/calculator")
    public int answerPlus(@RequestParam("plus") int sum) {
        return calculatorService.plus(5, 5);
    }
}
