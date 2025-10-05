package adapter;

/**
 * Target interface representing a standard power outlet.
 * All devices must be adapted to use this interface.
 */
public interface PowerOutlet {
    /**
     * Standard method for plugging in devices to the power outlet.
     */
    void plugIn();
}