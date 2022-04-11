import org.junit.*;
import static org.junit.Assert.*;

public class ArrayPairSumTest
{

    ArrayPairSum arrayPairSum = new ArrayPairSum();

    @Before
    public void setUp()
    {
        arrayPairSum = new ArrayPairSum();
    }

    @After
    public void tearDown()
    {
        arrayPairSum = null;
    }

    @Test
    public void givenEvenIntegerArrayThenReturnIntegerArray()
    {
        assertArrayEquals(new int[]{3,10,33,9} ,arrayPairSum.sumOfArrayPair(new int[]{1,2,4,6,10,23,1,8}) );
        assertArrayEquals(new int[]{6,22,41,22}, arrayPairSum.sumOfArrayPair(new int[]{2,4,12,10,11,30,12,10}));
    }

    @Test
    public void givenOddIntegerArrayThenReturnIntegerArray()
    {
        assertArrayEquals(new int[]{3,10,33,9,10} ,arrayPairSum.sumOfArrayPair(new int[]{1,2,4,6,10,23,1,8,10}) );
        assertArrayEquals(new int[]{6,22,41,23,19}, arrayPairSum.sumOfArrayPair(new int[]{2,4,12,10,11,30,12,11,19}));
    }
}