package com.javafortesters.arraysandloops.examples;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ArraysClassTest {

    String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

    @Test
    public void arraysCopyAndResizeEmpty() {

        String[] weekDays;
        weekDays = Arrays.copyOf(workdays, 7);

        assertEquals(null, weekDays[5]);
        assertEquals(null, weekDays[5]);

        String days = "";
        for (String day : weekDays) {
            days = days + "|" + day;
        }

        assertEquals(7, weekDays.length);
        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday|null|null", days);
    }

    @Test
    public void arraysCopyOfAndTruncate() {
        String[] weekDays;
        weekDays = Arrays.copyOf(workdays, 3);

        assertEquals(3, weekDays.length);
        assertEquals("Monday", weekDays[0]);
        assertEquals("Tuesday", weekDays[1]);
        assertEquals("Wednesday", weekDays[2]);
    }

    @Test
    public void arraysCopyOfRange() {
        String[] weekDays = Arrays.copyOfRange(workdays, 2, 5);

        assertEquals(3, weekDays.length);
        assertEquals("Wednesday", weekDays[0]);
        assertEquals("Thursday", weekDays[1]);
        assertEquals("Friday", weekDays[2]);

        assertEquals(weekDays[0], workdays[2]);
        assertEquals(weekDays[1], workdays[3]);
        assertEquals(weekDays[2], workdays[4]);
    }

    @Test
    public void arraysCopyOfRangeResize() {
        String[] weekDays = Arrays.copyOfRange(workdays, 2, 7);

        assertEquals(5, weekDays.length);
        assertEquals("Wednesday", weekDays[0]);
        assertEquals("Thursday", weekDays[1]);
        assertEquals("Friday", weekDays[2]);

        assertEquals(null, weekDays[3]);
        assertEquals(null, weekDays[4]);
    }

    @Test
    public void fillAnArray() {
        int[] minusOne = new int[30];
        Arrays.fill(minusOne, -1);

        for (int arrayInt : minusOne) {
            assertEquals(-1, arrayInt);
        }
    }

    @Test
    public void fillPartOfAnArray(){
        int[] tenItems = {0,0,0,0,0,1,1,1,1,1};

        // fill cells 5 - 9 with '2'
        Arrays.fill(tenItems, 5, 10, 2);

        //0 - 4 are untouched
        assertEquals(0, tenItems[0]);
        assertEquals(0, tenItems[4]);

        // 5 - 9 now equal 2
        assertEquals(2, tenItems[5]);
        assertEquals(2, tenItems[6]);
        assertEquals(2, tenItems[7]);
        assertEquals(2, tenItems[8]);
        assertEquals(2, tenItems[9]);
    }

    @Test
    public  void sortAnArray(){
        int[] outOfOrder = {2,4,3,1,5,0};

        Arrays.sort(outOfOrder);

        assertEquals(0, outOfOrder[0]);
        assertEquals(1, outOfOrder[1]);
        assertEquals(2, outOfOrder[2]);
        assertEquals(3, outOfOrder[3]);
        assertEquals(4, outOfOrder[4]);
        assertEquals(5, outOfOrder[5]);
    }
}
