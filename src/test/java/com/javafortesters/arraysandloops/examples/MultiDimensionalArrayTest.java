package com.javafortesters.arraysandloops.examples;

import com.javafortesters.arraysandloops.exercises.ArrayExerciseTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiDimensionalArrayTest {

    @Test
    public void createMultiDimensionalArrayEmpty() {
        int[][] multi = new int[4][4];

        assertEquals(4, multi[0].length);
        assertEquals(0, multi[0][1]);
    }

    @Test
    public void createMultiDimensionalArrayFilled(){
        int[][] multi = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        assertEquals(1, multi[0][0]);
        assertEquals(7, multi[1][2]);
        assertEquals(12, multi[2][3]);
        assertEquals(14, multi[3][1]);
    }

    @Test
    public void create3DArrayArray(){
        int[][][] multi3d = new int[3][4][5];

        assertEquals(3, multi3d.length);
        assertEquals(4, multi3d[0].length);
        assertEquals(4, multi3d[1].length);
        assertEquals(4, multi3d[2].length);
        assertEquals(5, multi3d[0][1].length);
        assertEquals(5, multi3d[0][2].length);
        assertEquals(5, multi3d[1][3].length);

        assertEquals(0, multi3d[0][0][0]);
    }

    @Test
    public void createRaggedArray() {
        int[][] ragged2d = {{1, 2, 3, 4},
                            {5, 6},
                            {7, 8, 9}};

        assertEquals(4, ragged2d[0].length);
        assertEquals(2, ragged2d[1].length);
        assertEquals(3, ragged2d[2].length);

        assertEquals(4, ragged2d[0][3]);
        assertEquals(6, ragged2d[1][1]);
        assertEquals(7, ragged2d[2][0]);
    }

    @Test
    public void createRaggedArrayEmpty(){
        int[][] ragged2d= new int[10][];

        ragged2d[0] = new int[10];
        ragged2d[1] = new int[3];

        ArrayExerciseTest.print2DIntArray(ragged2d);
    }
}
