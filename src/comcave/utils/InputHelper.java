package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class InputHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String readString(String message) {
        System.out.println(message);
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "sorry. we sorry";
    }

    public static int readInt(String message) {
        int int2Read = 0;

        try {
            System.out.println(message);
            int2Read = Integer.parseInt(reader.readLine());

        } catch (NumberFormatException | IOException e) {
            System.out.print("not valid number. ");
            int2Read = readInt(message);
        }
        return int2Read;
    }

    public static double doubleReader(String message) {
        double double2Read = 0;

        try {
            System.out.println(message);
            double2Read = Double.parseDouble(reader.readLine());

        } catch (NumberFormatException e) {
            System.out.print("not valid number. " + message);
            double2Read = doubleReader(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return double2Read;
    }

    public static LocalDate readDate(String message) {
        DateTimeFormatter dTFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate date;
        try {
            date = LocalDate.parse(readString(message), dTFormatter);
        } catch (DateTimeParseException e) {
            System.out.println("wrong date format");
            date = readDate(message);
        }
        return date;
    }
}
