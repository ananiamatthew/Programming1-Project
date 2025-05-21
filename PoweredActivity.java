/**
 * The Powered Activity class for the project.
 * Subclass of Activity, uses Equipment.
 *
 * @author ananiamatthew
 */
public class PoweredActivity extends Activity
{
    // instance variables
    private Equipment equipment;

    /**
     * Constructor for objects of class PoweredActivity
     * Parameters are Name and Gender
     */
    public PoweredActivity(double iDistance, Mode iMode, String iName, String iAthleteName, Equipment iEquipment)
    {
        // initialise instance variables
        this.distance = iDistance;
        this.mode = iMode;
        this.activityName = iName;
        this.athleteName = iAthleteName;
        this.equipment = iEquipment;
    }
    
    // Getters / Setters
    public Equipment getEquipment()
    {
        return this.equipment;
    }
    public void setEquipment(Equipment input)
    {
        this.equipment = input;
    }
    
    @Override
    public String toString() {
        return "POWERED ACTIVITY - Name: " + this.activityName + " / Mode: " + this.mode + " / Distance: " + this.distance + " / Equipment: " + this.equipment;
    }
}
