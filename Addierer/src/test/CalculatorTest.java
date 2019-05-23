package test;

import calculator.Calculator;
import exceptions.InvalidFormatException;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test(expected = InvalidFormatException.class)
    public void invalidInput() throws InvalidFormatException{
        Assert.assertEquals(11, Calculator.add("4 7", "|"));
        Assert.assertEquals(1, Calculator.add("1"));

    }
    @Test
    public void validInput() throws InvalidFormatException {
        Assert.assertEquals(11, Calculator.add("4|7","|"));
        Assert.assertEquals(12, Calculator.add("4;7;1"));
    }

    @Test(expected = InvalidFormatException.class)
    public void invalidDelimiter() throws InvalidFormatException {
        Calculator.add("4 7");
    }

    @Test(expected = InvalidFormatException.class)
    public void invalidNumber() throws InvalidFormatException {
        Calculator.add("4;a");
    }

}