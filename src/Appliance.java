public abstract class Appliance {
    private String brand;
    private double powerRating ;
    public  Appliance(String brand, double power){
        this.brand= brand;
        this.powerRating= power;
    }
     public String getBrand(){
        return brand;
     }
     public double getpowerRating(){
        return powerRating;
     }
     public void setBrand(String brand){
        this.brand =brand;
     }
     public void setpowerRating(double power){
        this.powerRating= power;
     }
     public abstract double calculateEnergyUsage(double hours);
    public String toString(){
        return "This appliance is from : "+brand+"with a power rating of "+powerRating+".";
    }
}

