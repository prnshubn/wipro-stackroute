import java.util.*;
import java.io.*;

public class FlightFunctions
{
	static String[] routes = new String[10];
    public static String[] readFlightDetails()throws IOException, FileNotFoundException
	{
        try
		{
            FileReader fr = new FileReader("src/main/resources/routes.txt");
            Scanner sc = new Scanner(fr);
            int i = 0;
            while (sc.hasNextLine())
			{
                routes[i++] = sc.nextLine();
            }
            return routes;
        }
        catch (FileNotFoundException e)
		{
            e.printStackTrace();
            return routes;
        }
    }
    
    public static void displayFlightDetails(String[] routes)
	{
        for (String s : routes)
		{
            String[] sp = s.split(",");
            System.out.format("%20s %20s %20s %20s %20s", sp[0], sp[1], sp[2], sp[3], sp[4]);
            System.out.println();
        }
    }

	public static String[] showDirectFlights(String[] routes, String fromCity)
	{
		List<String> list=new ArrayList<String>();
		for (String s : routes)
		{
            String[] sp = s.split(",");
			if(sp[0].equals(fromCity))
				list.add(s);
		}
		if(list.size()==0)
		{
			String t="We are sorry. At this point of time, we do not have any information on flights originating from "+fromCity+".";
      		System.out.println(t);
      		String[] temp = null;
      		return temp;
		}
		else
		{
			System.out.format("%20s %20s %20s %20s %20s", "From", "To", "Distance", "Travel Time", "Airfare\n");
			String[] directFlights = new String[list.size()];
      		list.toArray(directFlights);
			for (String s : directFlights)
			{
            	String[] sp = s.split(",");
            	System.out.format("%20s %20s %20s %20s %20s", sp[0], sp[1], sp[2], sp[3], sp[4]);
            	System.out.println();
        	}
			return directFlights;
		}
	}

	public static void sortDirectFlights(String[] directFlights)
	{
		String[] temp=new String[directFlights.length];
		int k=0;
		for(String s:directFlights)
		{
			String[] sp=s.split(",");
			temp[k++]=sp[1];
		}
		if(k>1)
		{
			for(int i = 0; i<temp.length-1; i++)   
			{  
				for (int j = i+1; j<temp.length; j++)   
				{
					if(temp[i].compareTo(temp[j])>0)   
					{   
						String temp2=temp[i];  
						temp[i] = temp[j];  
						temp[j] = temp2;

						String temp3=directFlights[i];  
						directFlights[i] = directFlights[j];  
						directFlights[j] = temp3;
					}  
				}
			}
			System.out.format("%20s %20s %20s %20s %20s", "From", "To", "Distance", "Travel Time", "Airfare\n");
			for (String s : directFlights)
			{
            	String[] sp = s.split(",");
            	System.out.format("%20s %20s %20s %20s %20s", sp[0], sp[1], sp[2], sp[3], sp[4]);
            	System.out.println();
        	}
		}
	}
	public static void showAllConnections(String[] routes, String fromCity, String toCity)
	{
		List<String> list=new ArrayList<String>();
		for(String route:routes)
		{
			String[] sp=route.split(",");
			if(sp[0].equals(fromCity) && sp[1].equals(toCity))
				list.add(route);
			else if(sp[0].equals(fromCity))
			{
				for(String r:routes)
				{
					String[] sp2=r.split(",");
					if(sp2[0].equals(sp[1]) && sp2[1].equals(toCity))
					{
						list.add(route);
						list.add(r);
					}
				}
			}
		}
		if(list.size()==0)
			System.out.println("No flights available");
		else
		{
			System.out.format("%20s %20s %20s %20s %20s", "From", "To", "Distance", "Travel Time", "Airfare\n");
			String[] showAll = new String[list.size()];
	  		list.toArray(showAll);
	  		for (String s : showAll)
			{
	        	String[] sp = s.split(",");
	        	System.out.format("%20s %20s %20s %20s %20s", sp[0], sp[1], sp[2], sp[3], sp[4]);
	        	System.out.println();
	    	}
		}
	}
}