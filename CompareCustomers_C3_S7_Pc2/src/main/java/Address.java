public class Address
{
	private String area;
	private String city;
    public Address()
	{
        //default constructor
    }

    public Address(String area, String city)
	{
		this.area=area;
		this.city=city;
    }

    public String getArea()
	{
        return this.area;
    }

    public void setArea(String area)
	{
		this.area=area;
    }

    public String getCity()
	{
        return this.city;
    }

    public void setCity(String city)
	{
		this.city=city;
    }

    @Override
    public boolean equals(Object other)
	{
		boolean flag=true;
		if((other instanceof Address))
		{
			if(other==this)
				return true;
			if((this!=null) && (other!=null))
			{
				Address obj=(Address) other;
				if((this.city!=null) && (obj.city!=null))
					flag=(flag && this.city.equals(obj.city));
				if((this.area!=null) && (obj.area!=null))
					flag=(flag && this.area.equals(obj.area));
				return flag;
			}
			else
				return flag;
		}
		else
			return !flag;
    }
}