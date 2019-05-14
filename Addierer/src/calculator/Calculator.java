package calculator;

import exceptions.InvalidFormatException;

import java.util.regex.Pattern;

public class Calculator {

    public static int add(String input, String delimiter) throws InvalidFormatException {

        String[] stringNumbers = input.split(Pattern.quote(delimiter));

        if (stringNumbers.length < 2)
            throw new InvalidFormatException();


        try {
            int sum = 0;
            for (int i = 0; i < stringNumbers.length; i++){
                sum += Integer.parseInt(stringNumbers[i]);
            }
            return sum;

        } catch (NumberFormatException e) {
            throw new InvalidFormatException();
        }
    }


    public static int add(String input) throws InvalidFormatException{
        return add(input, ";");
    }

}
