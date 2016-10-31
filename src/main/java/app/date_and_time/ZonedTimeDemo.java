package app.date_and_time;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedTimeDemo {

    public static void main(String[] args) {
        ZoneId romeZone = ZoneId.of("Europe/London");
        LocalDateTime dateTime = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45);
        System.out.println("LocalDateTime: " + dateTime);
        ZonedDateTime zdt2 = dateTime.atZone(romeZone);
        System.out.println("ZonedDateTiem: " + zdt2);
    }
}
