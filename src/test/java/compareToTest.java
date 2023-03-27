import org.junit.jupiter.api.Test;

public class compareToTest {

    @Test
    public void shouldCompare1() {
        Ticket ticket1 = new Ticket("Москва", "Владивосток", 15000, 13, 22);
        Ticket ticket2 = new Ticket("Москва", "Минск", 3000, 9, 10);
        Ticket ticket3 = new Ticket("Москва", "Новосибирск", 7000, 9, 12);

        int expected = 1;
        int actual = ticket1.compareTo(ticket2);
    }

    @Test
    public void shouldCompare2() {
        Ticket ticket1 = new Ticket("Москва", "Владивосток", 15000, 13, 22);
        Ticket ticket2 = new Ticket("Москва", "Минск", 3000, 9, 10);
        Ticket ticket3 = new Ticket("Москва", "Новосибирск", 7000, 9, 12);

        int expected = -1;
        int actual = ticket2.compareTo(ticket3);
    }
}
