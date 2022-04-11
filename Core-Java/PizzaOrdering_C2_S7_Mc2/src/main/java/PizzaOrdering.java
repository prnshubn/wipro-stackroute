import java.util.Scanner;
import java.lang.*;

public class PizzaOrdering
{
    public static void main(String[] args)
	{
        // Make no changes to the main method
        PizzaOrdering pizzaOrdering = new PizzaOrdering();

        String name = "";
        String email = "";
        long phoneNo = 0;
        String address = "";

        // Input customer details
        Scanner sc = new Scanner(System.in);
        System.out.println("!!! Welcome !!!");
        System.out.println("!!! Enter customer details for placing an order !!!");

        System.out.println("Enter your Name");
        name = sc.next();
        System.out.println("Enter your Email");
        email = sc.next();
        System.out.println("Enter your ContactNo.");
        phoneNo = sc.nextLong();
        System.out.println("Enter your Address");
        address = sc.next();
        sc.nextLine();
        System.out.println("\n");
        System.out.println("!!! Thank you for providing your details !!!");
        System.out.println("\n");

        // Display main menu and estimate bill based on user's choice
        int totalPizzaBill = 0;
        totalPizzaBill = pizzaOrdering.displayMenuAndCalculateTotalBill(totalPizzaBill);
        System.out.println("\n");
        System.out.println("Total amount : " + totalPizzaBill);
        System.out.println("\n");

        // Estimate discount amount based on total pizza bill and calculate final bill.
        int discountAmount = pizzaOrdering.estimateDiscountAmount(totalPizzaBill);
        int billAfterDiscount = totalPizzaBill - discountAmount;
        System.out.println("\n");

        // Input the type of delivery of order and add delivery fee and tip charge to total bill
        System.out.println("Please enter 1 for Pick up and 2 for delivery");
        int delivery = sc.nextInt();
        int deliveryCharge = 0;
        int tipCharge = 0;

        if (delivery == 2)
		{
            deliveryCharge = 100;
            System.out.println("\n");
            System.out.println("Do you want to give tip to Delivery Boy (yes/no)?");
            String tip = sc.next();
            if ("yes".equals(tip))
            {
                System.out.println("Please enter tip amount :");
                tipCharge = sc.nextInt();
            }
        }

        // Estimate and display final pizza order bill
        int finalBill = pizzaOrdering.calculateFinalBillBasedOnDeliveryChargeAndTipCharge(deliveryCharge, tipCharge, billAfterDiscount);
        pizzaOrdering.displayFinalBill(name, phoneNo, totalPizzaBill, discountAmount, deliveryCharge, tipCharge, finalBill);
    }


    // Function to display main menu and call respective methods based on user's choice
    // Do not change the method
    public int displayMenuAndCalculateTotalBill(int totalPizzaBill)
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the item from the Main Menu");
        System.out.println("\n");

        int input = 0;
        do
		{
            System.out.format("%10s %30s", "Srno", "Item Category\n");
            System.out.format("%10s %30s", "1", "Pizza\n");
            System.out.format("%10s %30s", "2", "Garlic Bread\n");
            System.out.format("%10s %30s", "3", "Beverages\n");
            System.out.println();
            System.out.println("Enter your Choice of item");
            int choiceForItems = sc.nextInt();

            if (choiceForItems == 1)
			{
                System.out.println("Please enter the number of pizza you want to order :");
                int noOfPizza = sc.nextInt();
                totalPizzaBill = displayPizzaChoicesAndCalculateTotalBill(noOfPizza, totalPizzaBill);
            } // End of pizza

            else if (choiceForItems == 2)
			{
                totalPizzaBill = displayBreadChoiceAndCalculateBill(totalPizzaBill);
            }// End of breads

            else if (choiceForItems == 3)
			{
                totalPizzaBill = displayDrinksChoicesAndCalculateBill(totalPizzaBill);
            } // End of drinks

            System.out.println("\n");
            System.out.println("Your total Pizza Bill :" + totalPizzaBill);
            System.out.println("\n");
            System.out.println("Do you want to place another order enter 1 to continue or 0 to exit");
            input = sc.nextInt();

        }
		while (input == 1);
        return totalPizzaBill;
    }


    public int displayPizzaChoicesAndCalculateTotalBill(int noOfPizza, int totalPizzaBill)
	{
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < noOfPizza; i++)
		{
            // Call the method displayPizzaChoices() to display pizza choices
            displayPizzaChoices();
            // accept the choice of pizza from user
            System.out.println("Enter your pizza choice");
            int pizzaChoice = sc.nextInt();
            // accept the size of the pizza
            System.out.println("Enter Size of Pizza (L for Large, M for Medium, R for Regular) :");
            sc.nextLine();
            String pizzaSize = sc.nextLine();
            // Call the method calculateBillBasedOnPizzaChoiceAndSize(totalPizzaBill, pizzaChoice, pizzaSize)
            // to calculate total bill amount based on pizza choice and size
            totalPizzaBill = calculateBillBasedOnPizzaChoiceAndSize(totalPizzaBill, pizzaChoice, pizzaSize);
            // Accept the choice of crust from user
            System.out.println("Do you want to choose Crust of your choice (yes/no)?");
            String choiceOfCrust = sc.nextLine();
            // Call method displayCrustChoicesAndEstimatePrice(choiceOfCrust) to display the crust choice
            // and returns cost based on crust choice
            int costOfCrust = displayCrustChoicesAndEstimatePrice(choiceOfCrust);
            System.out.println("\n");
            // Accept the choice of extra toppings from user
            System.out.println("Do you want to choose extra Toppings (yes/no)?");
            String choiceOfToppings = sc.nextLine();
            // Call method displayToppingsAndEstimatePrice(choiceOfToppings) to display the choice of toppings
            // and returns the cost of the toppings based on toppings choice
            int costOfToppings = displayToppingsAndEstimatePrice(choiceOfToppings);

            // Call method calculateBillWithCrustAndToppings(totalPizzaBill, costOfCrust, costOfToppings)
            // to calculate the total cost of the pizza
            totalPizzaBill = calculateBillWithCrustAndToppings(totalPizzaBill, costOfCrust, costOfToppings);
        }
        // return the total amount
        return totalPizzaBill;
    }

    // Function displays choices of pizza
    public void displayPizzaChoices()
	{
        // Use System.out.format to display the menu in a tabular format
        System.out.format("%10s %50s %30s %30s %30s", "Srno", "Pizza", "Regular", "Medium", "Large\n");
        System.out.format("%10s %50s %30s %30s %30s", "1", "African Peri Peri Veg", "NA", "350", "450\n");
        System.out.format("%10s %50s %30s %30s %30s", "2", "Barbecue Veg", "NA", "300", "400\n");
        System.out.format("%10s %50s %30s %30s %30s", "3", "Jamaican Jerk Veg", "250", "350", "450\n");
        System.out.format("%10s %50s %30s %30s %30s", "4", "What-a-pizza Exotic", "200", "300", "400\n");
        System.out.format("%10s %50s %30s %30s %30s", "5", "English Cheddar and Veggies", "175", "375", "500\n");
    }

    // Function calculates total pizza bill based on choice of pizza and its size
    public int calculateBillBasedOnPizzaChoiceAndSize(int totalPizzaBill, int pizzaChoice, String pizzaSize)
	{
       // write logic to calculate the cost of pizza based on pizza choice and size
       // return the cost calculated
       if(pizzaChoice==1)
       {
            if(pizzaSize.equals("M"))
                totalPizzaBill+=350;
            else if(pizzaSize.equals("L"))
                totalPizzaBill+=450;
       }
       else if(pizzaChoice==2)
       {
            if(pizzaSize.equals("M"))
                totalPizzaBill+=300;
            else if(pizzaSize.equals("L"))
                totalPizzaBill+=400;
       }
       else if(pizzaChoice==3)
       {
            if(pizzaSize.equals("R"))
                totalPizzaBill+=250;
            else if(pizzaSize.equals("M"))
                totalPizzaBill+=350;
            else if(pizzaSize.equals("L"))
                totalPizzaBill+=450;
       }
       else if(pizzaChoice==4)
       {
            if(pizzaSize.equals("R"))
                totalPizzaBill+=200;
            else if(pizzaSize.equals("M"))
                totalPizzaBill+=300;
            else if(pizzaSize.equals("L"))
                totalPizzaBill+=400;
       }
       else if(pizzaChoice==5)
       {
            if(pizzaSize.equals("R"))
                totalPizzaBill+=175;
            else if(pizzaSize.equals("M"))
                totalPizzaBill+=375;
            else if(pizzaSize.equals("L"))
                totalPizzaBill+=500;
       }
        return totalPizzaBill;
    }

    // Function displays choices of crusts and calls method to estimate cost of crust
    public int displayCrustChoicesAndEstimatePrice(String choiceOfCrust)
	{
        //Call method estimatePriceOfCrust(crustChoice) to estimate the cost and return the cost
        Scanner sc=new Scanner(System.in);
        if(choiceOfCrust.equals("yes"))
        {
            System.out.format("%10s %50s %50s", "Srno", "Crust", "Price (in Rupees)\n");
            System.out.format("%10s %50s %50s", "1", "Wheat Thin Crust", "60\n");
            System.out.format("%10s %50s %50s", "2", "Fresh Pan Base", "80\n");
            System.out.format("%10s %50s %50s", "3", "Hand Tossed", "70\n");
            System.out.println();
            System.out.println("Enter your crust choice");
            int crustChoice=sc.nextInt();
            int cprice=estimatePriceOfCrust(crustChoice);
            return cprice;
        }
        return 0;
    }

    // Function estimates cost of crust based on user's choice of crust
    public int estimatePriceOfCrust(int crustChoice)
	{
        //write logic to calculate the estimated price based on choice of crust
        // return the estimated price
        int cprice=0;
        if(crustChoice==1)
            cprice=60;
        else if(crustChoice==2)
            cprice=80;
        else if(crustChoice==3)
            cprice=70;
        return cprice;
    }

    // Function displays choices of toppings ans calls method to estimate price of topping
    public int displayToppingsAndEstimatePrice(String choiceOfToppings)
	{
        // Call method estimatePriceOfToppings(int toppingsChoice) to estimate the cost and return the cost
        Scanner sc=new Scanner(System.in);
        if(choiceOfToppings.equals("yes"))
        {
            System.out.format("%10s %50s %50s", "Srno", "Toppings", "Price (in Rupees)\n");
            System.out.format("%10s %50s %50s", "1", "Extra Cheese", "80\n");
            System.out.format("%10s %50s %50s", "2", "Veg Toppings", "120\n");
            System.out.println();
            System.out.println("Enter your toppings choice");
            int toppingsChoice=sc.nextInt();
            int tprice=estimatePriceOfToppings(toppingsChoice);
            return tprice;
        }
        return 0;
    }

    // Function estimates cost of toppings based on user's choice of toppings
    public int estimatePriceOfToppings(int toppingsChoice)
	{
        //write logic to calculate the estimated price based on choice of toppings
        // return the estimated price
        int tprice=0;
        if(toppingsChoice==1)
            tprice=80;
        else if(toppingsChoice==2)
            tprice=120;
        return tprice;
    }

    // Function calculates total pizza bill by adding cost of crust and toppings
    public int calculateBillWithCrustAndToppings(int totalPizzaBill, int costOfCrust, int costOfToppings)
	{
        return totalPizzaBill+costOfCrust+costOfToppings;
    }

    // Function displays choices of bread and calls method to calculates total bill
    public int displayBreadChoiceAndCalculateBill(int totalPizzaBill)
	{
        // display the choice of breads
        // Call the method calculateBillBasedOnChoiceOfBread(breadChoice, totalPizzaBill) to calculate total cost
       // return the total bill amount
        Scanner sc=new Scanner(System.in);
        System.out.format("%10s %50s %50s", "Srno", "Bread", "Price (in Rupees)\n");
        System.out.format("%10s %50s %50s", "1", "Stuffed Garlic Bread", "90\n");
        System.out.format("%10s %50s %50s", "2", "Plain Garlic Bread Sticks", "80\n");
        System.out.println();
        System.out.println("Enter your bread choice");
        int breadChoice=sc.nextInt();
        int bprice=calculateBillBasedOnChoiceOfBread(breadChoice,totalPizzaBill);
        return bprice;
    }

    // Function estimates cost of bread based on user's choice and adds it to the total pizza bill
    public int calculateBillBasedOnChoiceOfBread(int breadChoice, int totalPizzaBill)
	{
        // write logic to calculate the cost of bread based on choice and add it to the total pizza bill amount
        // return the cost calculated
        if(breadChoice==1)
            return totalPizzaBill+90;
        else if(breadChoice==2)
            return totalPizzaBill+80;
        return totalPizzaBill;
    }

    // Function displays choices of drinks and calls method to calculates total bill
    public int displayDrinksChoicesAndCalculateBill(int totalPizzaBill)
	{
       //display the choice of drinks

        //Call the method calculateBillBasedOnDrinksChoice(drinksChoice, totalPizzaBill) to calculate total cost
        // return the cost calculated;
        Scanner sc=new Scanner(System.in);
        System.out.format("%10s %50s %50s", "Srno", "Beverage", "Price (in Rupees)\n");
        System.out.format("%10s %50s %50s", "1", "Pepsi", "60\n");
        System.out.format("%10s %50s %50s", "2", "Coke", "60\n");
        System.out.println();
        System.out.println("Enter your beverage choice");
        int drinksChoice=sc.nextInt();
        int dprice=calculateBillBasedOnDrinksChoice(drinksChoice,totalPizzaBill);
        return dprice;
    }

    // Function estimates cost of drink based on user's choice and adds it to the total pizza bill
    public int calculateBillBasedOnDrinksChoice(int drinksChoice, int totalPizzaBill)
	{
        // write logic to calculate the cost of drinks based on choice and add it to the total pizza bill amount
        // return the cost calculated
        if(drinksChoice==1 || drinksChoice==2)
            return totalPizzaBill+60;
        return totalPizzaBill;
    }

    // Function calculates discount amount based on total pizza bill
    // Do not change the method
    public int estimateDiscountAmount(int totalPizzaBill)
	{
        int discount = 0;
        int discountamount = 0;

        if (totalPizzaBill >= 500 && totalPizzaBill < 1000)
		{
            discount = 5;
            discountamount = (totalPizzaBill * discount) / 100;

        }
        else if (totalPizzaBill >= 1000 && totalPizzaBill < 1500)
		{
            discount = 10;
            discountamount = (totalPizzaBill * discount) / 100;
        }
        return discountamount;
    }

    // Function calculates final bill by adding delivery fee and tip charge to total bill
    // Do not change the method
    public int calculateFinalBillBasedOnDeliveryChargeAndTipCharge(int deliveryCharge, int tipCharge, int finalBill)
	{
        return finalBill + deliveryCharge + tipCharge;
    }

    // Function displays final bill with all necessary details to customer
    // Do not change the method
    public void displayFinalBill(String name, long phoneNo, int totalPizzaBill, int discountAmount, int deliveryCharge, int tipCharge, int finalBill)
	{
        System.out.println("--------------------------------------------------------");
        System.out.println(" !!! BILL REPORT !!!");
        System.out.println(" Customer Name     : " + name + " \n");
        System.out.println(" Contact No.       : " + phoneNo + " \n");
        System.out.println(" Total Amount      : " + totalPizzaBill + " \n");
        System.out.println(" Discount Applied  : " + "- " + discountAmount + " \n");
        System.out.println(" Delivery Fee      : " + "+ " + deliveryCharge + " \n");
        System.out.println(" Tip               : " + "+ " + tipCharge + " \n");
        System.out.println(" Total Amount      : " + finalBill + " \n");
        System.out.println("--------------------------------------------------------");
    }
}