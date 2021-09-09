package ooplab4;

class Member {
    String name, address, phone;
    int age;
    long salary;

    void printsalary() {
        System.out.println(salary);
    }
}

class Employee extends Member {
        String specialization;
}

class Manager extends Member {
    String department;
}

public class Main1 {
    public static void main(String [] args) {
        Employee e = new Employee();
        e.name = "Variant";
        e.age = 21;
        e.phone = "+101-1001-001";
        e.address = "End of the world";
        e.salary = 11111111;
        e.printsalary();
        e.specialization = "mind control";

        Manager m = new Manager();
        m.name = "First Variant";
        m.age = 19;
        m.phone = "+101-1001-111";
        m.address = "End of the world";
        m.salary = 1111111111;
        m.department = "TVA";
    }
}
