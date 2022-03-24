import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddressTest
{
    private Address addressOne;
    private Address addressTwo;

    @BeforeEach
    public void setUp()
    {
        addressOne = new Address("HSR", "Bangalore");
        addressTwo = new Address("HSR", "Bangalore");
    }

    @AfterEach
    public void tearDown()
    {
        addressOne = null;
        addressTwo = null;
    }

    @Test
    public void givenValidPropertyValuesWhenAddressObjectCreatedThenPropertiesAreSet()
    {
        assertEquals("HSR", addressOne.getArea());
        assertEquals("Bangalore", addressOne.getCity());
    }

    @Test
    public void givenTwoAddressObjectsWhenPropertyValuesAreSameThenEqualsMethodReturnsTrue()
    {
        assertTrue(addressOne.equals(addressTwo));
        assertTrue(addressTwo.equals(addressOne));
    }



    @Test
    public void givenTwoAddressObjectsWhenBothObjectsPropertyValueIsNullThenEqualsMethodReturnsTrue()
    {
        addressOne.setCity(null);
        addressTwo.setCity(null);
        assertTrue(addressOne.equals(addressTwo));
        assertTrue(addressTwo.equals(addressOne));
    }

}
