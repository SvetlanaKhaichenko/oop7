package service.impl;

import model.ComplexNumber;
import service.Calculable;

public class CalculatorComplexNumber implements Calculable {

    private ComplexNumber result = new ComplexNumber(0, 0);

    @Override
    public void sum(ComplexNumber a, ComplexNumber b) {
        result.setReal(a.getReal()+ b.getReal());
        result.setImaginary(a.getImaginary()+ b.getImaginary());
    }

    @Override
    public void subtraction(ComplexNumber a, ComplexNumber b) {
        result.setReal(a.getReal()- b.getReal());
        result.setImaginary(a.getImaginary()- b.getImaginary());
    }

    @Override
    public void multiply(ComplexNumber a, ComplexNumber b) {
    result.setReal(a.getReal()* b.getReal()-(a.getImaginary()
    * b.getImaginary()));
    result.setImaginary(a.getReal()*b.getImaginary()+a.getImaginary()*b.getReal());
    }

    @Override
    public void division(ComplexNumber a, ComplexNumber b) {
        result.setReal((a.getReal()* b.getReal()+(a.getImaginary()* b.getImaginary()))/(b.getReal()* b.getReal()+(b.getImaginary())* b.getImaginary()));
        result.setImaginary((a.getImaginary()*b.getReal()-(a.getReal()* b.getImaginary()))/(b.getReal()* b.getReal()+(b.getImaginary())* b.getImaginary()));
    }

    @Override
    public ComplexNumber result() {

        return result;
    }

    @Override
    public void update() {
        result.setReal(0);
        result.setImaginary(0);

    }
}
