package Assignment7;

@FunctionalInterface
interface Vampire {
    void Damon();
}

@FunctionalInterface
interface Warewolf {
    void Tyler(int num1);
}

@FunctionalInterface
interface Hybrid {
    void Klaus(int num2, String power);
}

class VampireClass implements Vampire {
    VampireClass() {
        System.out.println("\nVampire Class");
    }

    public void Damon() {
        System.out.println("Hello Brother! Damon this side...");
    }
}

public class Main {
    public static void main(String[] args) {

        // implementation through class
        VampireClass vc = new VampireClass();
        vc.Damon();

        // implementation through anonymous class
        Warewolf w = new Warewolf() {
            @Override
            public void Tyler(int num1) {
                System.out.println("\nWarewolf Class");
                System.out.println("This is Tyler!");
                System.out.println("No. of times Tyler transforms in a month: " +num1);
            }
        };
        w.Tyler(2);

        // implementation through lambda expression
        Hybrid hy = (int num2, String power) -> {
            System.out.println("\nHybrid Class");
            System.out.println("...Klaus supremacy...");
            System.out.println("No. of people compelled by Klaus in a day: "+num2);
            System.out.println("What can Klaus do? "+power);
        };
        hy.Klaus(89,"\nHe can compel people, transform into warewolf, goes above and beyond for Caroline"
                + " \u2661");
    }
}

