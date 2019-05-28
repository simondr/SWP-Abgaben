package tests;

import exceptions.InvalidMatrixException;
import exceptions.InvalidValuesException;
import matirx.Matrix;
import org.junit.Assert;
import org.junit.Test;


public class MatrixTest {


    @Test
    public void rowsAndColumns() {
        Matrix m = new Matrix(2, 2);
        Assert.assertEquals(2, m.getColumns());
        Assert.assertEquals(2, m.getRows());
    }


    @Test
    public void initializeMatrixWithValues() throws InvalidValuesException {

        Matrix m = new Matrix(2, 3, 1, 2, 3, 4, 5, 6);
        Assert.assertEquals(3, m.getColumns());
        Assert.assertEquals(2, m.getRows());
        float[][] shouldbevalues = {{1, 2, 3}, {4, 5, 6}};
        Matrix shouldbe = new Matrix(2, 3);
        shouldbe.setValues(shouldbevalues);
        Assert.assertTrue(m.equals(shouldbe));
    }

    @Test
    public void getValues() throws InvalidValuesException {
        float[][] values = {{1, 2, 3}, {4, 5, 6}};
        Matrix m = new Matrix(values);
        Assert.assertEquals(values, m.getValues());


    }

    @Test
    public void initializeMatrixWithArray() throws InvalidValuesException {

        float[][] values = {{1, 2, 3}, {4, 5, 6}};
        Matrix shouldbe = new Matrix(2, 3, 1, 2, 3, 4, 5, 6);
        Matrix m = new Matrix(values);
        Assert.assertTrue(m.equals(shouldbe));
    }

    @Test(expected = InvalidValuesException.class)
    public void invalidInitializationValues() throws InvalidValuesException {
        Matrix m = new Matrix(2, 3, 1, 2, 3, 4, 5); }

    @Test
    public void multiplyMatrices() throws InvalidMatrixException, InvalidValuesException {
        Matrix a = new Matrix(2, 2, 1, 2, 3, 4);
        Matrix b = new Matrix(2, 3, 1, 2, 3, 4, 5, 6);
        Matrix shouldbe = new Matrix(2, 3, 9, 12, 15, 19, 26, 33);
        a.multiplyWith(b);
        Assert.assertTrue(a.equals(shouldbe));
    }

    @Test(expected = InvalidMatrixException.class)
    public void invalidMatricesMultiplication() throws InvalidMatrixException, InvalidValuesException {
        Matrix a = new Matrix(2, 2, 1, 2, 3, 4);
        Matrix b = new Matrix(3, 2, 1, 2, 3, 4, 5, 6);
        Matrix shouldbe = new Matrix(2, 3, 9, 12, 15, 19, 26, 33);
        a.multiplyWith(b); }

    @Test
    public void multiplyWithScalar() throws InvalidValuesException {
        Matrix a = new Matrix(2, 2, 1, 2, 3, 4);
        a.multiplyWith(2);
        Matrix shouldbe = new Matrix(2, 2, 2, 4, 6, 8);
        Assert.assertTrue(a.equals(shouldbe));
    }

    @Test
    public void addMatrices() throws InvalidValuesException, InvalidMatrixException {
        Matrix a = new Matrix(2, 3, 1, 2, 3, 4, 5, 6);
        Matrix b = new Matrix(2, 3, 1, 2, 3, 4, 5, 6);
        a.add(b);
        Matrix shouldbe = new Matrix(2, 3, 2, 4, 6, 8, 10, 12);
        Assert.assertTrue(a.equals(shouldbe));
    }

    @Test
    public void getElement() throws InvalidValuesException {
        Matrix a = new Matrix(2, 3, 1, 2, 3, 4, 5, 6);
        Assert.assertEquals(2, a.getElement(0, 1), 0);
    }

    @Test
    public void setElement() throws InvalidValuesException {
        Matrix a = new Matrix(2, 3, 1, 2, 3, 4, 5, 6);
        a.setElement(0, 1, 10000);
        Assert.assertEquals(10000, a.getElement(0, 1), 0);
    }

    @Test
    public void equals() throws InvalidValuesException {
        Matrix a = new Matrix(2, 2, 1, 2, 3, 4);
        Matrix b = new Matrix(2, 2, 1, 2, 3, 4);
        Assert.assertTrue(a.equals(b));
    }

    @Test
    public void notEqual() throws InvalidValuesException {
        Matrix a = new Matrix(2, 2, 1, 2, 3, 4);
        Matrix b = new Matrix(2, 2, 2, 2, 3, 4);
        Assert.assertTrue(!a.equals(b));
    }

    @Test
    public void toSting() throws InvalidValuesException{
        Matrix a = new Matrix(2, 2, 1, 2, 3, 4);
        Assert.assertEquals("1.0 2.0 \n3.0 4.0 \n", a.toString());
    }

    @Test (expected = InvalidMatrixException.class)
    public void invalidMatricesAddition() throws InvalidMatrixException, InvalidValuesException {
        Matrix a = new Matrix(2, 3, 1, 2, 3, 4, 5, 6);
        Matrix b = new Matrix(2, 2, 1, 2, 3, 4);
        a.add(b); }

}