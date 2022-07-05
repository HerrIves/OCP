package oca.aufgabe0a;

import utils.InputHelper;

import java.io.IOException;

public class Start {

  public static void main(String[] args) throws IOException {
    
    BMI myBMI = new BMI(
            InputHelper.readInt("Geben Sie, bitte, Gewicht in kg ein"),
            InputHelper.readInt("Geben Sie, bitte, Ihr Größe in cm ein")
            
    );
    
    myBMI.recomendations();
    
  }

}
