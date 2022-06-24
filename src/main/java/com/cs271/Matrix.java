package com.cs271;


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


    //returns the number of columns in our 2D array
    public int numberOfColumns(){
        return this.matrix[0].length;
    }


    //returns the number of rows in our 2D array
    public int numberOfRows(){
        return this.matrix.length;
    }

    public static int[][] subtract(Matrix a, Matrix b) throws InvalidMatrixOperation {


        if (a == null || b == null){
            throw new NullPointerException("One or both of the matrices are null");
        }
        //check each row
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

        int result[][] = new int[rows][cols];
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
//
//        //loop through matrices a and b and subtract their values at the [i][j] index
//        System.out.print("[");
//        int c_i_j_value = 0;
//        int[][] c = new int[0][];
//        for (int i = 0; i < rows; i++) {
//
//            for (int j = 0; j < cols; j++) {
//                int a_i_j_value = a.to2DArray()[i][j];
//                int b_i_j_value = b.to2DArray()[i][j];
//                c_i_j_value = a_i_j_value - b_i_j_value;
//                c[i][j] = c_i_j_value;
//                System.out.print(c_i_j_value + ", ");
//                //a.to2DArray()[i][j] = c_i_j_value;
//                //System.out.print(c_i_j_value + ", ");
//            }
//
//        }
//
//        //return a;





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
