package day05_variables;

public class test {
    public static void main(String [] args){

        String petNames = "Buddy";
        String typeOfAnimal = "dog";
        byte age = 5;
        double weight = 5.1;
        String kg = "kg";
        boolean vaccinated = false;

        System.out.println("Pet Information");
        System.out.println("I have a " + typeOfAnimal);
        System.out.println("It is " + age + " ears old.");
        System.out.println("Weight is " + weight + "" + kg);
        System.out.println("Is it vactinated? " + vaccinated);

        System.out.println("****************************************");

        int price, quantity, total;
        price = 2;
        quantity = 3;
        total = price * quantity;

        System.out.println(2 + 3);
        System.out.println(price + total);
        System.out.println(2 + 3 * total);

        int a1, b1, c1 = 25;
        a1 = 5;
        b1 = a1;
        System.out.println(a1+ b1 + c1);
    }
}
