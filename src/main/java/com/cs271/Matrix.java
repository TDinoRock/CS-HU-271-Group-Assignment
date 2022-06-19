package com.cs271;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matrix {
    public int[][] to2DArray() { return matrix; }

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
        return new Matrix();
    }

    public static Matrix transposition(Matrix a) {
        return new Matrix();
    }

    public static int determinate(int c, Matrix a) {
        return 0;
    }

    public static Boolean isEqual(Matrix a, Matrix b) throws InvalidMatrixOperation {
        int[][] firstMatrix = a.to2DArray();
        int[][] secondMatrix = b.to2DArray();

        if (firstMatrix.length != secondMatrix.length) {
            System.out.println("\t- Rows were not the same");
            return false;
        }

        if (firstMatrix.length == 0 && secondMatrix.length == 0) {}
        else {
            if (firstMatrix.length > 0 && secondMatrix.length > 0) {
                for (int row = 0; row < firstMatrix.length; row++) {
                    if (firstMatrix[row].length != secondMatrix[row].length) {
                        System.out.println("\t- Columns were not the same");
                        return false;
                    }
                }
            }
        }

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int column = 0; column < firstMatrix[row].length; column++) {
                if (firstMatrix[row][column] != secondMatrix[row][column]) {
                    System.out.println("\t- Information in same sized matrices are different");
                    return false;
                }
            }
        }

        return true;
    }

}
