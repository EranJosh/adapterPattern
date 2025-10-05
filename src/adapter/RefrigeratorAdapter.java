package adapter;

/**
 * Adapter class that adapts a Refrigerator to the PowerOutlet interface.
 * Translates the plugIn() method to the refrigerator's startCooling() method.
 */
public class RefrigeratorAdapter implements PowerOutlet {
    private Refrigerator refrigerator;
    
    public RefrigeratorAdapter(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }
    
    /**
     * Implements the PowerOutlet interface by delegating to the refrigerator's startCooling method.
     */
    @Override
    public void plugIn() {
        System.out.println("RefrigeratorAdapter: Adapting refrigerator to power outlet...");
        refrigerator.startCooling();
    }
}