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
    private String athleteName;

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
                    iString = sc.next();
                    sc.nextLine();
                    System.out.println("Input equipment resistance / weight in lbs:");
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
                    System.out.println("Input activity name:");
                    iString = sc.next();
                    sc.nextLine();
                    System.out.println("Input which athlete will be doing this activity:");
                    athleteName = sc.next();
                    sc.nextLine();
                    System.out.println("Input activity distance in kilometres:");
                    iDouble = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Input activity mode (Walking, running, biking, swimming, skating):");
                    String mode = sc.next();
                    if ((mode.toUpperCase()).equals("WALKING")) {
                        iMode = Activity.Mode.WALKING;
                    } else if ((mode.toUpperCase()).equals("RUNNING")) {
                        iMode = Activity.Mode.RUNNING;
                    } else if ((mode.toUpperCase()).equals("BIKING")) {
                        iMode = Activity.Mode.BIKING;
                    } else if ((mode.toUpperCase()).equals("SWIMMING")) {
                        iMode = Activity.Mode.SWIMMING;
                    } else if ((mode.toUpperCase()).equals("SKATING")) {
                        iMode = Activity.Mode.SKATING;
                    }
                    System.out.println("Input equipment name (or None if there is no equipment):");
                    String equipment = sc.next();
                    if ((equipment.toUpperCase()).equals("NONE")) {
                        activityList.add(new Activity(iDouble, iMode, iString, athleteName));
                    } else {
                        for (int i = 0; i < equipmentList.size(); i++) {
                            if (((equipmentList.get(i)).getName()).equals(equipment)) {
                                iEquipment = equipmentList.get(i);
                            }
                        }
                        activityList.add(new PoweredActivity(iDouble, iMode, iString, athleteName, iEquipment));
                    }
                    break;
                case 5:
                    // List all activities
                    System.out.println("List of activities:");
                    for (int i = 0; i < activityList.size(); i++) {
                        System.out.println("- " + activityList.get(i));
                    }
                    break;
                case 6:
                    // List activities by athlete
                    System.out.println("Input athlete name:");
                    athleteName = sc.next();
                    System.out.println("List of activities for " + athleteName + ":");
                    for (int i = 0; i < activityList.size(); i++) {
                            if (((activityList.get(i)).getAthleteName()).equals(athleteName)) {
                                System.out.println("- " + activityList.get(i));
                            }
                    }
                    break;
                case 7:
                    // List activities by mode
                    System.out.println("Input mode:");
                    iMode = Activity.Mode.valueOf(sc.next().toUpperCase());
                    System.out.println("List of activities for " + iMode + ":");
                    for (int i = 0; i < activityList.size(); i++) {
                            if (((activityList.get(i)).getMode()).equals(iMode)) {
                                System.out.println("- " + activityList.get(i));
                            }
                    }
                    break;
                case 8:
                    // Print activity details
                    System.out.println("Input activity name:");
                    String activityName = sc.next();
                    System.out.println(activityName + ":");
                    for (int i = 0; i < activityList.size(); i++) {
                            if (((activityList.get(i)).getActivityName()).equals(activityName)) {
                                System.out.println("PARTICIPATING ATHLETE: " + activityList.get(i).getAthleteName());
                                System.out.println("DISTANCE: " + activityList.get(i).getDistance());
                                System.out.println("MODE OF TRANSPORTATION: " + activityList.get(i).getMode());
                                if (activityList.get(i).getType() == 2) {
                                    System.out.println("EQUIPMENT: " + activityList.get(i).getEquipment());
                                }
                                System.out.println("CALORIES BURNED: " + activityList.get(i).getCaloriesBurned());
                            }
                    }
                    break;
                case 9:
                    // Calculate total distance
                    double totalDistance = 0;
                    for (int i = 0; i < activityList.size(); i++) {
                            totalDistance = totalDistance + activityList.get(i).getDistance();
                    }
                    System.out.println("Total distance from all activities: " + totalDistance);
                    break;
                case 10:
                    // Calculate distance by athlete
                    double athleteDistance = 0;
                    for (int i = 0; i < activityList.size(); i++) {
                            if (((activityList.get(i)).getAthleteName()).equals(athleteName)) {
                                athleteDistance = athleteDistance + activityList.get(i).getDistance();
                            }
                    }
                    System.out.println("Total distance for this athlete: " + athleteDistance);
                    break;
                case 11:
                    // Calculate burned calories by athlete
                    double athleteCalories = 0;
                    for (int i = 0; i < activityList.size(); i++) {
                            if (((activityList.get(i)).getAthleteName()).equals(athleteName)) {
                                athleteCalories = athleteCalories + activityList.get(i).getCaloriesBurned();
                            }
                    }
                    System.out.println("Total calories burned for this athlete: " + athleteCalories);
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
