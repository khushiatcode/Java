package Assignment7ninad;

@FunctionalInterface
interface Football {
    public abstract void Messi();
}

@FunctionalInterface
interface Football1 {
    public abstract void Ronaldo(int num1);
}

@FunctionalInterface
interface Football2 {
    void Neymar(int num2, String team1, String team2);
}

public class Main1 {
    public static void main(String[] args) {

        //implementation through lambda expression

        Football f = () -> {
            System.out.println("\nFootball is selected");
            System.out.println("Number 10 of football belongs to Messi!");
        };
        f.Messi();

        Football1 f1 = (int num1) -> {
            System.out.println("\nFootball1 is selected");
            System.out.println("Cristiano is number: " + num1);
        };
        f1.Ronaldo(7);


        Football2 f2 = (int num2, String team1, String team2) -> {
            System.out.println("\nFootball2 is selected");
            System.out.println("Neymar's Jersey Number: " + num2);
            System.out.println("Teams in which Neymar has played ");
            System.out.println("1. " + team1);
            System.out.println("2. " + team2);
        };
        f2.Neymar(2, "FCB", "PSG");
    }
}

