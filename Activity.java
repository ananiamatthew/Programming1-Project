/**
 * The Activity class for the project.
 *
 * @author ananiamatthew
 */
public class Activity
{
    // instance variables
    enum Mode {
        WALKING,
        RUNNING,
        BIKING
    }
    
    protected double distance;
    protected Mode mode;
    protected String activityName;

    /**
     * Constructor for objects of class Activity
     * No parameters
     */
    public Activity()
    {
    }
    
    /**
     * Constructor for objects of class Activity
     * Parameters are Name and Gender
     */
    public Activity(double iDistance, Mode iMode, String iName)
    {
        // initialise instance variables
        this.distance = iDistance;
        this.mode = iMode;
        this.activityName = iName;
    }
}
