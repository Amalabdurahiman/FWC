import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IndexTest {
    Index i = new Index();
    @Test
    public void testseatReservation() {

        assertEquals(0, i.SeatAvailable(105));
        assertEquals(i.sr101, i.SeatAvailable(101));
        assertEquals(i.sr804, i.SeatAvailable(804));
        assertEquals(i.sr302, i.SeatAvailable(302));

    }



    @Test
    public void testaddBooking() {

        String[][] id = {
                {"953", "Kevin", "Yoga", "Sunday", "10:00", "Booked", "5","None","0"},
                {"111", "Wilbert", "Yoga", "Sunday", "10:00", "Booked", "5","None","0"},
                {"430", "Terrel", "Yoga", "Sunday", "10:00", "Booked", "5","None","0"},
                {"0", "None", "Yoga", "Sunday", "10:00", "Available", "5","None","0"},
                {"0", "None", "Yoga", "Sunday", "10:00", "Available", "5","None","0"},
        };

        Index.addSeat("Mohammed","333",id,104);
        assertEquals("Mohammed",id[3][1]);
        assertEquals("333",id[3][0]);
        assertEquals("Kevin",id[0][1]);
        assertEquals("Booked",id[3][5]);
    }

    @Test
    public void testremoveSeat() {

        int srt1=Index.sr103;
        Index.removeSeat(103);
        assertEquals(srt1-1,Index.sr103);

        int srt2=Index.sr504;
        Index.removeSeat(504);
        assertEquals(srt2-1,Index.sr504);

        int srt3=Index.sr703;
        Index.removeSeat(703);
        assertEquals(srt3-1,Index.sr703);

    }

    @Test
    public void test1searchId() {

        int[] ActualArr=Index.SearchId("12345");
        assertEquals(0,ActualArr[0]);


    }

    @Test
    public void test2searchId() {

        int[] ActualArr=Index.SearchId("664");
        assertEquals(11,ActualArr[0]);


    }

    @Test
    public void testselectBookedOption() {

        int[] Arr=new int[32];
        Index.SelectBookedOption(Arr);

    }


    @Test
    public void testcancelClass() {

        String[][] id = {
                {"953", "Ryon", "Yoga", "Sunday", "10:00AM", "Booked", "5","None","0"},
                {"111", "Wilbert", "Yoga", "Sunday", "10:00AM", "Booked", "5","None","0"},
                {"430", "Kylee", "Yoga", "Sunday", "10:00AM", "Booked", "5","None","0"},
                {"0", "None", "Yoga", "Sunday", "10:00AM", "Available", "5","None","0"},
                {"0", "None", "Yoga", "Sunday", "10:00AM", "Available", "5","None","0"},
        };

        Index.CancelClass(id,"111",11);
        assertEquals("None",id[1][1]);
        assertEquals("0",id[1][0]);
        assertEquals("Available",id[1][5]);

    }

    @Test
    public void testaddSeat() {

        int st1=Index.sr103;
        Index.addSeat(103);
        assertEquals(st1+1,Index.sr103);

        int st2=Index.sr504;
        Index.addSeat(54);
        assertEquals(st2+1,Index.sr504);

        int st3=Index.sr703;
        Index.addSeat(73);
        assertEquals(st3+1,Index.sr703);

    }
    @Test
    public void testattendClass() {

        String[][] id = {
                {"953", "Kevin", "Yoga", "Sunday", "10:00", "Booked", "5","None","0"},
                {"111", "Kylee", "Yoga", "Sunday", "10:00", "Booked", "5","None","0"},
                {"430", "Vincent", "Yoga", "Sunday", "10:00", "Booked", "5","None","0"},
                {"0", "None", "Yoga", "Sunday", "10:00AM", "Available", "5","None","0"},
                {"0", "None", "Yoga", "Sunday", "10:00AM", "Available", "5","None","0"},
        };

        ByteArrayInputStream UserIN1 = new ByteArrayInputStream("good\n4".getBytes());
        System.setIn(UserIN1);
        Index.AttendClass(id,"111");
        assertEquals("Attended",id[1][5]);
        System.setIn(System.in);

    }

    @Test
    public void testattendedFeedback() {

        String[][] id = {
                {"953", "Kevin", "Yoga", "Sunday", "10:00", "Booked", "5","None","0"},
                {"111", "Kylee", "Yoga", "Sunday", "10:00", "Booked", "5","None","0"},
                {"430", "Vincent", "Yoga", "Sunday", "10:00", "Booked", "5","None","0"},
                {"0", "None", "Yoga", "Sunday", "10:00AM", "Available", "5","None","0"},
                {"0", "None", "Yoga", "Sunday", "10:00AM", "Available", "5","None","0"},
        };

        ByteArrayInputStream UserIN1 = new ByteArrayInputStream("good\n4".getBytes());
        System.setIn(UserIN1);
        Index.AttendedFeedback(id,1);
        assertEquals("good",id[1][7]);
        assertEquals("4",id[1][8]);
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