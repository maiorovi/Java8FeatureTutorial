package app.date_and_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersDemo {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2016,8,14);
        date.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));


        LocalDate friday = LocalDate.of(2016, 10, 28);
        LocalDate saturday = LocalDate.of(2016, 10, 29);
        LocalDate monday = LocalDate.of(2016, 10, 24);

        System.out.println(friday.with(nextWorkingDay()));
        System.out.println(saturday.with(nextWorkingDay()));
        System.out.println(monday.with(nextWorkingDay()));
    }

    public static TemporalAdjuster nextWorkingDay() {
        return  temporal -> {
            DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
            int daysToAdd = 1;
            if (dayOfWeek == DayOfWeek.FRIDAY) daysToAdd = 3;
            else if (dayOfWeek == DayOfWeek.SATURDAY) daysToAdd = 2;

         return temporal.plus(daysToAdd, ChronoUnit.DAYS);
        };
    }

}
