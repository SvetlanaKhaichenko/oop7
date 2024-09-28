package controller;

import model.ComplexNumber;
import service.impl.CalculatorComplexNumber;

public class CalculatorComplexNumController {

    private CalculatorComplexNumber service = new CalculatorComplexNumber();

    public void sum(ComplexNumber a, ComplexNumber b){
        service.sum(a, b);
    }
    public void subtraction(ComplexNumber a, ComplexNumber b){
        service.subtraction(a, b);
    }
    public void multiply(ComplexNumber a, ComplexNumber b){
        service.multiply(a, b);
    }
    public void division(ComplexNumber a, ComplexNumber b){
        service.division(a, b);
    }
    public ComplexNumber result(){
        return service.result();
    }
    public void update(){
        service.update();
    }
}
