import org.junit.*;
import static org.junit.Assert.*;

public class HourlyWageCalculatorTest
{

	HourlyWageCalculator calculateTotalPay;

    @Before
    public void init()
    {
        calculateTotalPay = new HourlyWageCalculator();
    }

    // Test calculateOnHourlyBasis method by passing positive values as hours worked
    @Test
    public void givenHoursWorkedEstimateOvertime()
    {
        assertTrue(calculateTotalPay.calculateOnHourlyBasis(50));
        assertFalse(calculateTotalPay.calculateOnHourlyBasis(40));
        assertFalse(calculateTotalPay.calculateOnHourlyBasis(60));
        assertFalse(calculateTotalPay.calculateOnHourlyBasis(73));
        assertFalse(calculateTotalPay.calculateOnHourlyBasis(25));
    }

    // Test calculateOnHourlyBasis method by passing negative value and zero as hours worked
    @Test
    public void givenHoursWorkedAsNegativeValueOrZeroEstimateOvertime()
    {
        assertFalse(calculateTotalPay.calculateOnHourlyBasis(0));
        assertFalse(calculateTotalPay.calculateOnHourlyBasis(-45));
    }

    // Test checkBasePay method by passing positive values as base pay
    @Test
    public void givenBasePayEstimateIfItsMoreThanMinimumWage()
    {
        assertFalse(calculateTotalPay.checkBasePay(11));
        assertTrue(calculateTotalPay.checkBasePay(80));
    }

    // Test checkBasePay method by passing negative value or zero as base pay
    @Test
    public void givenBasePayAsNegativeValueOrZeroEstimateIfItsMoreThanMinimumWage()
    {
        assertFalse(calculateTotalPay.checkBasePay(0));
        assertFalse(calculateTotalPay.checkBasePay(-17));
    }

    // Test calculateHourlyWages method by passing positive values as base pay and hours worked
    @Test
    public void givenBasePayAndHoursWorkedEstimateSalary()
    {
        assertEquals(0, calculateTotalPay.calculateHourlyWages(7.50, 35), 0);
        assertEquals(0, calculateTotalPay.calculateHourlyWages(8.20, 47), 0);
        assertEquals(876, calculateTotalPay.calculateHourlyWages(12.00, 73), 0);
        assertEquals(525, calculateTotalPay.calculateHourlyWages(15.00, 35), 0);
        assertEquals(982.8, calculateTotalPay.calculateHourlyWages(18.20, 47), 0);
    }

    // Test calculateHourlyWages method by passing negative values and zero as base pay and hours worked
    @Test
    public void givenBasePayOrHoursWorkedAsNegativeOrZeroEstimateSalary()
    {
        assertEquals(0, calculateTotalPay.calculateHourlyWages(15.00, 0), 0);
        assertEquals(0, calculateTotalPay.calculateHourlyWages(0, 45), 0);
        assertEquals(0, calculateTotalPay.calculateHourlyWages(0, 0), 0);
        assertEquals(0, calculateTotalPay.calculateHourlyWages(-15.00, 35), 0);
        assertEquals(0, calculateTotalPay.calculateHourlyWages(18.20, -47), 0);
        assertEquals(0, calculateTotalPay.calculateHourlyWages(-12.00, -73), 0);
    }
}