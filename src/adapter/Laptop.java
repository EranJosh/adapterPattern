package adapter;

/**
 * Adaptee class representing a Laptop device.
 * Has its own specific interface that needs to be adapted.
 */
public class Laptop {
    private String model;
    private double voltage;
    
    public Laptop(String model, double voltage) {
        this.model = model;
        this.voltage = voltage;
    }
    
    /**
     * Specific method for charging the laptop.
     */
    public void charge() {
        System.out.println("Laptop (" + model + ") is charging at " + voltage + "V");
    }
    
    public String getModel() {
        return model;
    }
    
    public double getVoltage() {
        return voltage;
    }
}