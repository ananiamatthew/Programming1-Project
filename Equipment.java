/**
 * The Equipment class for the project.
 * Used with Powered Activities.
 *
 * @author ananiamatthew
 */
public class Equipment
{
    // instance variables
    private String name;
    private double resistance;

    /**
     * Constructor for objects of class Equipment
     */
    public Equipment(String iName, double iResistance)
    {
        // initialise instance variables
        this.name = iName;
        this.resistance = iResistance;
    }
    
    // Override toString
    @Override
    public String toString() {
        return "Name: " + this.name + " / Resistance: " + this.resistance;
    }
}
