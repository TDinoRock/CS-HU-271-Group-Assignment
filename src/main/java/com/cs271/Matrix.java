package com.cs271;


import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matrix {
    public int[][] to2DArray() {
        return matrix;
    }

    private int[][] matrix;


    public void load(String matrixContent) {
    }

    public void load(int[][] matrix) {
        this.matrix = matrix;
    }

    public String toString() {
        return "";
    }

    public void print() {
    }

    public int numberOfColumns() {
        return this.matrix[0].length;
    }

    public int numberOfRows() {
        return this.matrix.length;
    }


    public static Matrix add(Matrix a, Matrix b) throws InvalidMatrixOperation {
        return  new Matrix();
    }

    public static Matrix add(int c, Matrix a) {
        return new Matrix();
    }

    public static Matrix subtract(Matrix a, Matrix b) throws InvalidMatrixOperation {
        return new Matrix();
    }

    public static Matrix subtract(int c, Matrix a) {
        return new Matrix();
    }

    public static Matrix multiply(Matrix a, Matrix b) throws InvalidMatrixOperation {
        return new Matrix();
    }

    public static Matrix multiply(int c, Matrix a) {
        if (a == null) {
            throw new NullPointerException("The matrix is null");
        }

            Matrix scalarMultiply = new Matrix();
            int[][] smMatrix = a.to2DArray();
            for (int rows = 0; rows < smMatrix.length; rows++) {
                for (int cols = 0; cols < smMatrix[rows].length; cols++) {
                    smMatrix[rows][cols] = c * smMatrix[rows][cols];
                }
            }
            scalarMultiply.load(smMatrix);
            return scalarMultiply;
    }

    public static Matrix transposition(Matrix a) {
        return new Matrix();
    }

    public static int determinate(int c, Matrix a) {
        return 0;
    }

    public static Boolean isEqual(Matrix a, Matrix b) throws InvalidMatrixOperation {
        if (a == null || b == null) {
            throw new NullPointerException("One or both of the matrices are null");
        }

        int[][] firstMatrix = a.to2DArray();
        int[][] secondMatrix = b.to2DArray();

        if (firstMatrix.length != secondMatrix.length) {
            throw new InvalidMatrixOperation("Error: The matrices are different sizes (rows)");
        }

        if (firstMatrix.length == 0 && secondMatrix.length == 0) {}
        else {
            if (firstMatrix.length > 0 && secondMatrix.length > 0) {
                for (int row = 0; row < firstMatrix.length; row++) {
                    if (firstMatrix[row].length != secondMatrix[row].length) {
                        throw new InvalidMatrixOperation("Error: The matrices are different sizes (columns)");
                    }
                }
            }
        }

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int column = 0; column < firstMatrix[row].length; column++) {
                if (firstMatrix[row][column] != secondMatrix[row][column]) {
                    throw new InvalidMatrixOperation("Error: Matrices contain different values " +
                                    firstMatrix[row][column] + "!=" + secondMatrix[row][column]);
                }
            }
        }

        return true;
    }

}
