import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TicketingOperations
{
    //This method reads the sample.csv file provided and returns a List
    public List<TicketingData> readTicketingData(String fileName)
    {
    	List<TicketingData> list=new ArrayList<TicketingData>();
    	try
    	{
    		FileReader fr=new FileReader(fileName);
    		Scanner sc=new Scanner(fr);
    		sc.nextLine();
    		while(sc.hasNextLine())
    		{
    			String line=sc.nextLine();
    			String[] sp=line.split(",");
    			int ticketFromStopId=Integer.parseInt(sp[2]);
    			int ticketFromStopSeqNo=Integer.parseInt(sp[3]);
    			int ticketTillStopId=Integer.parseInt(sp[4]);
    			int ticketTillStopSeqNo=Integer.parseInt(sp[5]);
    			int totalTicketAmount=Integer.parseInt(sp[8]);
    			float travelledKM=Float.parseFloat(sp[9]);
    			TicketingData td=new TicketingData(sp[0],sp[1],ticketFromStopId,ticketFromStopSeqNo,ticketTillStopId,ticketTillStopSeqNo,sp[6],sp[7],totalTicketAmount,travelledKM);
    			list.add(td);
    		}
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
        return list;
    }
    //This method sorts the data based on the kms travelled by a bus (route)
    public List<TicketingData> sortByKmsTravelled(List<TicketingData> ticketingDataList)
    {
    	Collections.sort(ticketingDataList,new FloatComparator());
        return ticketingDataList;
    }

    //This method calculates the total revenue from ticket collection amount
    public double totalAmountCollected(List<TicketingData> ticketingDataList)
    {
    	int ans=0;
    	TicketCollection tc=(int tamt, int amt) -> tamt+amt;
    	for(TicketingData td: ticketingDataList)
    	{
    		int amt = td.getTotalTicketAmount();
    		ans=tc.totalRevenue(amt,ans);
    	}
    	return ans;
    }
    
}
class FloatComparator implements Comparator<TicketingData>
{
	public int compare(TicketingData a, TicketingData b)
	{
        if(a.getTravelledKM() == b.getTravelledKM())
			return 0;
		else if(b.getTravelledKM()>a.getTravelledKM())
			return 1;
		else
			return -1;
	}
}