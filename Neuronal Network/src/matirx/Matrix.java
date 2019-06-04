package matirx;

import exceptions.InvalidMatrixException;
import exceptions.InvalidValuesException;

public class Matrix {

    double[][] values;


    public Matrix(int rows, int columns) {
        this.values = new double[rows][columns];
    }

    public Matrix(int rows, int columns, int... values) throws InvalidValuesException {
        if (values.length != rows * columns)
            throw new InvalidValuesException();
        int counter = 0;
        this.values = new double[rows][columns];
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= columns - 1; j++) {
                this.values[i][j] = values[counter];
                counter++;
            }
        }
    }

    public Matrix(double[][] values) {
        this.values = values;
    }

    public int getRows() {
        return values.length;
    }

    public int getColumns() {
        return values[0].length;
    }

    public double[][] getValues() {
        return values;
    }

    public void setValues(double[][] values) {
        this.values = values;
    }

    @Override
    public String toString() {
        String printmatrix = "";
        for (int i = 0; i <= getRows() - 1; i++) {
            for (int j = 0; j <= getColumns() - 1; j++) {
                printmatrix += values[i][j] + " ";
            }
            printmatrix += "\n";
        }
        return printmatrix;
    }


    public boolean equals(Matrix matrix) {
        boolean bool = true;
        for (int i = 0; i <= getRows() - 1; i++) {
            for (int j = 0; j <= getColumns() - 1; j++) {
                if (this.values[i][j] != matrix.getValues()[i][j])
                    bool = false;
            }
        }

        return bool;
    }

    public Matrix multiplyWith(Matrix matrix) throws InvalidMatrixException {

        if (this.getColumns() != matrix.getRows())
            throw new InvalidMatrixException();


        double[][] values = new double[this.getRows()][matrix.getColumns()];

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                for (int k = 0; k < this.getColumns(); k++) {
                    values[i][j] += this.getValues()[i][k] * matrix.getValues()[k][j];
                }
            }
        }

        this.setValues(values);

        return this;

    }

    public Matrix multiplyWith(int scalar) {

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                this.values[i][j] *= scalar;
            }
        }

        return this;
    }


    public Matrix add(Matrix matrix) throws InvalidMatrixException {

        if (this.getColumns() != matrix.getColumns() || this.getRows() != matrix.getRows())
            throw new InvalidMatrixException();

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                this.values[i][j] += matrix.getValues()[i][j];
            }
        }

        return this;
    }

    public double getElement(int row, int column) {
        return this.values[row][column];
    }

    public void setElement(int row, int column, int value) {
        this.values[row][column] = value;

    }

    public double sigmoid(double input){
        return 1/(Math.exp(-input) +1);
    }

}
