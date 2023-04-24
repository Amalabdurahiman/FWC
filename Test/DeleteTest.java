import java.io.ByteArrayInputStream;

class DeleteTest {

    @org.junit.jupiter.api.Test
    void test1DeleteShow() {

        ByteArrayInputStream UserIN1 = new ByteArrayInputStream("222\n1\n2".getBytes());
        System.setIn(UserIN1);
        Delete.DeleteShow();
        System.setIn(System.in);

    }
    @org.junit.jupiter.api.Test
    void test2DeleteShow() {

        ByteArrayInputStream userInput1 = new ByteArrayInputStream("4444".getBytes());
        System.setIn(userInput1);
        Delete.DeleteShow();
        System.setIn(System.in);
    }
}