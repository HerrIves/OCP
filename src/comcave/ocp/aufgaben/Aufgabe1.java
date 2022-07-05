package ocp.aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Aufgabe1 {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    // Geburtsdatum eingeben => Alter als Period ermitteln
    LocalDate geburtsdatum = null;
    try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
      String geburtsdatumString = "24.03.1983";//reader.readLine();
      geburtsdatum = LocalDate.parse(geburtsdatumString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    } catch (IOException e) { }
    // Alter in Jahren ausgeben, Monaten, Tagen, Stunden, Minuten und Sekunden ausgeben
    Period alter = geburtsdatum.until(LocalDate.now());
    int res = alter.getYears();
    System.out.println(res);


    System.out.println(alter.toTotalMonths());
    System.out.println("======================= end of main() ======================");
    
    
  }
  
}
