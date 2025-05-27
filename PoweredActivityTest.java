

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PoweredActivityTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PoweredActivityTest
{
    /**
     * Default constructor for test class PoweredActivityTest
     */
    public PoweredActivityTest()
    {
        testGetCaloriesBurned(5, 3);
        // Expected value: 330
        // Value returned: 330
        
        testGetCaloriesBurned(3, 3);
        // Expected value: 210
        // Value returned: 210
    }

    @Test
    public double testGetCaloriesBurned(double distance, double resistance) {
        System.out.println(distance * 60 + (resistance * 10));
        return (distance * 60 + (resistance * 10));
    }
}
