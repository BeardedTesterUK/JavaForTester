package com.javafortesters.basicsofjavarevisite.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringExampleTest {

    @Test
    public void stringsConcatenated(){
        assertEquals("123456", "12" + "34" + "56");
    }

    @Test
    public void someStringMethods(){
        String aString = "abcdef";

        assertEquals(6, aString.length());
        assertTrue(aString.compareToIgnoreCase("ABCDEF")==0);
        assertTrue(aString.contains("bcde"));
        assertTrue(aString.startsWith("abc"));

        // string indexes start at 0
        assertEquals('c', aString.charAt(2));
        assertEquals("ef", aString.substring(4));
    }
}
