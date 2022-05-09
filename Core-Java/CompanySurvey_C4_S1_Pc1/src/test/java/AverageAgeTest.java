import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class AverageAgeTest
{
private AverageAge age;
private String message = "The raw data has strings as age values";

    @BeforeEach
    void setUp()
    {
        age = new AverageAge();
    }
    @AfterEach
    void tearDown()
    {
        age = null;
    }
    @Test
    public void givenAStringArrayWithNumbersAsAgeFindAverageAgeAsResult()
    {
        assertEquals("34.25",age.averageAgeCalculator(new String[]{"35","26","32","44"}));
    }
    @Test
    public void givenAStringArrayWithStringAndNumbersFindAverageAgeAsResult()
    {
        assertEquals("java.lang.NumberFormatException: For input string: \"thirty two\"",age.averageAgeCalculator(new String[]{"35","26","thirty two","44"}));
    }
}
