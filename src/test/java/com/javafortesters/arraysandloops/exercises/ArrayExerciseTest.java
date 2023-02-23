package com.javafortesters.arraysandloops.exercises;

import com.javafortesters.domainentities.User;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class ArrayExerciseTest {

    @Test
    public void createAnArrayOfUsers() {
        User[] users = new User[3];

        users[0] = new User("bob", "BobsWord");
        users[1] = new User("Gem", "Wordgem");
        users[2] = new User("Hazel", "Bear");

        assertEquals("bob", users[0].getUsername());
        assertEquals("Gem", users[1].getUsername());
        assertEquals("Hazel", users[2].getUsername());
    }

    @Test
    public void listUsers() {
        User[] users = new User[3];

        users[0] = new User("bob", "BobsWord");
        users[1] = new User("Gem", "Wordgem");
        users[2] = new User("Hazel", "Bear");

        assertEquals("bob", users[0].getUsername());
        assertEquals("Gem", users[1].getUsername());
        assertEquals("Hazel", users[2].getUsername());

        for (User user : users) {
            System.out.println(user.getUsername());
        }
    }

    @Test
    public void create100Users() {
        User[] users = new User[100];

        for (int userIndex = 0; userIndex < 100; userIndex++) {
            int userId = userIndex + 1;
            users[userIndex] = new User("user" + userId,
                    "password" + userId);
        }

        for (User aUser : users) {
            System.out.println(aUser.getUsername() +
                    ", " +
                    aUser.getPassword());
        }
    }

    @Test
    public void sortWorkdaysArrayAndAssertResult(){
        String[] workdays = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday"};

        Arrays.sort(workdays);

        assertEquals(workdays[0], "Friday");
        assertEquals(workdays[1], "Monday");
        assertEquals(workdays[2], "Thursday");
        assertEquals(workdays[3], "Tuesday");
        assertEquals(workdays[4], "Wednesday");
    }


    @Test
    public void sortWorkdaysMixedCaseArrayAndAssertResult(){
        String[] workdays = {"monday", "Tuesday", "Wednesday",
                "thursday", "Friday"};

        Arrays.sort(workdays);

        assertEquals(workdays[0], "Friday");
        assertEquals(workdays[1], "Tuesday");
        assertEquals(workdays[2], "Wednesday");
        assertEquals(workdays[3], "monday");
        assertEquals(workdays[4], "thursday");
    }

    @Test
    public void createTriangle(){
        int[][]triangle = new int[16][];

        for(int row=0; row<triangle.length; row++){
            triangle[row] = new int[row+1];
            for(int i=0; i< (row+1); i++){
                triangle[row][i] = i;
            }
        }
        print2DIntArray(triangle);
    }

    public static void print2DIntArray(int[][] multi){
        for(int[] outer : multi){
            if(outer==null){
                System.out.print("null");
            }else{
                for(int inner : outer){
                    System.out.print(inner + ",");
                }
            }
            System.out.println("");
        }
    }
}
