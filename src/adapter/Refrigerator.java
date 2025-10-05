package adapter;

/**
 * Adaptee class representing a Refrigerator device.
 * Has its own specific interface that needs to be adapted.
 */
public class Refrigerator {
    private String brand;
    private double amperage;
    
    public Refrigerator(String brand, double amperage) {
        this.brand = brand;
        this.amperage = amperage;
    }
    
    /**
     * Specific method for starting the refrigerator's cooling system.
     */
    public void startCooling() {
        System.out.println("Refrigerator (" + brand + ") is now cooling at " + amperage + "A");
    }
    
    public String getBrand() {
        return brand;
    }
    
    public double getAmperage() {
        return amperage;
    }
}