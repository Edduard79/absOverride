public class Boat extends Vehicle{

    private double maxKnotsSpeed;
    private int boatKilosWeight;
    @Override
    public void doVehicleSound() {
        System.out.println("Flush?!");
    }

    public Boat(double maxSpeed, int weight){
        this.type = "BOAT";
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    public String getBoatWeightAndSpeed(){
        return "Boat weight: " + this.boatKilosWeight + "kg.\n" + "Max speed: " + this.maxKnotsSpeed + "knots";
    }


}
