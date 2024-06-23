package com.calculator.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String welcome() {
        return "<b>Добро пожаловать<b>";
    }

    public String welcomeToCalculator() {
        return "<b>Добро пожаловать в калькулятор<b>";
    }

    public int plus(int num1, int num2) {
        int sum1 = num1 + num2;
        return sum1;
    }
}
