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
}