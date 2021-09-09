package ooplab4;

class Parentclass {
    void information() {
        System.out.println("This is Parent class");
    }
}

class Childclass extends Parentclass {
    void child() {
        System.out.println("This is child class");
    }
}

public class Display {
    public static void main(String[] args) {
        Parentclass pc = new Parentclass(); //object pf parent class
        Childclass cc = new Childclass(); //object of child class

        pc.information(); //calling method of parent class by object of parent class
        cc.child(); //calling method of child class by object of child class
        cc.information(); //calling method of parent class by object of child class
    }
}
