import org.junit.*;
import static org.junit.Assert.*;


public class MedicineTrackerTest
{

	MedicineTracker medicineTracker = new MedicineTracker();

    @Before
    public void setUp()
    {
    	medicineTracker = new MedicineTracker();
    }

    @After
    public void tearDown()
    {
    	medicineTracker = null;
    }

    @Test
    public void givenCurrentDayAndNumberOfDaysFromTodayReturnPredictedDayOfWeek()
    {
        assertEquals("Monday",medicineTracker.predictDay(2,7));
    }
    @Test
    public void givenCurrentDayAndNumberOfDaysBeforeTodayReturnPredictedDayOfWeek()
    {
        assertEquals("Monday",medicineTracker.predictDay(2,-7));
    }
}