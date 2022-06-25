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

    public static StringBuilder toString(Matrix a) throws NullPointerException {
        if (a == null) {
            throw new NullPointerException("Matrix is null");
        }

        int[][] printedMatrix = a.to2DArray();
        StringBuilder stringedMatrix = new StringBuilder();
        for (int[] ints : printedMatrix) {
            for (int anInt : ints) {
                stringedMatrix.append(anInt);
                stringedMatrix.append(" ");
            }
            stringedMatrix.append(", ");
        }
        stringedMatrix.delete(stringedMatrix.length()-2, stringedMatrix.length());

        return stringedMatrix;
    }

    public void print() {
    }

    //returns the number of columns in our 2D array
    public int numberOfColumns(){
        return this.matrix[0].length;
    }

    //returns the number of rows in our 2D array
    public int numberOfRows(){
        return this.matrix.length;
    }


    public static Matrix add(Matrix a, Matrix b) throws InvalidMatrixOperation {
        return  new Matrix();
    }

    public static Matrix add(int c, Matrix a) {
        if (a == null){
            throw new NullPointerException("Matrix is null");
        }

        int[][] addingMatrix = a.to2DArray();

        for (int rows = 0; rows < addingMatrix.length; rows++) {
            for (int columns = 0; columns < addingMatrix[rows].length; columns++) {
                addingMatrix[rows][columns] = c + addingMatrix[rows][columns];
            }
        }

        Matrix finalMatrix = new Matrix();
        finalMatrix.load(addingMatrix);
        return finalMatrix;
    }

    public static int[][] subtract(Matrix a, Matrix b) throws InvalidMatrixOperation {
        if (a == null || b == null){
            throw new NullPointerException("One or both of the matrices are null");
        }

        //need to check if the two matrices are the same size
        if (a.numberOfColumns() != b.numberOfColumns()) {
            String errorMessage = "Error: The matrices are different sizes (columns)";
            throw new InvalidMatrixOperation(errorMessage);

        }

        if (a.numberOfRows() != b.numberOfRows()) {
            String errorMessage2 = "Error: The matrices are different sizes (rows)";
            throw new InvalidMatrixOperation(errorMessage2);
        }


        //set variables for rows and cols to make calculations easier
        int rows = a.numberOfRows();
        int cols = a.numberOfColumns();

        int[][] result = new int[rows][cols];
        //Matrix c = new Matrix();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a.to2DArray()[i][j] - b.to2DArray()[i][j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();
        return result;
    }

    public static Matrix subtract(int c, Matrix a) {
        if (a == null){
            throw new NullPointerException("Matrix is null");
        }

        int[][] subtractingMatrix = a.to2DArray();

        for (int rows = 0; rows < subtractingMatrix.length; rows++) {
            for (int columns = 0; columns < subtractingMatrix[rows].length; columns++) {
                subtractingMatrix[rows][columns] = subtractingMatrix[rows][columns] - c;
            }
        }

        Matrix finalMatrix = new Matrix();
        finalMatrix.load(subtractingMatrix);
        return finalMatrix;
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
        if (a == null || b == null){
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
                    throw new InvalidMatrixOperation("Error: Matrices contain different values "+
                                firstMatrix[row][column] + " != " + secondMatrix[row][column]);
                }
            }
        }

        return true;
    }

}
