import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void getDateTest() {
        String result = Main.getDate();
        assertEquals("1 marzo 2023", result);
    }

    @org.junit.jupiter.api.Test
    void getDateTest_2() {
        String result = Main.getDate();
        assertEquals("01/03/2023", result);
    }

    @org.junit.jupiter.api.Test
    void getDateTest_3() {
        String result = Main.getDate();
        assertEquals("1 mar 2023", result);
    }
}