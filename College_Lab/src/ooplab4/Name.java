package ooplab4;

//constructor overloading
class Student {

   Student() {
        System.out.println("unknown");
    }

    Student(String name) {
        System.out.println("Khushi");
    }
}

public class Name {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Khushi");
    }
}
