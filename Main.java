/**
 * The Main class of the project.
 * Acts as a manager to use the rest of the classes.
 *
 * @author ananiamatthew
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    // instance variables
    private int option;
    private int run;
    
    // variables for the main loop
    private String iString;
    private double iDouble;
    private Equipment iEquipment;
    private Athlete.Gender iGender;
    private Activity.Mode iMode;

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Athlete> athleteList = new ArrayList();
        ArrayList<Activity> activityList = new ArrayList();
        ArrayList<Equipment> equipmentList = new ArrayList();
        run = 1;
        
        while (run == 1) {
            // This is where the main loop of the program will work
            
            System.out.println("Input an option:");
            System.out.println("1: Create an equipment\n2: Create an athlete");
            System.out.println("3: List all athletes\n4: Create an activity");
            System.out.println("5: List all activities\n6: List activities by athlete");
            System.out.println("7: List activities by mode\n8: Print activity details");
            System.out.println("9: Calculate total distance\n10: Calculate distance by athlete");
            System.out.println("11: Calculate burned calories by athlete\n12: Quit the program");
            option = sc.nextInt();
            
            System.out.println("\n");
            switch (option) {
                case 1:
                    // Create an equipment
                    System.out.println("Input equipment name:");
                    iString = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Input equipment weight in lbs:");
                    iDouble = sc.nextDouble();
                    equipmentList.add(new Equipment(iString, iDouble));
                    break;
                case 2:
                    // Create an athlete
                    System.out.println("Input athlete name:");
                    iString = sc.next();
                    sc.nextLine();
                    System.out.println("Input gender of athlete (Male, female, other):");
                    String gender = sc.next();
                    if ((gender.toUpperCase()).equals("MALE")) {
                        iGender = Athlete.Gender.MALE;
                    } else if ((gender.toUpperCase()).equals("FEMALE")) {
                        iGender = Athlete.Gender.FEMALE;
                    } else if ((gender.toUpperCase()).equals("OTHER")) {
                        iGender = Athlete.Gender.OTHER;
                    }
                    athleteList.add(new Athlete(iString, iGender));
                    break;
                case 3:
                    // List all athletes
                    System.out.println("List of athletes:");
                    for (int i = 0; i < athleteList.size(); i++) {
                        System.out.println("- " + athleteList.get(i));
                    }
                    break;
                case 4:
                    // Create an activity
                    break;
                case 5:
                    // List all activities
                    break;
                case 6:
                    // List activities by athlete
                    break;
                case 7:
                    // List activities by mode
                    break;
                case 8:
                    // Print activity details
                    break;
                case 9:
                    // Calculate total distance
                    break;
                case 10:
                    // Calculate distance by athlete
                    break;
                case 11:
                    // Calculate burned calories by athlete
                    break;
                case 12:
                    // Quit the loop
                    System.out.println("The program will stop now.");
                    run = 0;
                    break;
                default:
                    System.out.println("Invalid option selected, please try again.");
            }
            System.out.println("\n");
        }
    }
}
