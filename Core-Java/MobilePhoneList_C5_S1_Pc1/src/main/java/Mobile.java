public class Mobile
{

    private String brandName;
    private String modelName;
    private double cost;
    private String screenSize;
    private String batteryLife;
    private String storageSpace;
    private int cameraPixels;

    //getter and setter

    //constructor

    //toString method
    
    public Mobile(String brandName, String modelName, double cost, String screenSize, String batteryLife, String storageSpace, int cameraPixels)
    {
		this.brandName = brandName;
		this.modelName = modelName;
		this.cost = cost;
		this.screenSize = screenSize;
		this.batteryLife = batteryLife;
		this.storageSpace = storageSpace;
		this.cameraPixels = cameraPixels;
	}
    public Mobile(){}
    
    public String getBrandName()
    {
		return this.brandName;
	}
	public void setBrandName(String brandName)
	{
		this.brandName = brandName;
	}
	public String getModelName()
	{
		return modelName;
	}
	public void setModelName(String modelName)
	{
		this.modelName = modelName;
	}
	public double getCost()
	{
		return this.cost;
	}
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	public String getScreenSize()
	{
		return screenSize;
	}
	public void setScreenSize(String screenSize)
	{
		this.screenSize = screenSize;
	}
	public String getBatteryLife()
	{
		return batteryLife;
	}
	public void setBatteryLife(String batteryLife)
	{
		this.batteryLife = batteryLife;
	}
	public String getStorageSpace()
	{
		return storageSpace;
	}
	public void setStorageSpace(String storageSpace)
	{
		this.storageSpace = storageSpace;
	}
	public int getCameraPixels()
	{
		return this.cameraPixels;
	}
	public void setCameraPixels(int cameraPixels)
	{
		this.cameraPixels = cameraPixels;
	}
	
	public String toString()
    {
		return "Mobile [brandName=" + brandName + ", modelName=" + modelName + ", cost=" + cost + ", screenSize="
				+ screenSize + ", batteryLife=" + batteryLife + ", storageSpace=" + storageSpace + ", cameraPixels="
				+ cameraPixels + "]";
	}
}