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

    @GetMapping(path = "/calculator")
    public String answerWelcome(String welcomeToCalculator) {
        return calculatorService.welcomeToCalculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String answerPlus(@RequestParam("num1") int num1,
                          @RequestParam("num1") int num2) {
        int sum = calculatorService.plus(num1, num2);
        return num1 + " + " + num2 + " = " + sum;
    }
    @GetMapping(path = "/calculator/minus")
    public String answerMinus(@RequestParam("num1") int num1,
                          @RequestParam("num1") int num2) {
        int sum = calculatorService.minus(num1, num2);
        return num1 + " - " + num2 + " = " + sum;
    }
    @GetMapping(path = "/calculator/multiply")
    public String answerMultiply(@RequestParam("num1") int num1,
                           @RequestParam("num1") int num2) {
        int sum = calculatorService.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + sum;
    }
    @GetMapping(path = "/calculator/divide")
    public String answerDivide(@RequestParam("num1") int num1,
                           @RequestParam("num1") int num2) {
        int sum = calculatorService.divide(num1, num2);
        return num1 + " / " + num2 + " = " + sum;
    }
}
