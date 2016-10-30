package app.date_and_time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2016,11,01);
        System.out.println(localDate);


        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();

        System.out.println("Year: " + year + "\nMonth: " + month + "\nDay: " + day);

        System.out.println(now);

        now.getDayOfMonth(); // 30
        now.getDayOfWeek(); // Sunday
        now.getDayOfYear(); // 304
        now.isLeapYear(); // false
        now.lengthOfMonth(); // 31
        now.lengthOfYear(); // 366


        now.get(ChronoField.DAY_OF_YEAR); // 366
        now.get(ChronoField.YEAR);
        now.get(ChronoField.DAY_OF_MONTH);
        now.get(ChronoField.DAY_OF_WEEK);


    }
}
