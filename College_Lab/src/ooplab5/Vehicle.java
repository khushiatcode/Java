package ooplab5;

public class Vehicle {
    String vehicle_name,last_servicing;
    int registration_no, price, no_of_wheels,weight,engine_capacity;

}

class LMV extends Vehicle {
    int seating_capacity;
    String color,use;
}

class TwoWheeler extends LMV {
    int gear;
}

class FourWheeler extends LMV {
    String power_steering;
}

class HMV extends Vehicle {
    int weight_limit, loading;
}

class Truck extends HMV {
    int no_of_containers;
}

class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        LMV lmv = new LMV();
        HMV hmv = new HMV();
        TwoWheeler two = new TwoWheeler();
        FourWheeler four = new FourWheeler();
        Truck t = new Truck();

        v.vehicle_name = "Willys Jeep";
        v.last_servicing = "2020";
        v.registration_no = 1357;
        hmv.price = 11500;
        hmv.no_of_wheels = 4;
        lmv.weight = 969;
        lmv.engine_capacity = 60;
        two.seating_capacity = 5;
        two.color = "Black";
        two.use = "Road Trips";
        two.gear = 6;
        four.power_steering = "four turns lock to lock";
        t.weight_limit = 980;
        t.loading = 619;
        t.no_of_containers = 4;

        System.out.println("Name of the vehicle: " + v.vehicle_name);
        System.out.println("Last service year: "+ v.last_servicing);
        System.out.println("Registration Number: "+v.registration_no);
        System.out.println("Price: "+hmv.price);
        System.out.println("No. of Wheels: "+hmv.no_of_wheels);
        System.out.println("Curb Weight (w/o a driver): " +lmv.weight);
        System.out.println("Engine capacity: "+lmv.engine_capacity);
        System.out.println("Seating capacity: "+two.seating_capacity);
        System.out.println("Color: "+two.color);
        System.out.println("Use: " +two.use);
        System.out.println("Gears: " +two.gear);
        System.out.println("Power Steering: "+four.power_steering);
        System.out.println("Weight limit: "+t.weight_limit);
        System.out.println("Payload: "+t.loading);
        System.out.println("No. of containers: " +t.no_of_containers);
    }
}


