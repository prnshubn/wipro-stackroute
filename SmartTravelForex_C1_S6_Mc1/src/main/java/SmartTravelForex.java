import java.util.Scanner;

public class SmartTravelForex
{
	static double[] currency={0.67,85.37,94.5,74.3,20.25};

    /*
     * This method converts the given amount in INR to the currency of choice
     * @param amount
     * @param choice
     * @return the exchange rate depending on choice of currency
     */
    public static double currentExchangeRates(double amount, int choice)
	{
		if(amount<0)
			return -1;
		return (amount*currency[choice-1]);
    }

    /*
     * This method converts a given source currency to the desired target currency
     * @param sourceCurrency
     * @param targetCurrency
     * @param amountToBeConverted
     * @return converted amount from a source currency to the desired target currency
     */

    public static double convertGivenCurrencyIntoDesiredCurrency(int sourceCurrency, int targetCurrency, double amountToBeConverted)
	{
		if(targetCurrency==sourceCurrency)
			return -1;
		return currentExchangeRates(amountToBeConverted,sourceCurrency)/currency[targetCurrency-1];
    }

    /**
     *  This method displays the currency conversion rates in a tabular format
     *
     */
    public static void displayForexDetails()
	{
		System.out.println("The exchanges rates for each currency (1,10,20,50,100) in INR");
		System.out.println("\t 1 \t 10 \t 20 \t 50 \t 100");
		System.out.println("JPY \t 0.67 \t 6.7 \t 13.4 \t 33.5 \t 67.0");
		System.out.println("EUR \t 85.37 \t 853.7 \t 1707.4 \t 4268.5 \t 8537.0");
		System.out.println("GBP \t 94.5 \t 945.0 \t 1890.0 \t 4725.5 \t 9450.0");
		System.out.println("USD \t 74.3 \t 743.0 \t 1486.0 \t 3715.0 \t 7430.0");
		System.out.println("AED \t 20.25 \t 202.5 \t 405.0 \t 1012.5 \t 2025.0");
    }


    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        displayForexDetails();
        int source = 0;
        int target = 0;
        double amountToBeConverted = 0;
        System.out.println("Do you wish to check conversion rates today : (y/n) ");
        char choice = sc.next().charAt(0);
        if (choice == 'y')
		{
            System.out.println("Exchange Rate of currency can be done for \n 1. JPY \n 2. EUR \n 3. GBP \n 4. USD \n 5. AED ");
            System.out.println("Enter the source currency(Currency I have) : ");
            // Accept the source currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
            source = 0;
            System.out.println("Enter the target currency(Currency I want) : ");
            // Accept the target currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
            target = 0;
            System.out.println("Enter the amount to be converted : ");
            //Accept the amount to be converted
            amountToBeConverted = 0;
            // Display the amount converted
            System.out.println("The converted exchange rate is : " + convertGivenCurrencyIntoDesiredCurrency(source, target, amountToBeConverted));
        }
		else
            System.out.println("Thanks for checking into currency convertor");
    }
}