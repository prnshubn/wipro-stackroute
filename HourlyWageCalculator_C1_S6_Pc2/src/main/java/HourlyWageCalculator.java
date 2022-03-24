import java.util.Scanner;

public class HourlyWageCalculator
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the employee");
        String name = sc.next();

        System.out.println("Enter base pay of the employee");
        double basePay = sc.nextDouble();

        System.out.println("Enter number of hours worked by the employee");
        int hoursWorked = sc.nextInt();

        HourlyWageCalculator calculateTotalPay = new HourlyWageCalculator();
        double salary = calculateTotalPay.calculateHourlyWages(basePay, hoursWorked);

        System.out.println("Name :: " + name);
        System.out.println("Base pay :: " + basePay + "$");
        System.out.println("Hours worked :: " + hoursWorked);
        System.out.println();
        System.out.println("Salary of employee :: " + salary + "$");

    }

    // Function to calculate wage of employee by analysing base pay and hours worked by employee
    public double calculateHourlyWages(double basePay, int hoursWorked)
	{
		if(checkBasePay(basePay)==false)
			return 0.0;
		if(calculateOnHourlyBasis(hoursWorked)==false)
		{
			double result=basePay*hoursWorked;
			if(result<0)
				return 0;
			else
				return result;
		}
        if(calculateOnHourlyBasis(hoursWorked)==true && checkBasePay(basePay)==true)
		{
			double overtimepay=0.0;
			int overtime=0;
			if(hoursWorked>40)
				overtime=hoursWorked-40;
			if(overtime<=20)
				overtimepay=overtime*basePay*2;
			else
				overtimepay=overtime*basePay;
			double normalpay=(hoursWorked-overtime)*basePay;
			double total=normalpay+overtimepay;
			if(total<0)
				return 0;
			else
				return total;
		}
		return 0;
    }

    // Function to estimate if an employee has worked more than 40 hrs to get overtime pay
    public boolean calculateOnHourlyBasis(int hoursWorked)
	{
		if(hoursWorked>40 && hoursWorked<60)
        	return true;
		else
			return false;
    }

    // Function to check if base pay is more than minimum wage
    public boolean checkBasePay(double basePay)
	{
        //boolean basePayMoreThanMinimumWage = true;
        //return basePayMoreThanMinimumWage;
		if(basePay>=12)
			return true;
		return false;
    }
}