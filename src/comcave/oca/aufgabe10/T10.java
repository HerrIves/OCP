package oca.aufgabe10;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class T10 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        Instant then = now.plus(1, ChronoUnit.HOURS);
        Duration elapsed = Duration.between(now, then);
        System.out.printf("Duration: %s%n", elapsed);
        System.out.println("Duration in days:" + elapsed.toDays());

        then = now.plus(1, ChronoUnit.DAYS)
                .plus(1, ChronoUnit.HALF_DAYS)
                .plus(1, ChronoUnit.HOURS)
                .plus(1, ChronoUnit.MINUTES)
                .plus(1, ChronoUnit.SECONDS)
                .plusSeconds(1)
                .plusMillis(1)
                .plusNanos(1);
        System.out.println("then = " + then);
        then = now.plus(1, ChronoUnit.DAYS);
        System.out.println("then = " + then);

        LocalDate date1 = LocalDate.now();
        System.out.println("date1 = " + date1);

        LocalDate eighthOfMarch = LocalDate.of(2020, 3, 8);
        System.out.println("EighthOfMarch = " + eighthOfMarch);
        Period gap = LocalDate.now().until(eighthOfMarch);
        System.out.println("gap" + gap.get(ChronoUnit.YEARS));







    }
}
