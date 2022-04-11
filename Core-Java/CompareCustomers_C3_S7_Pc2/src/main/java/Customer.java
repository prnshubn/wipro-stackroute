public class Customer
{
	private int customerId;
	private String name,email;
	private Address address;
    public Customer()
	{
        //default Constructor
    }

    public Customer(int customerId, String name, String email, Address address)
	{
		this.customerId=customerId;
		this.name=name;
		this.email=email;
		this.address=address;
    }

    @Override
    public boolean equals(Object other)
	{
		boolean flag=false;
		if((other instanceof Customer))
		{
			if(other==this)
				return true;
			if(this==null && other==null)
				return true;
			if(other==null)
				return false;
			Customer obj=(Customer) other;
			if(other.equals(null) && obj.equals(null))
				return true;
			flag=(this.customerId==obj.customerId);
			if((this.name!=null) && (obj.name!=null))
				flag=(flag && this.name.equals(obj.name));
			if((this.email!=null) && (obj.email!=null))
				flag=(flag && this.email.equals(obj.email));
			if((this.address!=null) && (obj.address!=null))
				flag=(flag && this.address.equals(obj.address));
			return flag;
		}
		return flag;
    }

    public int getCustomerId()
	{
        return this.customerId;
    }

    public void setCustomerId(int customerId)
	{
		this.customerId=customerId;
    }

    public String getName()
	{
        return this.name;
    }

    public void setName(String name)
	{
		this.name=name;
    }

    public String getEmail()
	{
        return this.email;
    }

    public void setEmail(String email)
	{
		this.email=email;
    }

    public Address getAddress()
	{
        return this.address;
    }

    public void setAddress(Address address)
	{
		this.address=address;
    }
}
