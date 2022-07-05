package oca.aufgabe01c;

import java.io.IOException;
import utils.InputHelper;

public class Start {

  public static void main(String[] args) throws IOException {
   Rectangle rechteck = new Rectangle(
           InputHelper.readInt("Input length"),
           InputHelper.readInt("Input width")
   );
   
    System.out.println("area is: " + rechteck.getRectangleArea());
    System.out.println("perimetr is: " + rechteck.getRectanglePerimetr());
  }

}
