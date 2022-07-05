package ocp.aufgaben.aufgabe01g.date;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.TreeSet;

public class LocalDateDemo {
    public static void main(String[] args) throws InterruptedException, IOException {
        basics();
    }

    private static void basics() throws InterruptedException, IOException {
        LocalDateTime testDateTime = LocalDateTime.now();

        LocalDate date = LocalDate.of(testDateTime.getYear(), testDateTime.getMonth(), testDateTime.getDayOfMonth());
        System.out.println("date = " + date);
        System.out.println("====================================");


        String chinaFormat = testDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.CHINA));
        System.out.println(chinaFormat);
        System.out.println("====================================");

        LocalDate testLocalDate = testDateTime.toLocalDate();
        testLocalDate.isLeapYear();
        testLocalDate = testLocalDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("testLocalDate = " + testLocalDate);

        testLocalDate = testLocalDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println("====================================");

        LocalTime testTime = LocalTime.now();
        System.out.println("testTime now= " + testTime);
        testTime = testTime.plus(2, ChronoUnit.HOURS);
        System.out.println("testTime plus 2 = " + testTime);
        testTime = testTime.plus(24, ChronoUnit.HOURS);
        System.out.println("testTime plus 24= " + testTime);
        testTime = testTime.truncatedTo(ChronoUnit.HOURS);
        System.out.println("testTime trunkeced = " + testTime);

        Arrays.stream(ChronoUnit.values())
                .forEach(System.out::println);


        TreeSet<Integer> integers = new TreeSet<>();
        int i = 0;
        while (true){
            for (int j = 0; j < 10; j++) {
                System.out.println();
            }
            System.out.println("\033[2J");
            System.out.println("\033[H");
            System.out.println(i++);
            Thread.sleep(1000);
        }

    }
}
