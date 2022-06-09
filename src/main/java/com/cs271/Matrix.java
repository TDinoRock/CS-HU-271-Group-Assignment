package com.cs271;


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

}
