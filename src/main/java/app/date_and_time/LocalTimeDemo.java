package app.date_and_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

public class LocalTimeDemo {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();

        LocalTime time = LocalTime.of(13, 10, 00);
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();

        // hh:mm:ss the default format of time representation
        LocalTime parsedTime = LocalTime.parse("13:20:12");
        // yyyy-MM-dd the default format of date representation
//        LocalDate parsedDate = LocalDate.parse("2016-09-10");


        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD)
                .appendLiteral(":-:")
                .appendValue(ChronoField.MONTH_OF_YEAR, 2)
                .appendLiteral(":-:")
                .appendValue(ChronoField.DAY_OF_MONTH, 2)
                .toFormatter();

        LocalDate parsedDate = LocalDate.parse("2016:-:09:-:10", formatter);
        System.out.println(parsedDate);


    }
}
