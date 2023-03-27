import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class TicketTimeComparatorTest {

    @Test
    public void shouldCompareFlightTime1() {
        Ticket ticket1 = new Ticket("Москва", "Владивосток", 15000, 13, 22);
        Ticket ticket2 = new Ticket("Москва", "Минск", 3000, 9, 10);
        TicketTimeComparator timeComparator = new TicketTimeComparator();

        int expected = 1;
        int actual = timeComparator.compare(ticket1, ticket2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCompareFlightTime2() {
        Ticket ticket2 = new Ticket("Москва", "Минск", 3000, 9, 10);
        Ticket ticket3 = new Ticket("Москва", "Новосибирск", 7000, 9, 12);
        TicketTimeComparator timeComparator = new TicketTimeComparator();

        int expected = -1;
        int actual = timeComparator.compare(ticket2, ticket3);
        Assertions.assertEquals(expected, actual);
    }
}
