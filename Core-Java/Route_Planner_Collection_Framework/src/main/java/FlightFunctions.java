import java.util.*;
import java.io.*;

public class FlightFunctions
{
	static ArrayList<Route> routeInfo = new ArrayList<Route>();
    public static ArrayList<Route> readFlightDetails()throws IOException, FileNotFoundException
	{
        try
		{
            FileReader fr = new FileReader("src/main/resources/routes.txt");
            Scanner sc = new Scanner(fr);
            sc.nextLine();
            while (sc.hasNextLine())
			{
                String line=sc.nextLine();
                String[] sp=line.split(",");
                Route r=new Route(sp[0],sp[1],Integer.parseInt(sp[2]),sp[3],sp[4]);
                routeInfo.add(r);
            }
            return routeInfo;
        }
        catch (FileNotFoundException e)
		{
            e.printStackTrace();
            return routeInfo;
        }
    }
    
    public static void displayFlightDetails(ArrayList<Route> routeInfo)
	{
    	System.out.format("%20s %20s %20s %20s %20s", "From", "To", "Distance", "Travel Time", "Airfare\n");
        for (Route r : routeInfo)
		{
        	String[] sp=new String[5];
            sp[0] = r.getFrom();
            sp[1] =	r.getTo();
            int temp = r.getDistance();
            sp[2] = ""+temp;
            sp[3] = r.getTravelTime();
            sp[4] = r.getAirfare();
            System.out.format("%20s %20s %20s %20s %20s", sp[0], sp[1], sp[2], sp[3], sp[4]);
            System.out.println();
        }
    }

	public static ArrayList<Route> showDirectFlights(ArrayList<Route> routeInfo, String fromCity)
	{
		ArrayList<Route> directFlights = new ArrayList<Route>();
		for (Route r : routeInfo)
		{
			if(r.getFrom().equals(fromCity))
				directFlights.add(r);
		}
		return directFlights;
	}

	public static void sortDirectFlights(ArrayList<Route> directFlights)
	{
		Collections.sort(directFlights,new LexicographicComparator());
		System.out.format("%20s %20s %20s %20s %20s", "From", "To", "Distance", "Travel Time", "Airfare\n");
		for (Route r : directFlights)
		{
        	String[] sp=new String[5];
            sp[0] = r.getFrom();
            sp[1] =	r.getTo();
            int temp = r.getDistance();
            sp[2] = ""+temp;
            sp[3] = r.getTravelTime();
            sp[4] = r.getAirfare();
            System.out.format("%20s %20s %20s %20s %20s", sp[0], sp[1], sp[2], sp[3], sp[4]);
            System.out.println();
        }
	}
	public static void showAllConnections(ArrayList<Route> routeInfo, String fromCity, String toCity)
	{
		ArrayList<Route> list=new ArrayList<Route>();
		for(Route r:routeInfo)
		{
			if(r.getFrom().equals(fromCity) && r.getTo().equals(toCity))
				list.add(r);
			else if(r.getFrom().equals(fromCity))
			{
				for(Route r1:routeInfo)
				{
					if(r1.getFrom().equals(r.getTo()) && r1.getTo().equals(toCity))
					{
						list.add(r1);
						list.add(r);
					}
				}
			}
		}
		if(list.size()==0)
			System.out.println("Sorry, no flights available");
		else
		{
			System.out.format("%20s %20s %20s %20s %20s", "From", "To", "Distance", "Travel Time", "Airfare\n");
			for (Route r : list)
			{
	        	String[] sp=new String[5];
	            sp[0] = r.getFrom();
	            sp[1] =	r.getTo();
	            int temp = r.getDistance();
	            sp[2] = ""+temp;
	            sp[3] = r.getTravelTime();
	            sp[4] = r.getAirfare();
	            System.out.format("%20s %20s %20s %20s %20s", sp[0], sp[1], sp[2], sp[3], sp[4]);
	            System.out.println();
	    	}
		}
	}
	
	static class LexicographicComparator implements Comparator<Route>
	{
		public int compare(Route a, Route b)
		{
        	return a.getTo().compareToIgnoreCase(b.getTo());
		}
	}
}