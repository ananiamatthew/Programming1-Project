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
    
    // Getters / Setters
    public String getName()
    {
        return this.name;
    }
    public void setName(String input)
    {
        this.name = input;
    }
    public Gender getGender()
    {
        return this.gender;
    }
    public void setGender(Gender input)
    {
        this.gender = input;
    }
    
    // Override toString
    @Override
    public String toString() {
        return "ATHLETE - Name: " + this.name + " / Gender: " + this.gender;
    }
}
