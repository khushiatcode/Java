package ooplab7;

//class created for implementation through class
class Class1 implements Travel {
    Class1() {
        System.out.println("\nGoing Naggar");
    }

    public void Naggar() {
        System.out.println("It's a town in Himachal Pradesh");
    }
}

public class Main {
    public static void main(String[] args) {

        // Method 1 //
        //implementation through class
        Class1 c = new Class1();
        c.Naggar();

        // Method 2 //
        //implementation through anonymous class
        Travel1 t1 = new Travel1() {
            @Override
            public void Mussoorie(int num1) {
                System.out.println("\nLet's go to Mussoorie!");
                System.out.println("No. of days required for exploring Mussoorie: " + num1);
            }
        };
        t1.Mussoorie(3);

        // Method 3 //
        //implementation through lambda expression

        Travel t = () -> {
            System.out.println("\nGoin Naggar through lambda expression");
            System.out.println("It's in Himachal Pradesh (lambda expression)");
        };
        t.Naggar();

        Travel1 t11 = (int num1) -> {
            System.out.println("");
        };

        Travel2 t2 = (int num2, String place1, String place2) -> {
            System.out.println("\n*** Landour ***");
            System.out.println("No. of days required to explore landour: " + num2);
            System.out.println("Places to visit in Landour: ");
            System.out.println("1. " + place1);
            System.out.println("2. " + place2);
        };
        t2.Landour(2, "Chaar Dukaan", "Landour Bakehouse");
    }
}


