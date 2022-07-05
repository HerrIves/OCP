package oca.aufgabe0d;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Notenumrechnung {
  public static HashMap<Integer, Double> notenHashMap;
  
  static{
    notenHashMap = new HashMap<>();
    
    try {
      File tableFile = new File("table.csv");
//      File tableFile = new File("C:\\Java\\Projekte\\MyTestArea\\src\\oca.aufgabe0d\\table.csv");
      BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(tableFile)));
      
      
      while(reader.ready()){
        String[] token = reader.readLine().split(";");
        notenHashMap.put(Integer.parseInt(token[0]), Double.parseDouble(token[1]));
      }
      
    } catch (Exception ex) {
      System.err.println(ex.getCause());
    }
  
  }
  
  
  
  public static void main(String[] args) {
    System.out.println(Notenumrechnung.notenHashMap);
System.out.println("hello");
  }

}
