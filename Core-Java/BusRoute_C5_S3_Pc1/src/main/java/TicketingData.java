public class TicketingData
{
    // Declare all the attributes of the ticketing data here other than travelledKM
	private String scheduleNo;
	private String routeNo;
	private int ticketFromStopId;
	private int ticketFromStopSeqNo;
	private int ticketTillStopId;
	private int ticketTillStopSeqNo;
	private String ticketDate;
	private String ticketTime;
	private int totalTicketAmount;
	private float travelledKM;
	
	public String getScheduleNo() {
		return scheduleNo;
	}
	public void setScheduleNo(String scheduleNo) {
		this.scheduleNo = scheduleNo;
	}
	public String getRouteNo() {
		return routeNo;
	}
	public void setRouteNo(String routeNo) {
		this.routeNo = routeNo;
	}
	public int getTicketFromStopId() {
		return ticketFromStopId;
	}
	public void setTicketFromStopId(int ticketFromStopId) {
		this.ticketFromStopId = ticketFromStopId;
	}
	public int getTicketFromStopSeqNo() {
		return ticketFromStopSeqNo;
	}
	public void setTicketFromStopSeqNo(int ticketFromStopSeqNo) {
		this.ticketFromStopSeqNo = ticketFromStopSeqNo;
	}
	public int getTicketTillStopId() {
		return ticketTillStopId;
	}
	public void setTicketTillStopId(int ticketTillStopId) {
		this.ticketTillStopId = ticketTillStopId;
	}
	public int getTicketTillStopSeqNo() {
		return ticketTillStopSeqNo;
	}
	public void setTicketTillStopSeqNo(int ticketTillStopSeqNo) {
		this.ticketTillStopSeqNo = ticketTillStopSeqNo;
	}
	public String getTicketDate() {
		return ticketDate;
	}
	public void setTicketDate(String ticketDate) {
		this.ticketDate = ticketDate;
	}
	public String getTicketTime() {
		return ticketTime;
	}
	public void setTicketTime(String ticketTime) {
		this.ticketTime = ticketTime;
	}
	public int getTotalTicketAmount() {
		return totalTicketAmount;
	}
	public void setTotalTicketAmount(int totalTicketAmount) {
		this.totalTicketAmount = totalTicketAmount;
	}
	public float getTravelledKM() {
		return travelledKM;
	}
	public void setTravelledKM(float travelledKM) {
		this.travelledKM = travelledKM;
	}
	public TicketingData(String scheduleNo, String routeNo, int ticketFromStopId, int ticketFromStopSeqNo,
			int ticketTillStopId, int ticketTillStopSeqNo, String ticketDate, String ticketTime, int totalTicketAmount,
			float travelledKM)
	{
		this.scheduleNo = scheduleNo;
		this.routeNo = routeNo;
		this.ticketFromStopId = ticketFromStopId;
		this.ticketFromStopSeqNo = ticketFromStopSeqNo;
		this.ticketTillStopId = ticketTillStopId;
		this.ticketTillStopSeqNo = ticketTillStopSeqNo;
		this.ticketDate = ticketDate;
		this.ticketTime = ticketTime;
		this.totalTicketAmount = totalTicketAmount;
		this.travelledKM = travelledKM;
	}
	public TicketingData()
	{}
	@Override
	public String toString() {
		return "TicketingData [scheduleNo=" + scheduleNo + ", routeNo=" + routeNo + ", ticketFromStopId="
				+ ticketFromStopId + ", ticketFromStopSeqNo=" + ticketFromStopSeqNo + ", ticketTillStopId="
				+ ticketTillStopId + ", ticketTillStopSeqNo=" + ticketTillStopSeqNo + ", ticketDate=" + ticketDate
				+ ", ticketTime=" + ticketTime + ", totalTicketAmount=" + totalTicketAmount + ", travelledKM="
				+ travelledKM + "]";
	}
	
}
