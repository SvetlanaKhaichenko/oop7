package model;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    @Override
    public String toString() {
        if (imaginary > 0) {
        return "ComplexNumber{" + real + " + " +
                imaginary + "i" +
                '}'; }
        if (imaginary == 0) {
            return "ComplexNumber{" + real+ '}'; }
        if (real==0){
            return "ComplexNumber{"  +
                    imaginary + "i" +
                    '}';
        }
        else {
            return "ComplexNumber{" + real  +
                    imaginary + "i" +
                    '}';
        }
    }

    public double getImaginary() {
        return imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }
}
