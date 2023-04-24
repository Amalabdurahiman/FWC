import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

class AttendTest {

    @Test
    void testAttendShow() {

            ByteArrayInputStream userInput1 = new ByteArrayInputStream("0000".getBytes());
            System.setIn(userInput1);
            Attend.AttendShow();
            System.setIn(System.in);

        }
}