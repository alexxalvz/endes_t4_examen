package org.example;

public class InterestCalculator {
    double calculateInterest(double principal, double rate, int time) {
        // Cálculo del interés compuesto para 365 días al año
        return principal * Math.pow(1 + (rate / 365), time * 365);
    }
}
