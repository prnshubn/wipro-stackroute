public class Route
{
	private String from;
	private String to;
	private int distance;
	private String travelTime;
	private String airfare;
	
	public String getFrom()
	{
		return this.from;
	}
	public void setFrom(String from)
	{
		this.from = from;
	}
	public String getTo()
	{
		return this.to;
	}
	public void setTo(String to)
	{
		this.to = to;
	}
	public int getDistance()
	{
		return this.distance;
	}
	public void setDistance(int distance)
	{
		this.distance = distance;
	}
	public String getTravelTime()
	{
		return this.travelTime;
	}
	public void setTravelTime(String travelTime)
	{
		this.travelTime = travelTime;
	}
	public String getAirfare()
	{
		return this.airfare;
	}
	public void setAirfare(String airfare)
	{
		this.airfare = airfare;
	}
	public Route(String from, String to, int distance, String travelTime, String airfare)
	{
		this.from = from;
		this.to = to;
		this.distance = distance;
		this.travelTime = travelTime;
		this.airfare = airfare;
	}
	public Route()
	{
		
	}
	
}