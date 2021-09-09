package ooplab4;

class Bank {
    int getRateOfinterest()
    {
        return 0;
    }
}

class SBI extends Bank {
    int getRateOfinterest()
    {
        return 1;
    }

    //method overloading by changing the no. of parameters
    static int customer (int a, int b)
    {
        return a + b;
    }

    static int customer (int a, int b, int c)
    {
        return a + b + c;
    }

    //method overloading by changing the data type of the parameters
    static char[] displInfo(String name, int pincode) {
        System.out.println("Name: " +name);
        System.out.println("Pincode: " +pincode);
        return new char[0];
    }

    static char[] displInfo (String name, String pincode) {
        System.out.println("Name from overloaded class: " +name);
        System.out.println("Pincode from overloaded class: "+pincode);
        return new char[0];
    }
}

class ICICI extends Bank {
    int getRateOfinterest()
    {
        return 2;
    }
}

class AXIS extends Bank {
    int getRateOfinterest()
    {
        return 3;
    }
}

public class Main {
    public static void main(String[] args) {
        SBI one = new SBI();
        ICICI two = new ICICI();
        AXIS three = new AXIS();

        System.out.println("ROI of SBI: " +one.getRateOfinterest());
        System.out.println("ROI of ICICI: " +two.getRateOfinterest());
        System.out.println("ROI of AXIS: " +three.getRateOfinterest() +"\n");
        System.out.println("Total returns of two customers: "+SBI.customer(2,3));
        System.out.println("Total returns of three customers: "+SBI.customer(2,3,5) + "\n");
        System.out.println(SBI.displInfo("khushi",  12345));
        System.out.println(SBI.displInfo("khushi", "abc123"));

    }
}
