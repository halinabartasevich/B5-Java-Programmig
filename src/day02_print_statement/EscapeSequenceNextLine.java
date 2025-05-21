package day02_print_statement;

public class EscapeSequenceNextLine {
    public static void main(String[] args) {

        // \t ---> is for TAB which is equal to 4 spaces from beginning.
        System.out.println("This is not tabbled");
        System.out.println("    This is not tabbled");
        System.out.println("        This is not tabbled");
        System.out.println("        8 spacesd");

        System.out.println("\tThis is not tabbed");
        System.out.println("\t\tThis is not tabbed");
        System.out.println("u\t\tThis is not tabbed");



        System.out.println("-------------------------");


        // \n -----> is for bnext line
        System.out.print("This is all about NEW LINE with Escape SEQUENCE. \nHere we used escape sequence");
        //System.out.println("Here we used escape sequence");
        System.out.println("\nNew line");
    }
}
