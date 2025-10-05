package adapter;

/**
 * Adaptee class representing a Smartphone Charger device.
 * Has its own specific interface that needs to be adapted.
 */
public class SmartphoneCharger {
    private String type;
    private double wattage;
    
    public SmartphoneCharger(String type, double wattage) {
        this.type = type;
        this.wattage = wattage;
    }
    
    /**
     * Specific method for charging a phone.
     */
    public void chargePhone() {
        System.out.println("Smartphone Charger (" + type + ") is charging phone at " + wattage + "W");
    }
    
    public String getType() {
        return type;
    }
    
    public double getWattage() {
        return wattage;
    }
}