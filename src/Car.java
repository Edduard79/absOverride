public class Car extends Vehicle {

    private int numberOfDoors;
    private double carPrice;

    public void showVehicleDetails(){
        super.showVehicleDetails();
        System.out.println("Has " + this.numberOfDoors + " doors.");
    }

    public void doVehicleSound(){
        System.out.println("Brooom?");
    }

    public Car(int wheels, int doors, double price){
        this.type = "CAR";
        this.numberOfWheels = wheels;
        this.numberOfDoors = doors;
        this.carPrice = price;

    }
    


}
