// ui/CalculatorView.java
package ru.gr05507.ui;

import ru.gr05507.domain.Calculation;
import ru.gr05507.domain.MethodRealisation;

import java.util.List;

// Контракт между презентерами и окном
public interface CalculatorView {
    String getFormula();
    String getLowerText();
    String getUpperText();
    String getIntervalsText();
    MethodRealisation getMethod();
    Calculation getSelected();

    void clearForm();
    void showCalculations(List<Calculation> calculations);
    void showError(String message);
}