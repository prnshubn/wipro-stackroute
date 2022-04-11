public class MedicineTracker
{
	//The current day of week is taken in int (For Sunday 1, Monday 2, Tuesday 3....Saturday 7)
    public String predictDay(int currentDay, int noOfDaysFromToday)
    {
		String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		if(noOfDaysFromToday<0)
			noOfDaysFromToday=-1*noOfDaysFromToday;
		int n=currentDay+noOfDaysFromToday;
       	if(n<7)
			return days[n+1];
		else
			return days[n%7-1];
    }

    public static void main(String[] args)
	{
        MedicineTracker medicineTracker = new MedicineTracker();
        // Accept input of medicine taken day and the next dose to be taken in how many days
        int medicineTakenOn = 0;
        int daysToNextDose = 0;

        // call the method to predict the day the next dose must be taken
        String nextDoseToBeTakenOn = "";
        // display the day
        System.out.println("Your next dose should be taken on :  "+nextDoseToBeTakenOn);
    }
}