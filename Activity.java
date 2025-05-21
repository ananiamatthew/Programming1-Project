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
        BIKING,
        SWIMMING,
        SKATING
    }
    
    protected double distance;
    protected Mode mode;
    protected String activityName;
    protected String athleteName;

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
    public Activity(double iDistance, Mode iMode, String iName, String iAthleteName)
    {
        // initialise instance variables
        this.distance = iDistance;
        this.mode = iMode;
        this.activityName = iName;
        this.athleteName = iAthleteName;
    }
    
    // Getters / Setters
    public double getDistance()
    {
        return this.distance;
    }
    public void setDistance(double input)
    {
        this.distance = input;
    }
    public Mode getMode()
    {
        return this.mode;
    }
    public void setMode(Mode input)
    {
        this.mode = input;
    }
    public String getActivityName()
    {
        return this.activityName;
    }
    public void setActivityName(String input)
    {
        this.activityName = input;
    }
    public String getAthleteName()
    {
        return this.athleteName;
    }
    public void setAthleteName(String input)
    {
        this.athleteName = input;
    }
    
    // Override toString
    @Override
    public String toString() {
        return "ACTIVITY - Name: " + this.activityName + " / Mode: " + this.mode + " / Distance: " + this.distance;
    }
}
