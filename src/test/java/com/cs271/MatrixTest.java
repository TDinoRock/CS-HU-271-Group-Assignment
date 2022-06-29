package com.cs271;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.cs271.Matrix.isEqual;
import static com.cs271.Matrix.multiply;

class MatrixTests {


    @Test
    void shouldLoadDataIntoMatrix() {
        Matrix a = new Matrix();
        int[][] expected = {{1, 2}, {3, 4}};
        a.load(expected);
        Assertions.assertArrayEquals(expected, a.to2DArray());


        int[][] expected2 = {{1}};
        a.load(expected2);
        Assertions.assertArrayEquals(expected2, a.to2DArray());
    }


    @Test
    void scalarMultiplicationTests() throws NullPointerException {
        System.out.println("\n===========================================");
        System.out.println("Tests for Scalar Multiplication Method");

        Matrix testMatrix = new Matrix();
        int multiply = 2;

        int[][] testMatrix1 = {{1}};
        int[][] testMatrix2 = {{1, 1}};
        int[][] testMatrix3 = {{1}, {2}};
        int[][] testMatrix4 = {{1, 1}, {2, 2}};
        int[][] testMatrix5 = {{1}, {2, 2}, {3, 3, 3}};
        int[][] testMatrix6 = {{1, 1}, {2, 2}, {3, 3}};
        int[][] testMatrix7 = {{1, 1, 1}, {2, 2, 2}};
        int[][] testMatrix8 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        Matrix expectedMatrix = new Matrix();
        int[][] expectedMatrix1 = {{2}};
        int[][] expectedMatrix2 = {{2, 2}};
        int[][] expectedMatrix3 = {{2}, {4}};
        int[][] expectedMatrix4 = {{2, 2}, {4, 4}};
        int[][] expectedMatrix5 = {{2}, {4, 4}, {6, 6, 6}};
        int[][] expectedMatrix6 = {{2, 2}, {4, 4}, {6, 6}};
        int[][] expectedMatrix7 = {{2, 2, 2}, {4, 4, 4}};
        int[][] expectedMatrix8 = {{2, 2, 2}, {4, 4, 4}, {6, 6, 6}};

        Matrix finalMult;

        testMatrix.load(testMatrix1);
        expectedMatrix.load(expectedMatrix1);
        finalMult = multiply(multiply, testMatrix);

        try {
            if (isEqual(finalMult, expectedMatrix)) {
                successMessage(1);
                System.out.println(" Multiplication was successful");
            }
        } catch (Exception InvalidMatrixOperation) {
            failMessage(1);
            System.out.println(" Unsuccessful multiplication");
        }

        testMatrix = nullMatrices(testMatrix);
        expectedMatrix = nullMatrices(expectedMatrix);

        testMatrix.load(testMatrix2);
        expectedMatrix.load(expectedMatrix2);
        finalMult = multiply(multiply, testMatrix);

        try {
            if (isEqual(finalMult, expectedMatrix)) {
                successMessage(2);
                System.out.println(" Multiplication was successful");
            }
        } catch (Exception InvalidMatrixOperation) {
            failMessage(2);
            System.out.println(" Unsuccessful multiplication");
        }

        testMatrix = nullMatrices(testMatrix);
        expectedMatrix = nullMatrices(expectedMatrix);

        testMatrix.load(testMatrix3);
        expectedMatrix.load(expectedMatrix3);
        finalMult = multiply(multiply, testMatrix);

        try {
            if (isEqual(finalMult, expectedMatrix)) {
                successMessage(3);
                System.out.println(" Multiplication was successful");
            }
        } catch (Exception InvalidMatrixOperation) {
            failMessage(3);
            System.out.println(" Unsuccessful multiplication");
        }

        testMatrix = nullMatrices(testMatrix);
        expectedMatrix = nullMatrices(expectedMatrix);

        testMatrix.load(testMatrix4);
        expectedMatrix.load(expectedMatrix4);
        finalMult = multiply(multiply, testMatrix);

        try {
            if (isEqual(finalMult, expectedMatrix)) {
                successMessage(4);
                System.out.println(" Multiplication was successful");
            }
        } catch (Exception InvalidMatrixOperation) {
            failMessage(4);
            System.out.println(" Unsuccessful multiplication");
        }

        testMatrix = nullMatrices(testMatrix);
        expectedMatrix = nullMatrices(expectedMatrix);

        testMatrix.load(testMatrix5);
        expectedMatrix.load(expectedMatrix5);
        finalMult = multiply(multiply, testMatrix);

        try {
            if (isEqual(finalMult, expectedMatrix)) {
                successMessage(5);
                System.out.println(" Multiplication was successful");
            }
        } catch (Exception InvalidMatrixOperation) {
            failMessage(5);
            System.out.println(" Unsuccessful multiplication");
        }

        testMatrix = nullMatrices(testMatrix);
        expectedMatrix = nullMatrices(expectedMatrix);

        testMatrix.load(testMatrix6);
        expectedMatrix.load(expectedMatrix6);
        finalMult = multiply(multiply, testMatrix);

        try {
            if (isEqual(finalMult, expectedMatrix)) {
                successMessage(6);
                System.out.println(" Multiplication was successful");
            }
        } catch (Exception InvalidMatrixOperation) {
            failMessage(6);
            System.out.println(" Unsuccessful multiplication");
        }

        testMatrix = nullMatrices(testMatrix);
        expectedMatrix = nullMatrices(expectedMatrix);

        testMatrix.load(testMatrix7);
        expectedMatrix.load(expectedMatrix7);
        finalMult = multiply(multiply, testMatrix);

        try {
            if (isEqual(finalMult, expectedMatrix)) {
                successMessage(7);
                System.out.println(" Multiplication was successful");
            }
        } catch (Exception InvalidMatrixOperation) {
            failMessage(7);
            System.out.println(" Unsuccessful multiplication");
        }

        testMatrix = nullMatrices(testMatrix);
        expectedMatrix = nullMatrices(expectedMatrix);

        testMatrix.load(testMatrix8);
        expectedMatrix.load(expectedMatrix8);
        finalMult = multiply(multiply, testMatrix);

        try {
            if (isEqual(finalMult, expectedMatrix)) {
                successMessage(8);
                System.out.println(" Multiplication was successful");
            }
        } catch (Exception InvalidMatrixOperation) {
            failMessage(8);
            System.out.println(" Unsuccessful multiplication");
        }

        testMatrix = nullMatrices(testMatrix);

        try {
            multiply(multiply, testMatrix);
            failMessage(9);
            System.out.println(" Matrix is invalid");
        } catch (Exception NullPointerException) {
            successMessage(9);
            System.out.println(" Matrix is null");
        }
        System.out.println("===========================================\n");
    }


    public static Matrix nullMatrices(Matrix a) {
        return new Matrix();
    }

    public static void successMessage(int testNumber) {
        System.out.print("Test " + testNumber + ": Success");
    }

    public static void failMessage(int testNumber) {
        System.out.print("Test " + testNumber + ": Failed");
    }
}
