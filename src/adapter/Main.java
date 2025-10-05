package adapter;

/**
 * Demo class to demonstrate the Adapter pattern in action.
 * Shows how different devices can be plugged into a standard power outlet
 * using their respective adapters.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Power Outlet Device Management System ===\n");
        
        // Create various devices (Adaptees)
        Laptop laptop = new Laptop("Dell XPS 15", 19.5);
        Refrigerator refrigerator = new Refrigerator("Samsung", 6.5);
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger("USB-C Fast Charger", 25.0);
        
        // Create adapters for each device
        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);
        
        // Plug all devices into power outlets through their adapters
        System.out.println("Plugging in Laptop:");
        laptopAdapter.plugIn();
        
        System.out.println("\nPlugging in Refrigerator:");
        refrigeratorAdapter.plugIn();
        
        System.out.println("\nPlugging in Smartphone Charger:");
        smartphoneAdapter.plugIn();
        
        // Demonstrate polymorphism - all devices treated uniformly
        System.out.println("\n=== Demonstrating Polymorphism ===");
        PowerOutlet[] devices = {laptopAdapter, refrigeratorAdapter, smartphoneAdapter};
        
        for (int i = 0; i < devices.length; i++) {
            System.out.println("\nDevice " + (i + 1) + ":");
            devices[i].plugIn();
        }
    }
}