package day04_variables;

/*
Primitive Data Types
WHOLE NUMBERS / INTEGER TYPE:      byte, short, int, long --> If you use data directly, Java takes it as"int" by default/ automatically
DECIMAL NUMBERS FLOATING TYPE:     float, double          --> If you use data directly, Java takes it as"double" by default/ automatically

 */
public class FloatingNumbers {
    public static void main(String[] args){

        // In Java we canNOT store fraction directly
        System.out.println(3/4); // in math 3.4 = 0.75

        // To be able to store fraction / decimals we use FLOATING TYPE / DECIMALS numbers
        // Declared variable and assigned initial value
        double price = 3.99;

        System.out.println(price);

        //float average = 0.29F; // We put Uppercase F at the end
        float average = 0.29F; // We put Uppercase f at the end

        System.out.println(price);
        System.out.println(average);

        System.out.println(0.19);





    }
}
