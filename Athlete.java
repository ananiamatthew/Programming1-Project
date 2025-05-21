/**
 * The Athlete class for the project.
 *
 * @author ananiamatthew
 */
import java.util.ArrayList;

public class Athlete
{
    // instance variables
    enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    private String name;
    private Gender gender;
    private ArrayList <Activity> activityList;

    /**
     * Constructor for objects of class Athlete
     * Parameters are Name and Gender
     */
    public Athlete(String iName, Gender iGender)
    {
        // initialise instance variables
        this.name = iName;
        this.gender = iGender;
    }
    
    // Override toString
    @Override
    public String toString() {
        return "Name: " + this.name + " / Gender: " + this.gender;
    }
}
