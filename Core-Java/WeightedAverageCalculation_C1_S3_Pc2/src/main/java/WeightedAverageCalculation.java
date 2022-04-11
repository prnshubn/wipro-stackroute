import java.util.Scanner;

public class WeightedAverageCalculation
{
	// Function accepts academic scores as input parameters and outputs the overall
	// weighted average percentage of an individual.
	// Calculate the Overall Percentage
    public float averageCalculation(int assignmentScore, int projectScore, int quizScore, int midTermScore, int finalExamScore)
	{
		float as=assignmentScore*0.1f;
		float ps=projectScore*0.35f;
		float qs=quizScore*0.1f;
		float ms=midTermScore*0.15f;
		float fs=finalExamScore*0.3f;
     	float overallPercentage = as+ps+qs+ms+fs;
      	return overallPercentage;
  	}
}