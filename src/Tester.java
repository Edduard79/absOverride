public class Tester {
    public Tester(){
    }
    public static void main(String[] args){

        Car car = new Car(4, 5,40000);
        Boat boat = new Boat(45.7, 1400);

        car.showVehicleDetails();
        car.doVehicleSound();

        System.out.println("-------------------");

        boat.showVehicleDetails();
        boat.doVehicleSound();

        System.out.println(boat.getBoatWeightAndSpeed());

    }
}
