package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MatrixAddTest {
    @Test
    public void addMatrices_MatricesWithDimensionsGiven_ShouldDisplaySumMatrix(){
        int[][] sumMatrix = {{15, 15, 15},{20, 20, 20}};
        assertArrayEquals("Incorrect Output", sumMatrix, MatrixAdd.addMatrices(new int[][]{{8, 9, 10},{17, 13, 5}}, new int[][]{{7, 6, 5},{3, 7, 15}}));
        assertArrayEquals("Incorrect Output", sumMatrix, MatrixAdd.addMatrices(new int[][]{{0, 15, 0},{20, 0, 20}}, new int[][]{{15, 0, 15},{0, 20, 0}}));
    }
}
