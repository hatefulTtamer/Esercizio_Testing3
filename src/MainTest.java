import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void getDate_Test() {
        OffsetDateTime input = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String result = input.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        assertEquals("1 marzo 2023", result);
    }

    @org.junit.jupiter.api.Test
    void getDate_Test2() {
        OffsetDateTime input = OffsetDateTime.parse("2020-08-15T13:00:00Z");
        String result = input.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        assertEquals("15 agosto 2020", result);
    }

    @org.junit.jupiter.api.Test
    void getDate_Test3() {
        OffsetDateTime input = OffsetDateTime.parse("1986-04-22T13:00:00Z");
        String result = input.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        assertEquals("22 aprile 1986", result);
    }
}