package day03_comments_escape_sequence;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class PrimitivesDataTypes {
    public static void main(String[] agrs){

        //I want to have a variable that holds age of the person - with two statements
        int age; // I DECLARED (created) a variable (container) called "age" wich will hold whole numbers (int)
        age = 20; // I assigned a value 20 to the "variable" age

int miles = 200; // I DECLARED (created)  a variable (container) called "miles" and assigned whole number 200 to it.

        age = 40;

        System.out.println(age);

// The following exp is a joke. just only to explane a flow.
        System.out.println("I bought new car with 0 miles");
        int carMiles = 25;
        System.out.println( carMiles );
        System.out.println("I drove 50 miles");
        carMiles = 50;
        System.out.println( carMiles);
        carMiles = 15;
        System.out.println("I took my car to a special place to erase 25 miles.");
        carMiles = 25;
        System.out.println( carMiles);

        System.out.println("------------------------------------------------------------------");
        int year = 2025; // I DECLARED a variable called "year"  with date int(whole number)and assigned a value "2025" to it
        System.out.println (year); // DYNAMICALLY I am using data with variables in Dynamic way
        System.out.println ("year"); // Here we just print the DATA (letters - STRING) directly
        System.out.println (2025); // Here we just print the DATA (NUMBERS int) directly NO RELATION with variable code "year".


        System.out.println("------------------------------------------------------------------");
        //byte age // No matter the data type is, we can NOT use the same variable name one more time in the SAME method
        byte number = 0;
        System.out.println(number);

        number = -128;
        System.out.println(number);
        number = 127;
        System.out.println(number);

         //number = 128;
         //number = -129;

            short number2 = 200;
            System.out.println(number2);

            int number3 = 10;
            System.out.println(number3);

            long number4 = 123456789L;
            System.out.println(number4);
            long number5 = 123456789L;
            System.out.println(number5);
    }
    }
