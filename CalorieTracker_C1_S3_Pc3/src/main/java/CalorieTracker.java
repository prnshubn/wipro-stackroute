public class CalorieTracker
{
    //Function takes the calories burnt by the activities and the calorie intake in a day and returns the weight lost

    public int weightLostInAMonth(int cycling, int running, int swimming, int calorieIntake)
    {
        // write logic here
		int res=((cycling*2+running*2+swimming*2)-calorieIntake*7)*4;
		res=res/1000;
		if(res<0)
        	return 0;
		return res;
    }

    public static void main(String[] args)
    {
        CalorieTracker ct = new CalorieTracker();
        System.out.println("Weight lost by Anne in a month is : "+ct.weightLostInAMonth(300,200,500,2000)+" pounds");
    }
}