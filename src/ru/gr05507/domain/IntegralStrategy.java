package ru.gr05507.domain;

import java.util.function.DoubleUnaryOperator;

@FunctionalInterface

public interface IntegralStrategy {
    double calculateOfIntegral(DoubleUnaryOperator f, double a, double b, int n);
}
