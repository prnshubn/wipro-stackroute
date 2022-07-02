import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String args[])throws IOException, FileNotFoundException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("-------------------- Welcome to ABC Airlines --------------------");
		System.out.println("Enter 1 to see all flight details");
		System.out.println("Enter 2 to see flights from a particular city");
		System.out.println("Enter 3 to sort flights from particular city according to destination cities");
		System.out.println("Enter 4 to see all connecting flights");
		System.out.println("Enter 0 to exit");
		ArrayList<Route> routeInfo = FlightFunctions.readFlightDetails();
		ArrayList<Route> directFlights = null;
		while(true)
		{
			System.out.println("Enter your choice");
			int input=sc.nextInt();
			sc.nextLine();
			switch(input)
			{
				case 0:	
						System.out.println("Thank You for using the application");
						System.exit(-1);
				case 1:
						FlightFunctions.displayFlightDetails(routeInfo);
						break;
						
				case 2:
						System.out.println("Enter source city name");
						String fromCity1=sc.nextLine();
						directFlights=FlightFunctions.showDirectFlights(routeInfo,fromCity1);
						if(directFlights.size()==0)
						{
							String s="We are sorry. At this point of time, we do not have any information on flights originating from "+fromCity1+".";
							System.out.println(s);
						}
						else
						{
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
						break;
		
				case 3:
						if(directFlights==null)
						{
							System.out.println("First select option 2 then option 3 is accessible");
							break;
						}
						if(directFlights.size()==0)
						{
							System.out.println("No proper source city has been selected previously");
							break;
						}
						FlightFunctions.sortDirectFlights(directFlights);
						break;
						
				case 4:
						System.out.println("Enter source city name");
						String fromCity2=sc.nextLine();
						System.out.println("Enter destination city name");
						String toCity=sc.nextLine();
						FlightFunctions.showAllConnections(routeInfo,fromCity2,toCity);
						break;
				default:
						System.out.println("Wrong input");
			}
		}
	}
}