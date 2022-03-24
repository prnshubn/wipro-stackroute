import org.junit.*;
import static org.junit.Assert.*;

public class WeightedAverageCalculationTest
{
	WeightedAverageCalculation weightedAverageCalculation;
	@Before
	public void init()
	{
		weightedAverageCalculation = new WeightedAverageCalculation();
	}

	// Test averageCalculation method by passing all the academic scores.
	@Test
	public void givenAcademicScoresThenReturnWeightedAverage()
	{
		assertEquals(79.64999389648438, weightedAverageCalculation.averageCalculation(97, 82, 60, 75, 80), 0);
		assertNotEquals(80, weightedAverageCalculation.averageCalculation(97, 82, 60, 75, 80), 0);
	}

	// Test averageCalculation method by passing some of the academic scores as 0.
	@Test
	public void givenAcademicScoresAsZeroThenReturnWeightedAverage()
	{
		assertEquals(58.69999694824219, weightedAverageCalculation.averageCalculation(0, 82, 60, 0, 80), 0);
	}

	// Test averageCalculation method by passing some of the academic scores as
	// negative values.
	@Test
	public void givenAcademicScoresAsNegativeValuesThenReturnWeightedAverage()
	{
		assertEquals(-0.25, weightedAverageCalculation.averageCalculation(97, -82, 60, -75, 80), 0);
	}
}