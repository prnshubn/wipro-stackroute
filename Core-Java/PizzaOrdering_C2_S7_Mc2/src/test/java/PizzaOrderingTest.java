import org.junit.*;
import static org.junit.Assert.*;

public class PizzaOrderingTest
{
    PizzaOrdering pizzaOrdering;

    @Before
    public void setUp()
	{
        pizzaOrdering = new PizzaOrdering();
    }

    @After
    public void tearDown()
	{
        pizzaOrdering = null;
    }

    /* NOTE: Write a minimum of 4 assert statements for each test case */

    @Test
    public void givenPizzaChoiceAndSizeCalculateBill()
	{
        assertEquals(450,pizzaOrdering.calculateBillBasedOnPizzaChoiceAndSize(0, 1, "L"));
        assertEquals(850,pizzaOrdering.calculateBillBasedOnPizzaChoiceAndSize(450, 2, "L"));
        assertEquals(1300,pizzaOrdering.calculateBillBasedOnPizzaChoiceAndSize(850, 3, "L"));
        assertEquals(1700,pizzaOrdering.calculateBillBasedOnPizzaChoiceAndSize(1300, 4, "L"));
    }

    @Test
    public void givenCrustChoiceEstimatePrice()
	{
        assertEquals(60,pizzaOrdering.estimatePriceOfCrust(1));
        assertEquals(80,pizzaOrdering.estimatePriceOfCrust(2));
        assertEquals(70,pizzaOrdering.estimatePriceOfCrust(3));
        assertEquals(0,pizzaOrdering.estimatePriceOfCrust(4));
    }

    @Test
    public void givenToppingsChoiceEstimatePrice()
	{
        assertEquals(80,pizzaOrdering.estimatePriceOfToppings(1));
        assertEquals(120,pizzaOrdering.estimatePriceOfToppings(2));
        assertEquals(0,pizzaOrdering.estimatePriceOfToppings(3));
        assertEquals(0,pizzaOrdering.estimatePriceOfToppings(4));
    }

    @Test
    public void givenCrustAndToppingsCostCalculateTotalBill()
	{
        assertEquals(650,pizzaOrdering.calculateBillWithCrustAndToppings(450, 80, 120));
        assertEquals(400,pizzaOrdering.calculateBillWithCrustAndToppings(400, 0, 0));
        assertEquals(700,pizzaOrdering.calculateBillWithCrustAndToppings(500, 80, 120));
        assertEquals(570,pizzaOrdering.calculateBillWithCrustAndToppings(450, 0, 120));
    }

    @Test
    public void givenBreadChoiceCalculateTotalBill()
	{
        assertEquals(440,pizzaOrdering.calculateBillBasedOnChoiceOfBread(1, 350));
        assertEquals(1280,pizzaOrdering.calculateBillBasedOnChoiceOfBread(2, 1200));
        assertEquals(590,pizzaOrdering.calculateBillBasedOnChoiceOfBread(1, 500));
        assertEquals(450,pizzaOrdering.calculateBillBasedOnChoiceOfBread(0, 450));
    }

    @Test
    public void givenDrinksChoiceCalculateTotalBill()
	{
        assertEquals(460,pizzaOrdering.calculateBillBasedOnDrinksChoice(1, 400));
        assertEquals(560,pizzaOrdering.calculateBillBasedOnDrinksChoice(2, 500));
        assertEquals(450,pizzaOrdering.calculateBillBasedOnDrinksChoice(3, 450));
        assertEquals(350,pizzaOrdering.calculateBillBasedOnDrinksChoice(0, 350));
    }

    @Test
    public void givenTotalBillEstimateDiscountAmount()
	{
    	assertEquals(0,pizzaOrdering.estimateDiscountAmount(499));
        assertEquals(25,pizzaOrdering.estimateDiscountAmount(500));
        assertEquals(100,pizzaOrdering.estimateDiscountAmount(1000));
        assertEquals(120,pizzaOrdering.estimateDiscountAmount(1200));
    }

    @Test
    public void givenDeliveryAndTipChargeCalculateFinalBill()
	{
    	assertEquals(1050,pizzaOrdering.calculateFinalBillBasedOnDeliveryChargeAndTipCharge(100, 50, 900));
    	assertEquals(900,pizzaOrdering.calculateFinalBillBasedOnDeliveryChargeAndTipCharge(0, 100, 800));
    	assertEquals(1700,pizzaOrdering.calculateFinalBillBasedOnDeliveryChargeAndTipCharge(200, 500, 1000));
    	assertEquals(1000,pizzaOrdering.calculateFinalBillBasedOnDeliveryChargeAndTipCharge(0, 0, 1000));
    }
}