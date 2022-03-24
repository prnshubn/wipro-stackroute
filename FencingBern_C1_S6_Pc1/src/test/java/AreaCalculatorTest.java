import org.junit.*;
import static org.junit.Assert.*;

public class AreaCalculatorTest
{
    AreaCalculator areaCalculator;

    @Before
    public void setUp()
    {
        areaCalculator = new AreaCalculator();
    }

    @After
    public void tearDown()
    {
        areaCalculator = null;
    }

    // Test calculateAreaOfSquare method by passing positive values as input parameters
    @Test
    public void givenSideOfSquareThenCalculateArea()
    {
        assertEquals(25, areaCalculator.calculateAreaOfSquare(5), 0);
        assertEquals(38.440000000000005, areaCalculator.calculateAreaOfSquare(6.2), 0);
    }

    // Test calculateAreaOfSquare method by passing negative values as input parameters
    @Test
    public void givenSideOfSquareAsNegativeNumberThenCalculateArea()
    {
        assertEquals(25, areaCalculator.calculateAreaOfSquare(-5), 0);
        assertEquals(38.440000000000005, areaCalculator.calculateAreaOfSquare(-6.2), 0);
    }

    // Test calculateAreaOfSquare method by passing zero as input parameters
    @Test
    public void givenSideOfSquareAsZeroThenCalculateArea()
    {
        assertEquals(0, areaCalculator.calculateAreaOfSquare(0), 0);
    }

    // Test calculateAreaOfCircle method by passing positive values as input parameters
    @Test
    public void givenRadiusOfCircleThenCalculateArea()
    {
        assertEquals(28.259999999999998, areaCalculator.calculateAreaOfCircle(3), 0);
        assertEquals(271.57860000000005, areaCalculator.calculateAreaOfCircle(9.3), 0);
    }

    // Test calculateAreaOfCircle method by passing negative values as input parameters
    @Test
    public void givenRadiusOfCircleAsNegativeNumberThenCalculateArea()
    {
        assertEquals(28.259999999999998, areaCalculator.calculateAreaOfCircle(-3), 0);
        assertEquals(271.57860000000005, areaCalculator.calculateAreaOfCircle(-9.3), 0);
    }

    // Test calculateAreaOfCircle method by passing zero as input parameters
    @Test
    public void givenRadiusOfCircleAsZeroThenCalculateArea()
    {
        assertEquals(0, areaCalculator.calculateAreaOfCircle(0), 0);
    }

    // Test calculateAreaOfRectangle method by passing positive values as input parameters
    @Test
    public void givenLengthAndBreathThenCalculateArea()
    {
        assertEquals(12, areaCalculator.calculateAreaOfRectangle(3, 4), 0);
        assertEquals(17.68, areaCalculator.calculateAreaOfRectangle(3.4, 5.2), 0);
    }

    // Test calculateAreaOfRectangle method by passing negative values as input parameters
    @Test
    public void givenLengthOrBreadthAsNegativeNumberThenCalculateArea()
    {
        assertEquals(-12, areaCalculator.calculateAreaOfRectangle(3, -4), 0);
        assertEquals(-12, areaCalculator.calculateAreaOfRectangle(-3, 4), 0);
        assertEquals(12, areaCalculator.calculateAreaOfRectangle(-3, -4), 0);
    }

    // Test calculateAreaOfRectangle method by passing zero as input parameters
    @Test
    public void givenLengthOrBreadthAsZeroThenCalculateArea()
    {
        assertEquals(0, areaCalculator.calculateAreaOfRectangle(0, 5.2), 0);
        assertEquals(0, areaCalculator.calculateAreaOfRectangle(3.4, 0), 0);
        assertEquals(0, areaCalculator.calculateAreaOfRectangle(0, 0), 0);
    }
}