public class AverageAge
{
    //This function calculates the average age, takes as input the raw data array
    // handle the exception appropriately
    public String averageAgeCalculator(String[] ageRawData)throws NumberFormatException
    {
		int n=0;
		double sum=0;
       	for(int i=0;i<ageRawData.length;i++)
	   	{
		   try
		   {
		   		n=Integer.parseInt(ageRawData[i]);
		   }
		   catch(NumberFormatException e)
		   {
			   return ("java.lang.NumberFormatException: For input string: \""+ageRawData[i]+"\"");
		   }
		   sum=sum+n;
	   }
	   double avg=sum/ageRawData.length;
	   	String s=avg+"";
	   	return s;
    }
}