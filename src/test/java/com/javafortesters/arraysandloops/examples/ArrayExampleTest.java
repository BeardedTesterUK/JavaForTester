package com.javafortesters.arraysandloops.examples;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class ArrayExampleTest {

    String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

    @Test
    public void simpleArrayExample(){
        String[] numbers0123 = {"zero", "one", "two","three"};

        for(String numberText : numbers0123){
            System.out.println(numberText);
        }
        assertEquals("zero", numbers0123[0]);
        assertEquals("three", numbers0123[3]);
    }

    @Test
    public void arrayInitialisation(){
        int[] integers = new int[10];
        int []moreInts = new int[10];
        int evenMore[] = new int[10];

        String strings[] = new String[10];

        int[] ints1to10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] zeroLength = {};
        int[] moreZeroLength = new int[0];

        int[] uninitialisedArray;

        uninitialisedArray = new int[10];

        uninitialisedArray = new int[] {100, 200, 300};
    }

    @Test
    public void forEachLoop(){
        String days = "";

        for(String workday : workdays){
            days = days + "|" + workday;
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days);
    }

    @Test
    public void forLoopWithFixedCondition(){
        String days = "";

        for(int i=0; i<5; i++){
            days = days + "|" + workdays[i];
        }
        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days);
    }

    @Test
    public void forLoopUsingIndexFixedCondition(){
        String days = "";

        for(int i=0; i<5; i++){
            days = days + "|" + i + "-" + workdays[i];
        }

        assertEquals("|0-Monday|1-Tuesday|2-Wednesday|3-Thursday|4-Friday", days);
    }

    @Test
    public void arraySize(){
        assertEquals(5, workdays.length);
    }

    @Test
    public void arraySizeInForLoop() {
        String days = "";

        for (int i = 0; i < workdays.length; i++) {
            days = days + "|" + workdays[i];
        }
        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday",days);
    }
}
