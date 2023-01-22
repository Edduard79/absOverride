public abstract class Vehicle {

    public Vehicle(){

    }
    public String type;
    public int numberOfWheels;


    public void showVehicleDetails(){
        System.out.println("Vehicle type: " + this.type+ "\n"+ "Has " + this.numberOfWheels + " wheels.");
    }

    public abstract void doVehicleSound();

}
