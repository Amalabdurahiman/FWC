import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

class ReservationTest {

    @Test
    void reservationView() {
        ByteArrayInputStream userInput1 = new ByteArrayInputStream("3".getBytes());
        System.setIn(userInput1);
        Reservation.ReservationView();
        System.setIn(System.in);
    }

    @Test
    void checkSeats() {
        Reservation.CheckSeats();
    }

    @Test
    void reserveSeat() {
        ByteArrayInputStream userInput1 = new ByteArrayInputStream("amal\n222".getBytes());
        System.setIn(userInput1);
        Reservation.ReserveSeat();
        System.setIn(System.in);
    }
}