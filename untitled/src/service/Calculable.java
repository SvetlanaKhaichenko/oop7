package service;

import model.ComplexNumber;

public interface Calculable {

    void sum(ComplexNumber a, ComplexNumber b);
    void subtraction(ComplexNumber a, ComplexNumber b);
    void multiply(ComplexNumber a, ComplexNumber b);
    void division(ComplexNumber a, ComplexNumber b);
    ComplexNumber result();
    void update();


}
