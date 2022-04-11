import org.junit.*;
import static org.junit.Assert.*;

public class CalorieTrackerTest
{
    CalorieTracker ct;
    
    @Before
    public void setUp()
    {
        ct = new CalorieTracker();
    }
    
    @After
    public void tearDown()
    {
        ct = null;
    }

	@Test
    public void givenActivitiesReturnWeightLostInAMonth()
    {
        assertEquals(5.0, ct.weightLostInAMonth(300,200,500,100), 0);
    }

    @Test
    public void givenNegativeValuesReturnWeightLostInAMonth()
    {
        assertEquals(0 ,ct.weightLostInAMonth(-100,-100,-100, 100), 0);
    }
}