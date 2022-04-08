import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketingOperationsTest {
    TicketingOperations ticketingOperations;
    List<TicketingData> ticketingDataList;
    private  final String fileName = "src/main/resources/sample.txt";
    @BeforeEach
    public void setUp()
	{
        ticketingOperations = new TicketingOperations();
        ticketingDataList = ticketingOperations.readTicketingData(fileName);
    }
    @AfterEach
    public void tearDown()
    {
        ticketingOperations = null;
        ticketingDataList = null;
    }
    @Test
    public void givenTicketingDataListReturnTotalAmountCollectedThroughTicket()
    {
        double actual = ticketingOperations.totalAmountCollected(ticketingDataList);
        assertEquals(10348.0,actual);
    }

    @Test
    public void givenEmptyTicketingDataListReturnZero()
    {
        List<TicketingData> data = new ArrayList<>();
        double actual = ticketingOperations.totalAmountCollected(data);
        assertEquals(0.0,actual);
    }

    @Test
    public void givenTicketingDataListReturnSortedListCheckFirstValue()
    {
        List<TicketingData> data = ticketingOperations.sortByKmsTravelled(ticketingDataList);
		assertEquals(49.5,data.get(0).getTravelledKM());
        assertEquals(49,data.size());
    }

    @Test
    public void givenEmptyTicketingDataListReturnEmptyList()
    {
        List<TicketingData> data = ticketingOperations.sortByKmsTravelled(new ArrayList<>());
        assertEquals(0,data.size());
    }
}
