package app.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;

public class PrintingAndParsing {
    public static void main(String[] args) {
        //parsing and formatting is all around DateTimeFormatter
        LocalDate date = LocalDate.of(2016, 10, 31);

        Arrays.asList(
                date.format(DateTimeFormatter.BASIC_ISO_DATE),
                date.format(DateTimeFormatter.ISO_DATE),
                date.format(DateTimeFormatter.ISO_WEEK_DATE)
        ).forEach(System.out::println);

        //formatter from a pattern

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(date.format(formatter));


        // some parsing
        LocalDate parsedDate = LocalDate.parse("2014/05/23", formatter);

        //Creating a localized DateTimeFormatter

        DateTimeFormatter localizedFormatter = DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.FRENCH);
        System.out.println(date.format(localizedFormatter));
    }
}
