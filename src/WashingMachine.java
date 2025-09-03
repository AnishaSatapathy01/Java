public class WashingMachine extends Appliance{
    private double loadCapacity;
    public WashingMachine() {
        super("Generic", 2000.0);
        this.loadCapacity = 7.0;

    }
    public WashingMachine (String brand, double power, double load){
        super (brand, power);
        this.loadCapacity=load;
    }
    public double getLoadCapacity(){
        return loadCapacity;
    }
    public void setLoadCapacity(double load){
        this.loadCapacity=load;
    }
    public double calculateEnergyUsage(double hours){
        return (getpowerRating()*hours )/1000.0;
    }
    public String toString() {
        return super.toString() + " It has a load capacity of " + loadCapacity + " kg.";
    }

}

