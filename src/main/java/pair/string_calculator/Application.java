package pair.string_calculator;

import pair.string_calculator.calculator.DefaultCalculator;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        ConsoleCalculator consoleCalculator = new ConsoleCalculator(
                new Scanner(System.in),
                new DefaultCalculator()
        );

        do {
            consoleCalculator
                    .readCalculation()
                    .calculate();
        } while (true);
    }

}
