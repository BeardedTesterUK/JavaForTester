package com.javafortesters.selectiondecisions.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SelectionExerciseTest {

    @Test
    public void countrySwitch(){
        assertEquals("United Kingdom", countryBasedOnShortCode("UK"));
        assertEquals("United States", countryBasedOnShortCode("US"));
        assertEquals("United States", countryBasedOnShortCode("USA"));
        assertEquals("United States", countryBasedOnShortCode("UsA"));
        assertEquals("France", countryBasedOnShortCode("FR"));
        assertEquals("Sweden", countryBasedOnShortCode("sE"));
        assertEquals("Rest Of World", countryBasedOnShortCode("ES"));
        assertEquals("Rest Of World", countryBasedOnShortCode("CH"));
    }

    public String countryBasedOnShortCode(String shortCode){
        String country;

        switch(shortCode.toUpperCase()){
            case "UK":
                country = "United Kingdom";
                break;
            case "US":
            case "USA":
                country = "United States";
                break;
            case "FR":
                country = "France";
                break;
            case"SE":
                country = "Sweden";
                break;
            default:
                country = "Rest Of World";
        }
        return country;
    }

    @Test
    public void integerSwitch(){
        assertEquals("One", integerString(1));
        assertEquals("Two", integerString(2));
        assertEquals("Three", integerString(3));
        assertEquals("Four", integerString(4));
        assertEquals("Too big", integerString(5));
        assertEquals("Too big", integerString(Integer.MAX_VALUE));
        assertEquals("Too small", integerString(0));
        assertEquals("Too small", integerString(Integer.MIN_VALUE));
    }

    public String integerString (int anInt){
        String value = "";

        switch(anInt){
            case 1 :
                value = "One";
                break;
            case 2 :
                value = "Two";
                break;
            case 3 :
                value = "Three";
                break;
            case 4 :
                value = "Four";
                break;
            default:
                if(anInt < 1){
                    value = "Too small";
                }
                if(anInt > 4){
                    value = "Too big";
                }
                break;
        }
        return value;
    }
}
