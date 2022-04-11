import org.junit.*;
import static org.junit.Assert.*;

public class SellingPriceCalculationTest
{

	  SellingPriceCalculation sellingPriceCalculation;
	
	  @Before
	  public void init()
	  {
		  sellingPriceCalculation = new SellingPriceCalculation();
	  }
	
	  @Test
	  public void givenNameAndPriceThenReturnRevisedSellingPrice()
	  {
		  assertEquals(11.539499282836914, sellingPriceCalculation.revisedSellingPriceCalculator("Rounded Kaisa Bowl", 10.99f), 0);
		  assertNotEquals(11, sellingPriceCalculation.revisedSellingPriceCalculator("Rounded Kaisa Bowl", 10.99f));
	  }
	
	
	  @Test
	  public void givenNameAndPriceAsZeroThenReturnRevisedSellingPrice()
	  {
		  assertEquals(0, sellingPriceCalculation.revisedSellingPriceCalculator("Swirling Basket", 0), 0);
	  }
	
	
	  @Test
	  public void givenNameAndPriceAsNegativeValueThenReturnRevisedSellingPrice()
	  {
		  assertEquals(-94.5, sellingPriceCalculation.revisedSellingPriceCalculator("Fresh Air Necklace", -90), 0);
	  }
}