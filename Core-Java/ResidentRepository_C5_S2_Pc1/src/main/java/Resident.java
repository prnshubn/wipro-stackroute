public class Resident
{

    //declare the variables
    private String fullName;
	private int socialSecurityNumber;
	private char gender;

	public String getFullName()
	{
		return this.fullName;
	}
	public void setFullName(String fullName)
	{
		this.fullName=fullName;
	}
	public int getSocialSecurityNumber()
	{
		return this.socialSecurityNumber;
	}
	public void setSocialSecurityNumber(int socialSecurityNumber)
	{
		this.socialSecurityNumber=socialSecurityNumber;
	}
	public char getGender()
	{
		return this.gender;
	}
	public void setGender(char gender)
	{
		this.gender=gender;
	}


    //getter setter

    //constructor
    public Resident(String fullName, int socialSecurityNumber, char gender)
	{
		this.fullName=fullName;
		this.socialSecurityNumber=socialSecurityNumber;
		this.gender=gender;
    }
	public Resident()
	{}

    //override toString method
	@Override
	public String toString()
	{
		return "Resident [fullName=" + fullName + ", socialSecurityNumber=" + socialSecurityNumber + ", gender="
				+ gender + "]";
	}
}
