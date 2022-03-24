import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest
{

    private Customer customerOne;
    private Customer customerTwo;
    private Address addressOne;
    private Address addressTwo;

    @BeforeEach
    public void setUp() {
        addressOne = new Address("HSR", "Bangalore");
        addressTwo = new Address("HSR", "Bangalore");
        customerOne = new Customer(101, "John", "john@stackroute.in", addressOne);
        customerTwo = new Customer(101, "John", "john@stackroute.in", addressTwo);
    }

    @AfterEach
    public void tearDown() {
        addressOne = null;
        addressTwo = null;
        customerOne = null;
        customerTwo = null;
    }

    @Test
    public void givenValidPropertyValuesWhenCustomerObjectCreatedThenPropertiesAreSet() {
        assertEquals(101, customerOne.getCustomerId());
        assertEquals("John", customerOne.getName());
        assertEquals("john@stackroute.in", customerOne.getEmail());
        assertNotNull(customerOne.getAddress());
    }

    @Test
    public void givenTwoCustomerObjectsWhenPropertyValuesAreSameThenReturnTrue() {
        assertTrue(customerOne.equals(customerTwo));
        assertTrue(customerTwo.equals(customerOne));
    }

    @Test
    public void givenTwoCustomerObjectsWhenCreatedUsingDefaultConstructorThenReturnTrue() {
        customerOne = new Customer();
        customerTwo = new Customer();
        assertTrue(customerOne.equals(customerTwo));
        assertTrue(customerTwo.equals(customerOne));
    }

    @Test
    public void givenCustomerObjectWhenComparedWithItselfThenEqualsShouldReturnTrue() {
        assertTrue(customerOne.equals(customerOne));
        assertTrue(customerTwo.equals(customerTwo));
    }


    @Test
    public void givenTwoCustomerObjectsWhenBothObjectsPropertyValueIsNullThenEqualsMethodReturnsTrue() {
        customerOne.setEmail(null);
        customerTwo.setEmail(null);

        assertTrue(customerOne.equals(customerTwo));
        assertTrue(customerTwo.equals(customerOne));
    }


}
