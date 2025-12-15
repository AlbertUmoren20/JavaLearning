public abstract class Vehicle {
    abstract void accelerate();
    abstract void brake();

//common to all vehicles
    void startEngine(){
        System.out.println("Engine started");
    }

class Car extends Vehicle{
    @Override
    void accelerate(){
        System.out.println("Car is accelerating");
    }
    @Override
    void brake(){
        System.out.println("Car is braking");
    }

    public class Main{
        public static void main (String [] args){
            // Vehicle myVehicle = new Vehicle();
            Car myCar = new Car();
            myCar.startEngine();
            myCar.accelerate();
            myCar.brake();
        }
}}
}