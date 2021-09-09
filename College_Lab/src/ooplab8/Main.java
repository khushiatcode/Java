package ooplab8;

import java.util.Scanner;

class IdException extends RuntimeException {
    IdException (String msg) {
        super(msg);
    }
}

class Employee {
     int id;
     String name;

    /*public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }*/
}

class CS extends Employee {
    String[] id1 = new String[50];
    String[] name1 = new String[50];
}

class IT extends Employee {
    String[] id2 = new String[50];
    String[] name2 = new String[50];
}

class EC extends Employee {
    String[] id3 = new String[50];
    String[] name3 = new String[50];
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CS cs = new CS();
        IT it = new IT();
        EC ec = new EC();
        System.out.println("***Details od all the departments***");

        System.out.println("Enter the name of employees of CS department : ");
        for(int i=0;i<50;i++) {
            System.out.printf("Enter name of %d employee of CS department : ",i+1);
            String a = in.nextLine();
            System.out.printf("Enter ID of %d employee of CS department : ",i+1);
            String a1 = in.nextLine();
            cs.name1[i] = a;
            cs.id1[i] = a1;
        }

        System.out.println("Enter the name of employees of IT department : ");
        for(int i=0;i<50;i++) {
            System.out.printf("Enter name of %d employee of IT department : ",i+1);
            String b = in.nextLine();
            System.out.printf("Enter ID of %d employee of IT department : ",i+1);
            String b1 = in.nextLine();
            it.name2[i] = b;
            it.id2[i] = b1;
        }

        System.out.println("Enter the name of employees of EC department : ");
        for(int i=0;i<50;i++) {
            System.out.printf("Enter name of %d employee of EC department : ",i+1);
            String c = in.nextLine();
            System.out.printf("Enter ID of %d employee of EC department : ",i+1);
            String c1 = in.nextLine();
            ec.name3[i] = c;
            ec.id3[i] = c1;
        }

        System.out.println("Choose a department to get information about the Employee : ");
        System.out.println("1. CS");
        System.out.println("2. IT");
        System.out.println("3. EC");
        System.out.println("Choose the given options : ");
        int m = in.nextInt();
        switch (m) {
            case 1:
                System.out.println();
        }


        /* try {
            int id[] = new int[];
            if (id.) {
                throw new IdException("your ID does not match");
            }
            else {
                System.out.println("Your ID is valid");
            }
        }
        catch (IdException e) {
            e.printStackTrace();
            System.out.println(e);
        }
        finally {
            System.out.println("finally executed");
        }
        System.out.println("Rest of the code");*/
    }
}
