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
        type = 2;
    }
    
    /**
     * Get the number of calories burned from this activity
     *
     * No parameters
     * @return    Number of calories
     */
    public double getCaloriesBurned()
    {
        return (this.distance * 60 + (this.equipment.getResistance() * 10));
        // This probably isn't accurate, but it's just to demonstrate how it works
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
        return "POWERED ACTIVITY - Name: " + this.activityName + " / Mode: " + this.mode + " / Distance: " + this.distance + " / Athlete: " + this.athleteName + " / Equipment: " + this.equipment;
    }
}
