package oca.aufgabe0b;

import java.util.Scanner;

public class ZahlenSumme {
  
  
  public static void zahlenSumme(){
    Scanner sc = new Scanner(System.in);
    long summ = 0;
    int currentInt = -1;
    
    for(int i = 0; ; i++){
      summ = summ + currentInt;
      
      if ((currentInt = sc.nextInt()) == 0) {
        System.out.printf("Sie haben %d eingegeben und deren Summe ist: %d", i, summ);
        break;
      }
    }
  }

  public static void main(String[] args) {
    zahlenSumme();
  }

}
