import controller.CalculatorComplexNumController;
import controller.LogCalculalatorComplexNum;
import controller.LoggerConsole;

import view.CalculatorComplexNumberView;

public class Main {
    public static void main(String[] args) {

        new CalculatorComplexNumberView(new LogCalculalatorComplexNum(new CalculatorComplexNumController(), new LoggerConsole())).start();

    }
}