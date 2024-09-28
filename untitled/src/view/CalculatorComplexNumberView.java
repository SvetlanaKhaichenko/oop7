package view;

import model.ComplexNumber;
import service.Calculable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CalculatorComplexNumberView {

    private final Calculable calculator;


    public CalculatorComplexNumberView(Calculable calculator) {
        this.calculator = calculator;
    }

    public void start(){
        while (true){
            menu();
            String end = end();
            if (!end.equalsIgnoreCase("Y")){
                System.exit(0);
            }

        }
    }

    private void menu(){
    double a = getNumber("Введите первое значение комплексного числа A: ");
    double b = getNumber("Введите первое значение комплексного числа A: ");
    String operator = getOperator();
    double c = getNumber("Введите первое значение комплексного числа B: ");
    double d = getNumber("Введите первое значение комплексного числа B: ");
    if (operator.equals("+")){
        calculator.sum(new ComplexNumber(a,b), new ComplexNumber(c, d));
    }
    if (operator.equals("-")){
            calculator.subtraction(new ComplexNumber(a,b), new ComplexNumber(c, d));
        }
    if (operator.equals("/")){
            calculator.division(new ComplexNumber(a,b), new ComplexNumber(c, d));
        }
    if (operator.equals("*")){
            calculator.multiply(new ComplexNumber(a,b), new ComplexNumber(c, d));
        }
    calculator.result();
    calculator.update();
    }

    private int getNumber(String message){
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        int result = -1;
        try {
            result = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e){
            System.err.println("Incorrect input");
            getNumber(message);
        }
        return result;
    }

    private String getOperator(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите оператор (+, -, /, *): ");
        String operator = scan.nextLine();
        while (true){
            if (!checkOperators(operator)){
                System.err.println("Incorrect operator, please repeat the input (+, -, /, *) : ");
                operator = scan.nextLine();
            } else return operator;
        }

    }
    private boolean checkOperators(String operator){
//        List<String> op = new ArrayList<>(Arrays.asList("+", "-", "/", "*"));
        return Arrays.asList("+", "-", "/", "*").contains(operator);
    }
    private String end(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Продолжить? Нажмите Y/N");
        String end = scan.nextLine();
        return end;
    }
}
