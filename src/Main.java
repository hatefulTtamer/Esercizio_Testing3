/*
Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
Formatta la data ottenendo 01 marzo 2023
Stampa sulla console
Fai attenzione a usare almeno Java 8
Crea dei test per questo esercizio
*/

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDate("2023-03-01T13:00:00Z"));
    }

    public static String getDate(String input) {
        OffsetDateTime dateTime = OffsetDateTime.parse(input);
        return dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }

}