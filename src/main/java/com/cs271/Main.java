package com.cs271;

public class Main {
    public static void main(String[] args) {
        System.out.println("Matrix Methods!");

        Matrix a = new Matrix();
        int[][] matrix = {{1, 2}, {3, 4}};
        a.load(matrix);
        System.out.println("Matrix Loaded!");
    }
}
