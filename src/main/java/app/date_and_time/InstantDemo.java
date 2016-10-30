package app.date_and_time;

import java.time.Instant;

public class InstantDemo {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("Now in nanoseconds: " + instant);
        Instant inst1 = Instant.ofEpochSecond(1);
        System.out.println("ofEpochSecond(1): " + inst1);
    }
}
