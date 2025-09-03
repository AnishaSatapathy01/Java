// Vehicle.java
public abstract class Vehicle {
    private String type;
    private String name;

    // Constructor with one argument
    public Vehicle(String type) {
        this.type = type;
        this.name = "Generic"; // Default value for model
    }

    // Constructor with two arguments
    public Vehicle(String type, String model) {
        this.type = type;
        this.name = model;
    }

    // Getter for model
    public String getModel() {
        return name;
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Setter for model
    public void setModel(String model) {
        this.name = model;
    }

    // Setter for type
    public void setType(String type) {
        this.type = type;
    }

    // Abstract method (no implementation here)
    public abstract double calculateFuelEfficiency();

    // toString method

    public String toString() {
        return "This vehicle is a " + type + ", model " + name + ".";
    }
}
