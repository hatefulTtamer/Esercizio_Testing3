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

        System.out.println(getDate());

    }

    public static String getDate() {
        OffsetDateTime input = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        return input.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }

}