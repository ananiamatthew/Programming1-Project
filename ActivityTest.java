

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ActivityTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ActivityTest
{
    /**
     * Default constructor for test class ActivityTest
     */
    public ActivityTest()
    {
        testGetCaloriesBurned(5);
        // Expected value: 300
        // Value returned: 300
        
        testGetCaloriesBurned(3);
        // Expected value: 180
        // Value returned: 180
    }
    
    @Test
    public double testGetCaloriesBurned(double distance) {
        System.out.println(distance * 60);
        return (distance * 60);
    }
}
