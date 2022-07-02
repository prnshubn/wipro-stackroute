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
		String[] routes=FlightFunctions.readFlightDetails();
		String[] directFlights={};
		while(true)
		{
			System.out.println("Enter your choice");
			int input=sc.nextInt();
			sc.nextLine();
			switch(input)
			{
				case 0:	
						System.exit(-1);
				case 1:
						FlightFunctions.displayFlightDetails(routes);
						break;
						
				case 2:
						System.out.println("Enter source city name");
						String fromCity1=sc.nextLine();
						directFlights=FlightFunctions.showDirectFlights(routes,fromCity1);
						break;
		
				case 3:
						if(directFlights==null)
						{
							System.out.println("Option 3 is not accessible");
							break;
						}
						FlightFunctions.sortDirectFlights(directFlights);
						break;
						
				case 4:
						System.out.println("Enter source city name");
						String fromCity2=sc.nextLine();
						System.out.println("Enter destination city name");
						String toCity=sc.nextLine();
						FlightFunctions.showAllConnections(routes,fromCity2,toCity);
						break;
				default:
						System.out.println("Wrong input");
			}
		}
	}
}