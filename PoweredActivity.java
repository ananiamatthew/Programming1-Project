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
    public PoweredActivity(double iDistance, Mode iMode, String iName, Equipment iEquipment)
    {
        // initialise instance variables
        this.distance = iDistance;
        this.mode = iMode;
        this.activityName = iName;
        this.equipment = iEquipment;
    }
}
