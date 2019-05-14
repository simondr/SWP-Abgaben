package calculator;

import exceptions.InvalidFormatException;

public class Calculator {

    public static int add(String input) throws InvalidFormatException {
        String[] stringNumbers = input.split(";");
        if (stringNumbers.length < 2)
            throw new InvalidFormatException();

        try {
            return Integer.parseInt(stringNumbers[0]) + Integer.parseInt(stringNumbers[1]);
        } catch (NumberFormatException e) {
            throw new InvalidFormatException();
        }
    }
}
