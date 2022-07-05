package oca.aufgabe05d;

public class Würfel extends Quader {
    public Würfel(double width) {
        super(width, width, width);
    }

    public static void main(String[] args) {
        new Würfel(1).printInfo();
    }
}
