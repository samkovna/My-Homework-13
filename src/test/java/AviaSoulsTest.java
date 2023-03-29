import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AviaSoulsTest {

    @Test
    public void shouldSearchAndSortAscendingPriceSomeTickets() {
        Ticket ticket1 = new Ticket("Москва", "Владивосток", 15_000, 13, 22);
        Ticket ticket2 = new Ticket("Москва", "Минск", 3_000, 9, 10);
        Ticket ticket3 = new Ticket("Москва", "Новосибирск", 7_000, 9, 12);
        Ticket ticket4 = new Ticket("Москва", "Владивосток", 20_000, 6, 15);
        Ticket ticket5 = new Ticket("Москва", "Владивосток", 45_000, 1, 10);
        Ticket ticket6 = new Ticket("Москва", "Владивосток", 10_000, 17, 2);
        Ticket ticket7 = new Ticket("Москва", "Владивосток", 17_000, 10, 19);

        AviaSouls repo = new AviaSouls();
        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);
        repo.add(ticket6);
        repo.add(ticket7);

        Ticket[] expected = {ticket6, ticket1, ticket7, ticket4, ticket5};
        Ticket[] actual = repo.search("Москва", "Владивосток");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchAndSortAscendingPriceOneTicket() {
        Ticket ticket1 = new Ticket("Москва", "Владивосток", 15_000, 13, 22);
        Ticket ticket2 = new Ticket("Москва", "Минск", 3_000, 9, 10);
        Ticket ticket3 = new Ticket("Москва", "Новосибирск", 7_000, 9, 12);
        Ticket ticket4 = new Ticket("Москва", "Владивосток", 20_000, 6, 15);
        Ticket ticket5 = new Ticket("Москва", "Владивосток", 45_000, 1, 10);
        Ticket ticket6 = new Ticket("Москва", "Владивосток", 10_000, 17, 2);
        Ticket ticket7 = new Ticket("Москва", "Владивосток", 17_000, 10, 19);

        AviaSouls repo = new AviaSouls();
        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);
        repo.add(ticket6);
        repo.add(ticket7);

        Ticket[] expected = {ticket2};
        Ticket[] actual = repo.search("Москва", "Минск");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchAndSortAscendingPriceNoTicket() {
        Ticket ticket1 = new Ticket("Москва", "Владивосток", 15_000, 13, 22);
        Ticket ticket2 = new Ticket("Москва", "Минск", 3_000, 9, 10);
        Ticket ticket3 = new Ticket("Москва", "Новосибирск", 7_000, 9, 12);
        Ticket ticket4 = new Ticket("Москва", "Владивосток", 20_000, 6, 15);
        Ticket ticket5 = new Ticket("Москва", "Владивосток", 45_000, 1, 10);
        Ticket ticket6 = new Ticket("Москва", "Владивосток", 10_000, 17, 2);
        Ticket ticket7 = new Ticket("Москва", "Владивосток", 17_000, 10, 19);

        AviaSouls repo = new AviaSouls();
        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);
        repo.add(ticket6);
        repo.add(ticket7);

        Ticket[] expected = {};
        Ticket[] actual = repo.search("Москва", "Сочи");
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldSearchAndSortAscendingTimeSomeTickets() {
        Ticket ticket1 = new Ticket("Москва", "Владивосток", 15_000, 13, 22); //9
        Ticket ticket2 = new Ticket("Москва", "Минск", 3_000, 9, 10);
        Ticket ticket3 = new Ticket("Москва", "Новосибирск", 7_000, 9, 12);
        Ticket ticket4 = new Ticket("Москва", "Владивосток", 20_000, 6, 14); //8
        Ticket ticket5 = new Ticket("Москва", "Владивосток", 45_000, 1, 20); //19
        Ticket ticket6 = new Ticket("Москва", "Владивосток", 10_000, 12, 23); //11
        Ticket ticket7 = new Ticket("Москва", "Владивосток", 17_000, 9, 24); //15

        AviaSouls repo = new AviaSouls();
        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);
        repo.add(ticket6);
        repo.add(ticket7);

        Ticket[] expected = {ticket4, ticket1, ticket6, ticket7, ticket5};
        Ticket[] actual = repo.searchAndSortBy("Москва", "Владивосток", new TicketTimeComparator());
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchAndSortAscendingTimeOneTicket() {
        Ticket ticket1 = new Ticket("Москва", "Владивосток", 15_000, 13, 22);
        Ticket ticket2 = new Ticket("Москва", "Минск", 3_000, 9, 10);
        Ticket ticket3 = new Ticket("Москва", "Новосибирск", 7_000, 9, 12);
        Ticket ticket4 = new Ticket("Москва", "Владивосток", 20_000, 6, 14);
        Ticket ticket5 = new Ticket("Москва", "Владивосток", 45_000, 1, 20);
        Ticket ticket6 = new Ticket("Москва", "Владивосток", 10_000, 12, 23);
        Ticket ticket7 = new Ticket("Москва", "Владивосток", 17_000, 9, 24);

        AviaSouls repo = new AviaSouls();
        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);
        repo.add(ticket6);
        repo.add(ticket7);

        Ticket[] expected = {ticket2};
        Ticket[] actual = repo.searchAndSortBy("Москва", "Минск", new TicketTimeComparator());
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchAndSortAscendingTimeNoTicket() {
        Ticket ticket1 = new Ticket("Москва", "Владивосток", 15_000, 13, 22);
        Ticket ticket2 = new Ticket("Москва", "Минск", 3_000, 9, 10);
        Ticket ticket3 = new Ticket("Москва", "Новосибирск", 7_000, 9, 12);
        Ticket ticket4 = new Ticket("Москва", "Владивосток", 20_000, 6, 14);
        Ticket ticket5 = new Ticket("Москва", "Владивосток", 45_000, 1, 20);
        Ticket ticket6 = new Ticket("Москва", "Владивосток", 10_000, 12, 23);
        Ticket ticket7 = new Ticket("Москва", "Владивосток", 17_000, 9, 24);

        AviaSouls repo = new AviaSouls();
        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);
        repo.add(ticket6);
        repo.add(ticket7);

        Ticket[] expected = {};
        Ticket[] actual = repo.searchAndSortBy("Москва", "Сочи", new TicketTimeComparator());
        Assertions.assertArrayEquals(expected, actual);
    }
}
