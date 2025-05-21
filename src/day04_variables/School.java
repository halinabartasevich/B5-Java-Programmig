package day04_variables;

import java.sql.SQLOutput;

public class School {
    public static void main(String[] args){

         // NAMING  CONVENTIONS - RULES
         // camelCase
        // any letters
        //any number EXCEPT begginnig
        // 2 special character alowd anywhere ----> $ and _ (no other special characters)

        int grade1 = 44;
        int grade2 = 50;
        int grade3 = 20;
        int grade4 = 70;
        int grade5 = 150;

        //int totalNumberOfStudent = 40 + 50 + 20 + 70 + 150; // Hardcoded
        int totalNumberOfStudent = grade1 + // Dynamically
                grade2 +
                grade3 +
                grade4 +
                grade5;

        System.out.println("Number of student in Grade 1: " + grade1);
        System.out.println("Number of student in Grade 2: " + grade2);
        System.out.println("Number of student in Grade 3: " + grade3);
        System.out.println("Number of student in Grade 4: " + grade4);
        System.out.println("Number of student in Grade 5: " + grade5);

        System.out.println("Total nr of studetnt at school:" + totalNumberOfStudent);
        System.out.println();

        double numberOfSchoolDaysInYear = 100.5;
        double numberOfSnowDaysInYear = 20.5;
        double averageGPA = 3.5;

        System.out.println("Nr of sc years:" + numberOfSnowDaysInYear);
        System.out.println("Nr of sc DPS:" + averageGPA);

    }
}
