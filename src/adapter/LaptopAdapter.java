package adapter;

/**
 * Adapter class that adapts a Laptop to the PowerOutlet interface.
 * Translates the plugIn() method to the laptop's charge() method.
 */
public class LaptopAdapter implements PowerOutlet {
    private Laptop laptop;
    
    public LaptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }
    
    /**
     * Implements the PowerOutlet interface by delegating to the laptop's charge method.
     */
    @Override
    public void plugIn() {
        System.out.println("LaptopAdapter: Adapting laptop to power outlet...");
        laptop.charge();
    }
}