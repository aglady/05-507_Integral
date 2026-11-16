package ru.gr05507.domain;

import java.util.function.DoubleUnaryOperator;

public class TimedIntegralStrategy implements IntegralStrategy{
    private final IntegralStrategy inner;
    private long elapsed;

    public TimedIntegralStrategy(IntegralStrategy inner) {
        this.inner = inner;
    }

    @Override
    public double calculateOfIntegral(DoubleUnaryOperator f, double a, double b, int n) {
        var startTime = System.nanoTime();
        var result = inner.calculateOfIntegral(f, a, b, n);
        var finalTime = System.nanoTime();
        elapsed = finalTime - startTime;
        return result;
    }

    public long getElapsed() {
        return elapsed;
    }
}
