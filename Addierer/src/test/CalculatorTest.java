package test;

import calculator.Calculator;
import exceptions.InvalidFormatException;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void validInput() throws InvalidFormatException {
        Assert.assertEquals(1, Calculator.add("4;7"));
    }

    @Test(expected = InvalidFormatException.class)
    public void validDelimiter() throws InvalidFormatException {
        Calculator.add("4 7");
    }

    @Test(expected = InvalidFormatException.class)
    public void validNumber() throws InvalidFormatException {
        Calculator.add("4;a");
    }

}