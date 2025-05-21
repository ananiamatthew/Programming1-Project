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
    
    // Getters / Setters
    public String getName()
    {
        return this.name;
    }
    public void setName(String input)
    {
        this.name = input;
    }
    public double getResistance()
    {
        return this.resistance;
    }
    public void setResistance(double input)
    {
        this.resistance = input;
    }
    
    // Override toString
    @Override
    public String toString() {
        return "EQUIPMENT - Name: " + this.name + " / Resistance: " + this.resistance;
    }
}
