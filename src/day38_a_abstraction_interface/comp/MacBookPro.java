package day38_a_abstraction_interface.comp;
// CONCRETE
public class MacBookPro implements Mac {
    @Override
    public void turnOn() {
        System.out.println("Turning on the Macbook Pro");
    }
}


class Runner {
    public static void main(String[] args) {
        // Reach static members with Interface
        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);
        Mac.company();

        System.out.println();
        // Reaching static members with Class
        System.out.println(MacBookPro.NAME);
        System.out.println(MacBookPro.OS);
        //MacbookPro.company(); // Interface Static method can ONLY be called with Interface


        System.out.println();
        // Mac m = new Mac();  // Cannot create object of Interface
        MacBookPro mP = new MacBookPro();
        mP.turnOn();
        mP.faceTime();


    }
}
