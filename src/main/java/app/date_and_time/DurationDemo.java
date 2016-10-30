package app.date_and_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class DurationDemo {
    public static void main(String[] args) {
        LocalTime startDate = LocalTime.of(5, 8, 10);
        LocalTime endDate = LocalTime.of(22, 15, 18);

        Duration duration = Duration.between(startDate, endDate);
//
//        System.out.println(duration.get(ChronoUnit.DAYS));

        Period tenDays = Period.between(LocalDate.of(2014, 3, 8),
                LocalDate.of(2014, 3, 18));

        System.out.println("Period days: " + tenDays.getDays());
        System.out.println("Period months: " + tenDays.getMonths());

        Duration twelveDays = Duration.ofDays(12);
        Duration twoWeeks = Duration.of(2, ChronoUnit.SECONDS);



    }
}
