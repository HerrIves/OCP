package oca.aufgabe0d;

import java.io.IOException;

import utils.InputHelper;

public class Start {

    public static void main(String[] args) throws IOException {

        int prozentNote = InputHelper.readInt("input Ihre Note in Prozen");

        Double note = Notenumrechnung.notenHashMap.get(prozentNote);

        System.out.println(
                note == null ? "Leider nicht beschtanden" : "Ihre Note ist: " + note.doubleValue() + "Herzliche Glückwunsch"

        );


    }

}
