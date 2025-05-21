package day05_variables;

public class CellPhone {
    public static void main(String[] args) {
        String brand = "Apple";
        String model = "iPhone 16Pro";
        String color = "Black";

        double price = 1_100.99; // 1,100.99
        int storage = 256;
        boolean hasCamera = true;
        char sim = 'A';


        // with multiple println statement
        System.out.println("I have an " + model + " from " + brand + ".");
        System.out.println("It came with " + color + " color and with storage of " + storage + " GB.");
        System.out.println("For the SIM type " + sim + " with a camera: " + hasCamera + ", the total price is $" + price);

        System.out.println();

        // With 1 println statement
        System.out.println("I have an " + model + " from " + brand + ".\n" + "It came with " + color + " color and with storage of " + storage + " GB.\n" + "For the SIM type " + sim + " with a camera: " + hasCamera + ", the total price is $" + price);



    }}
