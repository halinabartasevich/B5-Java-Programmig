package day04_variables;

public class Fruits {
    public static void main(String[] args){


        int appleCount = 80;
        int grapeCount = 100;
        int bananaCount = 150;

//        System.out.println("This is how many apples we have: 80"); // Hard coding - using static value
//        System.out.println("I have sold 50 apples");
//        System.out.println("This is how many apples left 30");
//        System.out.println();

        System.out.println("This is how many apples we have: "  + appleCount);
        appleCount = 80 - 50; //re-assinged new value
        System.out.println("This is how many apples left" + appleCount);
        System.out.println();

        System.out.println("Grape count: " + grapeCount);
        System.out.println("bananaCount: " + bananaCount);
        System.out.println();

        int appleTotalPrice = 15;
        // This price of my 30 apples is $15
        // System.out.println(" // This price of my 30 apples is $15");  Hardcodedly used the data
        System.out.println("This price of my " + appleCount + " apples is $" + appleTotalPrice); // dynamiclly used the data
        System.out.println();

        // CONCATENATION --> after first double quotation, EVERYTHING is put next to each other
        // After Concatenation (including Concatenation) --> everything become LETTER data type (String)
        System.out.println(10 + 10); // NO double quatation in this line of code
        System.out.println("" + 10 + 10); // 1010
        System.out.println(10 + 10 + "" + 10 +10); // 201010
        System.out.println("" + 10 + 10 + "" + 10 +10); //10101010
        System.out.println("ab" + 10 + 10 + "" + 10 +10); // ab10101010
        System.out.println("ab" + 10 + 10  + 10 +10); // ab10101010
        System.out.println("" + 10 + 10 + "  " + 10 +10); // 10101010
        System.out.println(10 + 10 + "  " + 10 +10); // 20  1010

        System.out.println("" + (10 + 10)); // 20 (=letters/ String)

        // 4 * 3 + 2 = 14
        // 4 * (3 + 2) = 20

    }
}
