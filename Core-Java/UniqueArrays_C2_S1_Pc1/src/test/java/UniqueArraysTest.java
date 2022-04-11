import org.junit.*;
import static org.junit.Assert.*;


public class UniqueArraysTest
{
    UniqueArrays uniqueArrayDemo = new UniqueArrays();

    @Before
    public void setUp()
    {
        uniqueArrayDemo = new UniqueArrays();
    }

    @After
    public void tearDown()
    {
        uniqueArrayDemo = null;
    }

    @Test
    public void givenIntegerArrayThenReturnTrue()
    {
    	assertTrue(uniqueArrayDemo.getUniqueArrayElement(new int[]{1,2,4,6,10,23,8}));
    	assertTrue(uniqueArrayDemo.getUniqueArrayElement(new int[]{2,4,11,30,12,10}));
    }
}