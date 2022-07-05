package ocp.aufgaben;

import java.io.Console;
import java.io.PrintStream;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Aufgabe2 {

    public static void main(String[] args) {
        System.out.println("============================================================");

        LocalTime termin = LocalTime.of(18, 00, 00);
        Duration waitPeriod = Duration.between(LocalTime.now(), termin);

        while (!waitPeriod.isNegative()) {


            long stunde = waitPeriod.toHours();
            long minuten = (waitPeriod = waitPeriod.minus(stunde, ChronoUnit.HOURS)).toMinutes();
            long secunden = waitPeriod.minus(minuten, ChronoUnit.MINUTES).getSeconds();

            System.out.println("stunde: " + stunde + " minuten: " + minuten + " secunden: " + secunden);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            waitPeriod = Duration.between(LocalTime.now(), termin);
        }
        // Sie haben einen Termin.
        // Es soll jede Sekunde (Thread.sleep(1000)) die Restzeit zu diesem Termin ausgegeben werden.
        System.out.println("======================= end of main() ======================");

        String.format("Mein Nachbarin heisst PETER. PETER hat 123 Schafe.  ");

    }

}
