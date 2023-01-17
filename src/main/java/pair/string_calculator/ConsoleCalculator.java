package pair.string_calculator;

import pair.string_calculator.calculator.Calculator;

import java.util.Optional;
import java.util.Scanner;

public class ConsoleCalculator {
    private final Scanner scanner;
    private final Calculator calculator;
    private String calculation;

    public ConsoleCalculator(Scanner scanner, Calculator calculator) {
        this.scanner = scanner;
        this.calculator = calculator;
    }

    public ConsoleCalculator readCalculation() {
        write("Écrivez votre calcul: ");
        this.calculation = readNextLine();
        return this;
    }

    public void calculate() {
        Optional.ofNullable(this.calculation)
                .filter(this::hasText)
                .ifPresent(actualCalculation -> write(actualCalculation + "=" + calculator.calculate(actualCalculation)));

    }

    private boolean hasText(String currentString) {
        return !currentString.isBlank();
    }

    private String readNextLine() {
        return scanner.nextLine().trim();
    }

    private void write(String stringToWriteOnConsole) {
        System.out.println(stringToWriteOnConsole);
    }
}
