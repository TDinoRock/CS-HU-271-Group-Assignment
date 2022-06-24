package com.cs271;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
    void matricesSubtractionFailsWhenMatrixIsNull() throws NullPointerException {
        Matrix a = new Matrix();
        Matrix b = new Matrix();
        Matrix c = new Matrix();

//        int[][] expected = {{1, 2},
//                            };
//        a.load(expected);
//
//
//        int[][] expected5 = {{}};
//        b.load(expected5);
//
//        String expected8 = "\nError: The matrices are different sizes (rows)\n";
//

        try{
            Matrix.subtract(a,b);
        }catch(Exception NullPointerException){
            System.out.print("\nError: One or both matrices are null\n\n");

        }finally {

        }

    }

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


        //subtract(a,b);

        Assertions.assertArrayEquals(expected3, Matrix.subtract(a, b));

        Assertions.assertArrayEquals(expected4, Matrix.subtract(a, c));

    }

    @Test
    void matricesSubtractionFailsWhenColumnsAreDifferentSizes() throws InvalidMatrixOperation {
        Matrix a = new Matrix();
        Matrix b = new Matrix();
        Matrix c = new Matrix();

        int[][] expected = {{1, 2},
                            {3, 4}};
        a.load(expected);


        int[][] expected4 = {{3},
                            {2, 3}};
        c.load(expected4);


        String expected9 = "Error: The matrices are different sizes (columns)";

        try{
            Assertions.assertEquals(expected9, Matrix.subtract(a,c));
        }catch(Exception InvalidMatrixOperation){
            System.out.print("\nError: The matrices are different sizes (columns)\n");

        }finally {

        }

    }
    @Test
    void matricesSubtractionFailsWhenRowsAreDifferentSizes() throws InvalidMatrixOperation {
        Matrix a = new Matrix();
        Matrix b = new Matrix();
        Matrix c = new Matrix();

        int[][] expected = {{1, 2},
                {3, 4}};
        a.load(expected);


        int[][] expected5 = {{3,4}};
        b.load(expected5);

        String expected8 = "\nError: The matrices are different sizes (rows)\n";


        try{
            Assertions.assertEquals(expected8, Matrix.subtract(a,b));
        }catch(Exception InvalidMatrixOperation){
            System.out.print("\nError: The matrices are different sizes (rows)\n\n");

        }finally {

        }

    }


}
