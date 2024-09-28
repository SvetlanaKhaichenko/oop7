package controller;

import model.ComplexNumber;
import service.Calculable;



public class LogCalculalatorComplexNum implements Calculable {
    private final CalculatorComplexNumController controller;
    private final Loggable logger;


    public LogCalculalatorComplexNum(CalculatorComplexNumController controller, Loggable logger) {
        this.controller = controller;
        this.logger = logger;
    }

    @Override
    public void sum(ComplexNumber a, ComplexNumber b) {
        logger.log("Складываю "+ a + " + " + b + "/n");
        controller.sum(a, b);
    }

    @Override
    public void subtraction(ComplexNumber a, ComplexNumber b) {
        logger.log("Вычитаю "+ a + " - " + b + "/n");
        controller.subtraction(a, b);
    }

    @Override
    public void multiply(ComplexNumber a, ComplexNumber b) {
        logger.log("Умножаю "+ a + " * " + b + "/n");
        controller.multiply(a, b);
    }

    @Override
    public void division(ComplexNumber a, ComplexNumber b) {
        logger.log("Делю "+ a + " / " + b + "/n");
        controller.division(a, b);
    }

    @Override
    public ComplexNumber result() {
        logger.log("Результат равен: " + controller.result());
        return controller.result();
    }

    @Override
    public void update() {
        controller.update();
    }
}
