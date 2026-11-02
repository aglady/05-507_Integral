package ru.gr05507.domain;

public record MethodRealisation(
        String name,
        IntegralStrategy strategy
) {
    @Override
    public String toString() {
        return name;
    }
}
