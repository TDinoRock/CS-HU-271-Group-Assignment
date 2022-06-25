package com.cs271;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.cs271.Matrix.add;
import static com.cs271.Matrix.subtract;
import static com.cs271.Matrix.isEqual;

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

    /* scalarAdditionTests written by Trennon Talbot */
    @Test
    void scalarAdditionTests () throws NullPointerException {
        System.out.println("\n============================================================");
        System.out.println("Tests for scalarAddition Method");
        Matrix testedMatrix = new Matrix();
        int addition = 5;

        int[][] matrix1 = {{1}};
        int[][] matrix2 = {{1, 2}, {3, 4}};
        int[][] matrix3 = {{1, 2}};
        int[][] matrix4 = {{1}, {2}};
        int[][] matrix5 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix6 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] matrix7 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix8 = {{1}, {2, 3}, {4, 5, 6}};

        Matrix expectedMatrix = new Matrix();
        int[][] expectedMatrix1 = {{6}};
        int[][] expectedMatrix2 = {{6, 7}, {8, 9}};
        int[][] expectedMatrix3 = {{6, 7}};
        int[][] expectedMatrix4 = {{6}, {7}};
        int[][] expectedMatrix5 = {{6, 7, 8}, {9, 10, 11}, {12, 13, 14}};
        int[][] expectedMatrix6 = {{6, 7}, {8, 9}, {10, 11}};
        int[][] expectedMatrix7 = {{6, 7, 8}, {9, 10, 11}};
        int[][] expectedMatrix8 = {{6}, {7, 8}, {9, 10, 11}};

        Matrix finalAddition;


        /* Scalar Addition Part 1*/
        testedMatrix.load(matrix1);
        expectedMatrix.load(expectedMatrix1);
        finalAddition = add(addition, testedMatrix);

        try {
            if (isEqual(finalAddition, expectedMatrix)) {
                successMessage(1);
                System.out.println(" - 1x1 Matrix: " + Matrix.toString(finalAddition));
            }
        }
        catch (Exception InvalidMatrixOperation) {
            failMessage(1);
            System.out.println(" - Invalid Matrix");
        }

        /* Scalar Addition Part 2*/
        testedMatrix = nullMatrices(testedMatrix);
        expectedMatrix = nullMatrices(expectedMatrix);

        testedMatrix.load(matrix2);
        expectedMatrix.load(expectedMatrix2);
        finalAddition = add(addition, testedMatrix);

        try {
            if (isEqual(finalAddition, expectedMatrix)) {
                successMessage(2);
                System.out.println(" - 2x2 Matrix: " + Matrix.toString(finalAddition));
            }
        }
        catch (Exception InvalidMatrixOperation) {
            failMessage(2);
            System.out.println(" - Invalid Matrix");
        }

        /* Scalar Addition Part 3*/
        testedMatrix = nullMatrices(testedMatrix);
        expectedMatrix = nullMatrices(expectedMatrix);

        testedMatrix.load(matrix3);
        expectedMatrix.load(expectedMatrix3);
        finalAddition = add(addition, testedMatrix);

        try {
            if (isEqual(finalAddition, expectedMatrix)) {
                successMessage(3);
                System.out.println(" - 1x2 Matrix: " + Matrix.toString(finalAddition));
            }
        }
        catch (Exception InvalidMatrixOperation) {
            failMessage(3);
            System.out.println(" - Invalid Matrix");
        }

        /* Scalar Addition Part 4*/
        testedMatrix = nullMatrices(testedMatrix);
        expectedMatrix = nullMatrices(expectedMatrix);

        testedMatrix.load(matrix4);
        expectedMatrix.load(expectedMatrix4);
        finalAddition = add(addition, testedMatrix);

        try {
            if (isEqual(finalAddition, expectedMatrix)) {
                successMessage(4);
                System.out.println(" - 2x1 Matrix: " + Matrix.toString(finalAddition));
            }
        }
        catch (Exception InvalidMatrixOperation) {
            failMessage(4);
            System.out.println(" - Invalid Matrix");
        }

        /* Scalar Addition Part 5*/
        testedMatrix = nullMatrices(testedMatrix);
        expectedMatrix = nullMatrices(expectedMatrix);

        testedMatrix.load(matrix5);
        expectedMatrix.load(expectedMatrix5);
        finalAddition = add(addition, testedMatrix);

        try {
            if (isEqual(finalAddition, expectedMatrix)) {
                successMessage(5);
                System.out.println(" - 3x3 Matrix: " + Matrix.toString(finalAddition));
            }
        }
        catch (Exception InvalidMatrixOperation) {
            failMessage(5);
            System.out.println(" - Invalid Matrix");
        }

        /* Scalar Addition Part 6*/
        testedMatrix = nullMatrices(testedMatrix);
        expectedMatrix = nullMatrices(expectedMatrix);

        testedMatrix.load(matrix6);
        expectedMatrix.load(expectedMatrix6);
        finalAddition = add(addition, testedMatrix);

        try {
            if (isEqual(finalAddition, expectedMatrix)) {
                successMessage(6);
                System.out.println(" - 3x2 Matrix: " + Matrix.toString(finalAddition));
            }
        }
        catch (Exception InvalidMatrixOperation) {
            failMessage(6);
            System.out.println(" - Invalid Matrix");
        }

        /* Scalar Addition Part 7*/
        testedMatrix = nullMatrices(testedMatrix);
        expectedMatrix = nullMatrices(expectedMatrix);

        testedMatrix.load(matrix7);
        expectedMatrix.load(expectedMatrix7);
        finalAddition = add(addition, testedMatrix);

        try {
            if (isEqual(finalAddition, expectedMatrix)) {
                successMessage(7);
                System.out.println(" - 2x3 Matrix: " + Matrix.toString(finalAddition));
            }
        }
        catch (Exception InvalidMatrixOperation) {
            failMessage(7);
            System.out.println(" - Invalid Matrix");
        }

        /* Scalar Addition Part 8 */
        testedMatrix = nullMatrices(testedMatrix);
        expectedMatrix = nullMatrices(expectedMatrix);

        testedMatrix.load(matrix8);
        expectedMatrix.load(expectedMatrix8);
        finalAddition = add(addition, testedMatrix);

        try {
            if (isEqual(finalAddition, expectedMatrix)) {
                successMessage(8);
                System.out.println(" - 1x1, 1x2, 1x3 Matrix: " + Matrix.toString(finalAddition));
            }
        }
        catch (Exception InvalidMatrixOperation) {
            failMessage(8);
            System.out.println(" - Invalid Matrix");
        }

        /* NUll Matrix */
        testedMatrix = nullMatrices(testedMatrix);

        try {
            add(addition, testedMatrix);
            failMessage(9);
            System.out.println(" - Invalid Matrix");
        }
        catch (Exception NullPointerException) {
            successMessage(9);
            System.out.println(" - Matrix was null");
        }
        System.out.println("============================================================\n");
    }

    /* matricesSubtractionFailsWhenMatrixIsNull written by Drew Rizk */
    @Test
    void matricesSubtractionFailsWhenMatrixIsNull() throws NullPointerException {
        System.out.println("\n============================================================");
        System.out.println("Tests for Matrix Subtraction Method");
        Matrix a = new Matrix();
        Matrix b = new Matrix();

        try{
            Matrix.subtract(a,b);
        }catch(Exception NullPointerException){
            System.out.print("\nError: One or both matrices are null\n\n");
        }
    }

    /* matricesSubtractionWorks written by Drew Rizk */
    @Test
    void matricesSubtractionWorks() throws InvalidMatrixOperation {
        Matrix a = new Matrix();
        Matrix b = new Matrix();
        Matrix c = new Matrix();

        int[][] expected = {{1, 2},
                             {3, 4}};
        a.load(expected);

        int[][] expected2 = {{1, 3},
                            {2, 3}};
        b.load(expected2);

        int[][] expected3 = {{0, -1},
                            {1, 1}};
        c.load(expected3);

        int[][] expected4 = {{1, 3},
                            {2, 3}};

        Assertions.assertArrayEquals(expected3, Matrix.subtract(a, b));
        Assertions.assertArrayEquals(expected4, Matrix.subtract(a, c));
    }

    /* matricesSubtractionFailsWhenColumnsAreDifferentSizes written by Drew Rizk */
    @Test
    void matricesSubtractionFailsWhenColumnsAreDifferentSizes() throws InvalidMatrixOperation {
        Matrix a = new Matrix();
        Matrix b = new Matrix();

        int[][] expected = {{1, 2},
                            {3, 4}};
        a.load(expected);

        int[][] expected4 = {{3},
                            {2, 3}};
        b.load(expected4);

        String expected9 = "Error: The matrices are different sizes (columns)";

        try{
            Assertions.assertEquals(expected9, Matrix.subtract(a,b));
        }catch(Exception InvalidMatrixOperation){
            System.out.print("Error: The matrices are different sizes (columns)\n");
        }
    }

    /* matricesSubtractionFailsWhenRowsAreDifferentSizes written by Drew Rizk */
    @Test
    void matricesSubtractionFailsWhenRowsAreDifferentSizes() throws InvalidMatrixOperation {
        Matrix a = new Matrix();
        Matrix b = new Matrix();

        int[][] expected = {{1, 2},
                {3, 4}};
        a.load(expected);

        int[][] expected5 = {{3,4}};
        b.load(expected5);

        String expected8 = "\nError: The matrices are different sizes (rows)\n";

        try{
            Assertions.assertEquals(expected8, Matrix.subtract(a,b));
        }catch(Exception InvalidMatrixOperation){
            System.out.print("\nError: The matrices are different sizes (rows)");
        }
        System.out.println("\n============================================================\n");
    }

    /* scalarSubtractionTests written by Trennon Talbot */
    @Test
    void scalarSubtractionTests () throws NullPointerException {
        System.out.println("\n============================================================");
        System.out.println("Tests for scalarSubtraction Method");
        Matrix testedMatrix = new Matrix();
        int subtraction = 5;

        int[][] matrix1 = {{6}};
        int[][] matrix2 = {{6, 7}, {8, 9}};
        int[][] matrix3 = {{6, 7}};
        int[][] matrix4 = {{6}, {7}};
        int[][] matrix5 = {{6, 7, 8}, {9, 10, 11}, {12, 13, 14}};
        int[][] matrix6 = {{6, 7}, {8, 9}, {10, 11}};
        int[][] matrix7 = {{6, 7, 8}, {9, 10, 11}};
        int[][] matrix8 = {{6}, {7, 8}, {9, 10, 11}};

        Matrix expectedMatrix = new Matrix();
        int[][] expectedMatrix1 = {{1}};
        int[][] expectedMatrix2 = {{1, 2}, {3, 4}};
        int[][] expectedMatrix3 = {{1, 2}};
        int[][] expectedMatrix4 = {{1}, {2}};
        int[][] expectedMatrix5 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expectedMatrix6 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] expectedMatrix7 = {{1, 2, 3}, {4, 5, 6}};
        int[][] expectedMatrix8 = {{1}, {2, 3}, {4, 5, 6}};

        Matrix finalSubtraction;


        /* Scalar Subtraction Part 1*/
        testedMatrix.load(matrix1);
        expectedMatrix.load(expectedMatrix1);
        finalSubtraction = subtract(subtraction, testedMatrix);

        try {
            if (isEqual(finalSubtraction, expectedMatrix)) {
                successMessage(1);
                System.out.println(" - 1x1 Matrix: " + Matrix.toString(finalSubtraction));
            }
        }
        catch (Exception InvalidMatrixOperation) {
            failMessage(1);
            System.out.println(" - Invalid Matrix");
        }

        /* Scalar Subtraction Part 2*/
        testedMatrix = nullMatrices(testedMatrix);
        expectedMatrix = nullMatrices(expectedMatrix);

        testedMatrix.load(matrix2);
        expectedMatrix.load(expectedMatrix2);
        finalSubtraction = subtract(subtraction, testedMatrix);

        try {
            if (isEqual(finalSubtraction, expectedMatrix)) {
                successMessage(2);
                System.out.println(" - 2x2 Matrix: " + Matrix.toString(finalSubtraction));
            }
        }
        catch (Exception InvalidMatrixOperation) {
            failMessage(2);
            System.out.println(" - Invalid Matrix");
        }

        /* Scalar Subtraction Part 3*/
        testedMatrix = nullMatrices(testedMatrix);
        expectedMatrix = nullMatrices(expectedMatrix);

        testedMatrix.load(matrix3);
        expectedMatrix.load(expectedMatrix3);
        finalSubtraction = subtract(subtraction, testedMatrix);

        try {
            if (isEqual(finalSubtraction, expectedMatrix)) {
                successMessage(3);
                System.out.println(" - 1x2 Matrix: " + Matrix.toString(finalSubtraction));
            }
        }
        catch (Exception InvalidMatrixOperation) {
            failMessage(3);
            System.out.println(" - Invalid Matrix");
        }

        /* Scalar Subtraction Part 4*/
        testedMatrix = nullMatrices(testedMatrix);
        expectedMatrix = nullMatrices(expectedMatrix);

        testedMatrix.load(matrix4);
        expectedMatrix.load(expectedMatrix4);
        finalSubtraction = subtract(subtraction, testedMatrix);

        try {
            if (isEqual(finalSubtraction, expectedMatrix)) {
                successMessage(4);
                System.out.println(" - 2x1 Matrix: " + Matrix.toString(finalSubtraction));
            }
        }
        catch (Exception InvalidMatrixOperation) {
            failMessage(4);
            System.out.println(" - Invalid Matrix");
        }

        /* Scalar Subtraction Part 5*/
        testedMatrix = nullMatrices(testedMatrix);
        expectedMatrix = nullMatrices(expectedMatrix);

        testedMatrix.load(matrix5);
        expectedMatrix.load(expectedMatrix5);
        finalSubtraction = subtract(subtraction, testedMatrix);

        try {
            if (isEqual(finalSubtraction, expectedMatrix)) {
                successMessage(5);
                System.out.println(" - 3x3 Matrix: " + Matrix.toString(finalSubtraction));
            }
        }
        catch (Exception InvalidMatrixOperation) {
            failMessage(5);
            System.out.println(" - Invalid Matrix");
        }

        /* Scalar Subtraction Part 6*/
        testedMatrix = nullMatrices(testedMatrix);
        expectedMatrix = nullMatrices(expectedMatrix);

        testedMatrix.load(matrix6);
        expectedMatrix.load(expectedMatrix6);
        finalSubtraction = subtract(subtraction, testedMatrix);

        try {
            if (isEqual(finalSubtraction, expectedMatrix)) {
                successMessage(6);
                System.out.println(" - 3x2 Matrix: " + Matrix.toString(finalSubtraction));
            }
        }
        catch (Exception InvalidMatrixOperation) {
            failMessage(6);
            System.out.println(" - Invalid Matrix");
        }

        /* Scalar Subtraction Part 7*/
        testedMatrix = nullMatrices(testedMatrix);
        expectedMatrix = nullMatrices(expectedMatrix);

        testedMatrix.load(matrix7);
        expectedMatrix.load(expectedMatrix7);
        finalSubtraction = subtract(subtraction, testedMatrix);

        try {
            if (isEqual(finalSubtraction, expectedMatrix)) {
                successMessage(7);
                System.out.println(" - 2x3 Matrix: " + Matrix.toString(finalSubtraction));
            }
        }
        catch (Exception InvalidMatrixOperation) {
            failMessage(7);
            System.out.println(" - Invalid Matrix");
        }

        /* Scalar Subtraction Part 8 */
        testedMatrix = nullMatrices(testedMatrix);
        expectedMatrix = nullMatrices(expectedMatrix);

        testedMatrix.load(matrix8);
        expectedMatrix.load(expectedMatrix8);
        finalSubtraction = subtract(subtraction, testedMatrix);

        try {
            if (isEqual(finalSubtraction, expectedMatrix)) {
                successMessage(8);
                System.out.println(" - 1x1, 1x2, 1x3 Matrix: " + Matrix.toString(finalSubtraction));
            }
        }
        catch (Exception InvalidMatrixOperation) {
            failMessage(8);
            System.out.println(" - Invalid Matrix");
        }

        /* NUll Matrix */
        testedMatrix = nullMatrices(testedMatrix);

        try {
            add(subtraction, testedMatrix);
            failMessage(9);
            System.out.println(" - Invalid Matrix");
        }
        catch (Exception NullPointerException) {
            successMessage(9);
            System.out.println(" - Matrix was null");
        }
        System.out.println("============================================================\n");
    }

    /* isEqualsTests written by Trennon Talbot */
    @Test
    void isEqualTests () throws InvalidMatrixOperation {
        System.out.println("\n============================================================");
        System.out.println("Tests for isEqual Method");

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

        /* Same Matrices */
        a.load(matrix1);
        b.load(matrix2);
        try {
            if (isEqual(a, b)) {
                successMessage(1);
                System.out.println(" - Both 2x2 Matrices");
            }
        }
        catch (Exception InvalidMatrixOperation) {
            failMessage(1);
            System.out.println(" - Invalid Matrix");
        }

        /* Different Matrices Part 1 */
        a = nullMatrices(a);
        b = nullMatrices(b);

        a.load(matrix1);
        b.load(matrix3);
        try {
            if (isEqual(a, b)) {
                failMessage(1);
                System.out.println(" - Something went wrong");
            }
        }
        catch (Exception InvalidMatrixOperation){
            successMessage(2);
            System.out.println(" - One 1x1 Matrix and 2x2 Matrix");
        }

        /* Different Matrices Part 2 */
        a = nullMatrices(a);
        b = nullMatrices(b);

        a.load(matrix1);
        b.load(matrix4);
        try {
            if (isEqual(a, b)) {
                failMessage(1);
                System.out.println(" - Something went wrong");
            }
        }
        catch (Exception InvalidMatrixOperation){
            successMessage(3);
            System.out.println(" - One 2x1 Matrix and 2x2 Matrix");
        }

        /* Different Matrices Part 3 */
        a = nullMatrices(a);
        b = nullMatrices(b);

        a.load(matrix1);
        b.load(matrix5);
        try {
            if (isEqual(a, b)) {
                failMessage(1);
                System.out.println(" - Something went wrong");
            }
        }
        catch (Exception InvalidMatrixOperation){
            successMessage(4);
            System.out.println(" - One 1x2 Matrix and 2x2 Matrix");
        }

        /* Different Matrices Part 4 */
        a = nullMatrices(a);
        b = nullMatrices(b);

        a.load(matrix1);
        b.load(matrix6);
        try {
            if (isEqual(a, b)) {
                failMessage(1);
                System.out.println(" - Something went wrong");
            }
        }
        catch (Exception InvalidMatrixOperation){
            successMessage(5);
            System.out.println(" - One 3x1 Matrix and 2x2 Matrix");
        }

        /* Different Matrices Part 5 */
        a = nullMatrices(a);
        b = nullMatrices(b);

        a.load(matrix1);
        b.load(matrix7);
        try {
            if (isEqual(a, b)) {
                failMessage(1);
                System.out.println(" - Something went wrong");
            }
        }
        catch (Exception InvalidMatrixOperation){
            successMessage(6);
            System.out.println(" - One 1x3 Matrix and 2x2 Matrix");
        }

        /* Different Matrices Part 6 */
        a = nullMatrices(a);
        b = nullMatrices(b);

        a.load(matrix1);
        b.load(matrix8);
        try {
            if (isEqual(a, b)) {
                failMessage(1);
                System.out.println(" - Something went wrong");
            }
        }
        catch (Exception InvalidMatrixOperation){
            successMessage(7);
            System.out.println(" - One 1x1 + 1x2 Matrix and 2x2 Matrix");
        }

        /* Different Matrices Part 7 */
        a = nullMatrices(a);
        b = nullMatrices(b);

        a.load(matrix1);
        b.load(matrix9);
        try {
            if (isEqual(a, b)) {
                failMessage(1);
                System.out.println(" - Something went wrong");
            }
        }
        catch (Exception InvalidMatrixOperation){
            successMessage(8);
            System.out.println(" - One 1x2 + 1x1 Matrix and 2x2 Matrix");
        }

        /* Different Matrices Part 8 */
        a = nullMatrices(a);
        b = nullMatrices(b);

        a.load(matrix1);
        b.load(matrix10);
        try {
            if (isEqual(a, b)) {
                failMessage(1);
                System.out.println(" - Something went wrong");
            }
        }
        catch (Exception InvalidMatrixOperation){
            successMessage(9);
            System.out.println(" - One 3x3 Matrix and 2x2 Matrix");
        }

        /* Empty Matrix */
        a = nullMatrices(a);
        b = nullMatrices(b);

        a.load(matrix1);
        try {
            if (isEqual(a, b)) {
                failMessage(1);
                System.out.println(" - Something went wrong");
            }
        }
        catch (Exception InvalidMatrixOperation){
            successMessage(10);
            System.out.println(" - One empty Matrix and 2x2 Matrix");
        }

        /* Empty Matrices */
        a = nullMatrices(a);
        b = nullMatrices(b);
        try {
            if (isEqual(a, b)) {
                failMessage(1);
                System.out.println(" - Something went wrong");
            }
        }
        catch (Exception NullPointerException){
            successMessage(11);
            System.out.println(" - Both empty Matrices");
        }

        System.out.println("============================================================");
        System.out.println("\nDONE WITH TESTS");
    }


    /* === HELPER METHODS === */
    public static Matrix nullMatrices (Matrix a) {
        return new Matrix();
    }
    public static void successMessage(int testNumber) {
        System.out.print("Test " + testNumber + ": Success");
    }
    public static void failMessage(int testNumber) {
        System.out.print("Test " + testNumber + ": Failed");
    }

}
