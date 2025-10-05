package adapter;

/**
 * Adapter class that adapts a SmartphoneCharger to the PowerOutlet interface.
 * Translates the plugIn() method to the smartphone charger's chargePhone() method.
 */
public class SmartphoneAdapter implements PowerOutlet {
    private SmartphoneCharger smartphoneCharger;
    
    public SmartphoneAdapter(SmartphoneCharger smartphoneCharger) {
        this.smartphoneCharger = smartphoneCharger;
    }
    
    /**
     * Implements the PowerOutlet interface by delegating to the smartphone charger's chargePhone method.
     */
    @Override
    public void plugIn() {
        System.out.println("SmartphoneAdapter: Adapting smartphone charger to power outlet...");
        smartphoneCharger.chargePhone();
    }
}