import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

class ReservationTest {

    @Test
    void testreservationView() {
        ByteArrayInputStream userInput1 = new ByteArrayInputStream("3".getBytes());
        System.setIn(userInput1);
        Reservation.ReservationView();
        System.setIn(System.in);
    }

    @Test
    void testcheckSeats() {
        Reservation.CheckSeats();
    }

    @Test
    void testreserveSeat() {
        ByteArrayInputStream userInput1 = new ByteArrayInputStream("amal\n222".getBytes());
        System.setIn(userInput1);
        Reservation.ReserveSeat();
        System.setIn(System.in);
    }
}