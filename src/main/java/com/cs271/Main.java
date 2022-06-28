package com.cs271;

import static com.cs271.Matrix.add;
import static com.cs271.Matrix.isEqual;

public class Main {
    public static void main(String[] args) throws InvalidMatrixOperation {


        System.out.println("\n============================================================");
        System.out.println("Tests for add(Matrix a, Matrix b) Method");
        additionTests();
        System.out.println("Tests for isEqual Method");
        isEqualTests();
        System.out.println("============================================================");

        System.out.println("\nDONE WITH TESTS");

    }

    public static void additionTests () throws InvalidMatrixOperation {
        Matrix a = new Matrix();
        Matrix b = new Matrix();
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{1, 2}, {3, 4}};
        int[][] matrix3 = {{1, 3}, {7, 5}};
        int[][] matrix4 = {{2, 4}, {6, 8}};
        int[][] matrix5 = {{3, 7}, {4, 1}};
        int[][] matrix6 = {{9, 3}, {1, 1}};
        int[][] matrix7 = {{1, 2, 3}, {1, 2, 3}};
        int[][] matrix8 = {{1, 2, 3}, {1, 2, 3}};
        int[][] matrix9 = {{1, 2}, {3}};
        int[][] matrix10 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        /* Same Matrix Addition */
        a.load(matrix1);
        b.load(matrix2);
        if (add(a, b)) {
            successMessage(1);
            System.out.println(" - Successfully added! ");
        }
        else {
            failMessage(1);
            System.out.println(" - Unsuccessful add! ");
        }
        /* Differing number Matrix Addition */
        a.load(matrix2);
        b.load(matrix3);
        if (add(a, b)) {
            successMessage(2);
            System.out.println(" - Successfully added! ");
        }
        else {
            failMessage(2);
            System.out.println(" - Unsuccessful add! ");
        }
        a.load(matrix3);
        b.load(matrix4);
        if (add(a, b)) {
            successMessage(3);
            System.out.println(" - Successfully added! ");
        }
        else {
            failMessage(3);
            System.out.println(" - Unsuccessful add! ");
        }
        a.load(matrix4);
        b.load(matrix5);
        if (add(a, b)) {
            successMessage(4);
            System.out.println(" - Successfully added! ");
        }
        else {
            failMessage(4);
            System.out.println(" - Unsuccessful add! ");
        }
        a.load(matrix5);
        b.load(matrix6);
        if (add(a, b)) {
            successMessage(5);
            System.out.println(" - Successfully added! ");
        }
        else {
            failMessage(5);
            System.out.println(" - Unsuccessful add! ");
        }
        a.load(matrix6);
        b.load(matrix1);
        if (add(a, b)) {
            successMessage(6);
            System.out.println(" - Successfully added! ");
        }
        else {
            failMessage(6);
            System.out.println(" - Unsuccessful add! ");
        }
        a.load(matrix5);
        b.load(matrix2);
        if (add(a, b)) {
            successMessage(7);
            System.out.println(" - Successfully added! ");
        }
        else {
            failMessage(7);
            System.out.println(" - Unsuccessful add! ");
        }
        a.load(matrix1);
        b.load(matrix5);
        if (add(a, b)) {
            successMessage(8);
            System.out.println(" - Successfully added! ");
        }
        else {
            failMessage(8);
            System.out.println(" - Unsuccessful add! ");
        }
        /* Different Size Matrices */
        a.load(matrix7);
        b.load(matrix9);
        if (add(a, b)) {
            successMessage(9);
            System.out.println(" - Successfully added! ");
        }
        else {
            failMessage(9);
            System.out.println(" - Unsuccessful add! ");
        }
        a.load(matrix1);
        b.load(matrix8);
        if (add(a, b)) {
            successMessage(10);
            System.out.println(" - Successfully added! ");
        }
        else {
            failMessage(10);
            System.out.println(" - Unsuccessful add! ");
        }
        a.load(matrix2);
        b.load(matrix7);
        if (add(a, b)) {
            successMessage(11);
            System.out.println(" - Successfully added! ");
        }
        else {
            failMessage(11);
            System.out.println(" - Unsuccessful add! ");
        }
        a.load(matrix3);
        b.load(matrix10);
        if (add(a, b)) {
            successMessage(12);
            System.out.println(" - Successfully added! ");
        }
        else {
            failMessage(12);
            System.out.println(" - Unsuccessful add! ");
        }
    }

    public static void isEqualTests () throws InvalidMatrixOperation {
        Matrix a = new Matrix();
        Matrix b = new Matrix();
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{1, 2}, {3, 4}};
        int[][] matrix3 = {{1}};
        int[][] matrix4 = {{1}, {2}};
        int[][] matrix5 = {{1, 2}};
        int[][] matrix6 = {{1}, {2}, {3}};
        int[][] matrix7 = {{1, 2, 3}};
        int[][] matrix8 = {{1}, {2, 3}};
        int[][] matrix9 = {{1, 2}, {3}};
        int[][] matrix10 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix11 = new int[1][1];
        int[][] matrix12 = new int[1][1];

        /* Same Matrices */
        a.load(matrix1);
        b.load(matrix2);
        if (isEqual(a, b)) {
            successMessage(1);
            System.out.println(" - Both 2x2 Matrices");
        }
        else {
            failMessage(1);
        }

        /* Different Matrices Part 1 */
        a = nullMatrices(a);
        b = nullMatrices(b);

        a.load(matrix1);
        b.load(matrix3);
        if (isEqual(a, b)) {
            failMessage(2);
        }
        else {
            successMessage(2);
            System.out.println(" - One 1x1 Matrix and 2x2 Matrix");
        }

        /* Different Matrices Part 2 */
        a = nullMatrices(a);
        b = nullMatrices(b);

        a.load(matrix1);
        b.load(matrix4);
        if (isEqual(a, b)) {
            failMessage(3);
        }
        else {
            successMessage(3);
            System.out.println(" - One 2x1 Matrix and 2x2 Matrix");
        }

        /* Different Matrices Part 3 */
        a = nullMatrices(a);
        b = nullMatrices(b);

        a.load(matrix1);
        b.load(matrix5);
        if (isEqual(a, b)) {
            failMessage(4);
        }
        else {
            successMessage(4);
            System.out.println(" - One 1x2 Matrix and 2x2 Matrix");
        }

        /* Different Matrices Part 4 */
        a = nullMatrices(a);
        b = nullMatrices(b);

        a.load(matrix1);
        b.load(matrix6);
        if (isEqual(a, b)) {
            failMessage(5);
        }
        else {
            successMessage(5);
            System.out.println(" - One 3x1 Matrix and 2x2 Matrix");
        }

        /* Different Matrices Part 5 */
        a = nullMatrices(a);
        b = nullMatrices(b);

        a.load(matrix1);
        b.load(matrix7);
        if (isEqual(a, b)) {
            failMessage(6);
        }
        else {
            successMessage(6);
            System.out.println(" - One 1x3 Matrix and 2x2 Matrix");
        }

        /* Different Matrices Part 6 */
        a = nullMatrices(a);
        b = nullMatrices(b);

        a.load(matrix1);
        b.load(matrix8);
        if (isEqual(a, b)) {
            failMessage(7);
        }
        else {
            successMessage(7);
            System.out.println(" - One 1x1 + 1x2 Matrix and 2x2 Matrix");
        }

        /* Different Matrices Part 7 */
        a = nullMatrices(a);
        b = nullMatrices(b);

        a.load(matrix1);
        b.load(matrix9);
        if (isEqual(a, b)) {
            failMessage(8);
        }
        else {
            successMessage(8);
            System.out.println(" - One 1x2 + 1x1 Matrix and 2x2 Matrix");
        }

        /* Different Matrices Part 8 */
        a = nullMatrices(a);
        b = nullMatrices(b);

        a.load(matrix1);
        b.load(matrix10);
        if (isEqual(a, b)) {
            failMessage(9);
        }
        else {
            successMessage(9);
            System.out.println(" - One 3x3 Matrix and 2x2 Matrix");
        }

        /* Empty Matrix */
        a = nullMatrices(a);
        b = nullMatrices(b);

        a.load(matrix1);
        if (isEqual(a, b)) {
            failMessage(10);
        }
        else {
            successMessage(10);
            System.out.println(" - One empty Matrix and 2x2 Matrix");
        }

        /* Empty Matrices */
        a = nullMatrices(a);
        b = nullMatrices(b);

        if (isEqual(a, b)) {
            successMessage(11);
            System.out.println(" - Both empty Matrices");
        }
        else {
            failMessage(11);
        }

    }


    /* === HELPER METHODS === */
    public static Matrix nullMatrices (Matrix a) {
        int[][] nullMatrix = new int[1][1];
        a.load(nullMatrix);
        return a;
    }
    public static void successMessage(int testNumber) {
        System.out.print("Test " + testNumber + ": Success");
    }
    public static void failMessage(int testNumber) {
        System.out.print("Test " + testNumber + ": Failed");
    }
}


