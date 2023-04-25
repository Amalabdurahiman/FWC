import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IndexTest {
    @Test
    public void testseatReservation() {

        assertEquals(0, Index.SeatAvailable(104));
        assertEquals(Index.sr101, Index.SeatAvailable(101));
        assertEquals(Index.sr804, Index.SeatAvailable(804));
        assertEquals(Index.sr302, Index.SeatAvailable(302));

    }


    @Test
    public void testaddReservation() {

        String[][] id = {
                {"953", "Kevin", "Yoga", "Sunday", "10:00", "Booked", "5", "None", "0"},
                {"111", "Wilbert", "Yoga", "Sunday", "10:00", "Booked", "5", "None", "0"},
                {"430", "Terrel", "Yoga", "Sunday", "10:00", "Booked", "5", "None", "0"},
                {"0", "None", "Yoga", "Sunday", "10:00", "Available", "5", "None", "0"},
                {"0", "None", "Yoga", "Sunday", "10:00", "Available", "5", "None", "0"},
        };

        Index.AddReservation("Mohammed", "333", id, 104);
        assertEquals("Mohammed", id[3][1]);
        assertEquals("333", id[3][0]);
        assertEquals("Kevin", id[0][1]);
        assertEquals("Reserved", id[3][5]);
    }

    @Test
    public void testremoveSeat() {

        int srt1 = Index.sr103;
        Index.removeSeat(103);
        assertEquals(srt1 - 1, Index.sr103);

        int srt2 = Index.sr504;
        Index.removeSeat(504);
        assertEquals(srt2 - 1, Index.sr504);

        int srt3 = Index.sr703;
        Index.removeSeat(703);
        assertEquals(srt3 - 1, Index.sr703);

    }

    @Test
    public void test1searchId() {

        int[] ActualArr = Index.SearchId("12345");
        assertEquals(0, ActualArr[0]);

    }

    @Test
    public void testselectReservedOption() {

        int[] Arr = new int[32];
        Index.SelectBookedOption(Arr);

    }


    @Test
    public void testDeleteClass() {

        String[][] id = {
                {"953", "Ryon", "Yoga", "Sunday", "10:00AM", "Booked", "5", "None", "0"},
                {"111", "Wilbert", "Yoga", "Sunday", "10:00AM", "Booked", "5", "None", "0"},
                {"430", "Kylee", "Yoga", "Sunday", "10:00AM", "Booked", "5", "None", "0"},
                {"0", "None", "Yoga", "Sunday", "10:00AM", "Available", "5", "None", "0"},
                {"0", "None", "Yoga", "Sunday", "10:00AM", "Available", "5", "None", "0"},
        };

        Index.CancelClass(id, "111", 11);
        assertEquals("None", id[1][1]);
        assertEquals("0", id[1][0]);
        assertEquals("Available", id[1][5]);

    }

    @Test
    public void testaddSeat() {

        int st1 = Index.sr103;
        Index.addSeat(103);
        assertEquals(st1 + 1, Index.sr103);

        int st2 = Index.sr504;
        Index.addSeat(504);
        assertEquals(st2 + 1, Index.sr504);

        int st3 = Index.sr703;
        Index.addSeat(703);
        assertEquals(st3 + 1, Index.sr703);

    }

    @Test
    public void testattendClass() {

        String[][] id = {
                {"953", "Kevin", "Yoga", "Sunday", "10:00", "Booked", "5", "None", "0"},
                {"111", "Kylee", "Yoga", "Sunday", "10:00", "Booked", "5", "None", "0"},
                {"430", "Vincent", "Yoga", "Sunday", "10:00", "Booked", "5", "None", "0"},
                {"0", "None", "Yoga", "Sunday", "10:00AM", "Available", "5", "None", "0"},
                {"0", "None", "Yoga", "Sunday", "10:00AM", "Available", "5", "None", "0"},
        };

        ByteArrayInputStream UserIN1 = new ByteArrayInputStream("good\n4".getBytes());
        System.setIn(UserIN1);
        Index.AttendClass(id, "111");
        assertEquals("Present", id[1][5]);
        System.setIn(System.in);

    }

    @Test
    public void testattendedReview() {

        String[][] id = {
                {"953", "Kevin", "Yoga", "Sunday", "10:00", "Booked", "5", "None", "0"},
                {"111", "Kylee", "Yoga", "Sunday", "10:00", "Booked", "5", "None", "0"},
                {"430", "Vincent", "Yoga", "Sunday", "10:00", "Booked", "5", "None", "0"},
                {"0", "None", "Yoga", "Sunday", "10:00AM", "Available", "5", "None", "0"},
                {"0", "None", "Yoga", "Sunday", "10:00AM", "Available", "5", "None", "0"},
        };

        ByteArrayInputStream UserIN1 = new ByteArrayInputStream("good\n4".getBytes());
        System.setIn(UserIN1);
        Index.AttendedFeedback(id, 1);
        assertEquals("good", id[1][7]);
        assertEquals("4", id[1][8]);
        System.setIn(System.in);
    }

    @Test
    public void testmonthlyReviewSelect() {

        Index.MonthlyReviewSelect(1);
        Index.MonthlyReviewSelect(2);

    }

    @Test
    public void championReviewSelect() {

        Index.ChampionReviewSelect(1);
        Index.ChampionReviewSelect(2);

    }
}