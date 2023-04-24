import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

class ScheduleTest {

    @Test
    void testscheduleDay() {
        Scanner UserIN1 = new Scanner(new ByteArrayInputStream("15".getBytes()));
        Schedule.sc= UserIN1;
        assertEquals(801, Schedule.ScheduleDay(1));
    }

    @Test
    void testscheduleClass() {
        Scanner UserIN2 = new Scanner(new ByteArrayInputStream("6".getBytes()));
        Schedule.sc=UserIN2;
        assertEquals(602, Schedule.ScheduleClass(2));
        System.setIn(System.in);

    }
}