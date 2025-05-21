package day05_variables;

public class MyName {
    public static void main(String [] args){
        char l1 = 'H';
        char l2 = 'a';
        char l3 = 'l';
        char l4 = 'i';
        char l5 = 'n';
        char l6 = 'a';

        System.out.println(l1);
        System.out.println("second: " + l2);
        System.out.println("third: " + l3);
        System.out.println("fourth: " + l4);
        System.out.println("fifth: " + l5);
        System.out.println("sixth: " + l6);

        System.out.println();

        System.out.println(l1 + 0);
        System.out.println(l2 + 0);
        System.out.println(l3 + 0);
        System.out.println(l4 + 0);
        System.out.println(l5 + 0);
        System.out.println(l6 + 0);

        System.out.println(l1 + l2 + l3 + l4 + l5 + l6);

        //"Halina"
        String name = "" + l1 + l2 + l3 + l4 + l5 + l6;
        System.out.println(name);

        String name2 = "" + l2 +l2;
        System.out.println(name2 + l2);


        char letter1 = 2347;
        System.out.println(letter1);

        char letter2 = 694;
        System.out.println(letter2);
    }
}
