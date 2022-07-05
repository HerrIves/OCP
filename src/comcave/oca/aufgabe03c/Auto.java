package oca.aufgabe03c;

import oca.aufgabe03c.types.ANTRIB;
import oca.aufgabe03c.types.FUEL;
import oca.aufgabe03c.types.Farbe;
import oca.aufgabe03c.types.GETRIBE;

public class Auto {
    Farbe farbe;
    GETRIBE getribe;
    ANTRIB antrib;
    FUEL fuel;
    int cylinders;
    int volume;

    public Auto(Farbe farbe, GETRIBE getribe, ANTRIB antrib, FUEL fuel, int cylinders, int volume) {
        this.farbe = farbe;
        this.getribe = getribe;
        this.antrib = antrib;
        this.fuel = fuel;
        this.cylinders = cylinders;
        this.volume = volume;
    }

    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "farbe=" + farbe +
                ", getribe=" + getribe +
                ", antrib=" + antrib +
                ", fuel=" + fuel +
                ", cylinders=" + cylinders +
                ", volume=" + volume +
                '}';
    }
}
