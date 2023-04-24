import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

class ReviewTest {

    @Test
    void testmonthlyReviewShow() {
        ByteArrayInputStream UserIN1 = new ByteArrayInputStream("1".getBytes());
        System.setIn(UserIN1);
        Review.MonthlyReviewShow();
        System.setIn(System.in);
    }

    @Test
    void testchampionReviewShow() {
        ByteArrayInputStream UserIN2 = new ByteArrayInputStream("2".getBytes());
        System.setIn(UserIN2);
        Review.MonthlyReviewShow();
        System.setIn(System.in);
    }
}