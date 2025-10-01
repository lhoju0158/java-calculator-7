package calculator.controller.calculator;

import calculator.view.AddCalculatorView;
import calculator.view.CalculatorView;

public class AddCalculator implements Calculator {
    private final CalculatorView addCalculatorView;

    public AddCalculator() {
        this(new AddCalculatorView());
    }

    public AddCalculator(CalculatorView addCalculatorView) {
        this.addCalculatorView = addCalculatorView;
    }

    @Override
    public void startCalculation() {
        String input = addCalculatorView.input();

    }
}
