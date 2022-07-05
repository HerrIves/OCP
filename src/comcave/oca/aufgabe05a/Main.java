package oca.aufgabe05a;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static final float mwSt = 1.18f;
    public static void main(String[] args) {
        List positions = new ArrayList<AbstractPosition>();
        Warenkorb myWarenkorb = new Warenkorb(positions);

        myWarenkorb.addPosition(new PositionMwSt118("Midi tower", 1, 20));
        myWarenkorb.addPosition(new PositionMwSt118("Netsteil", 1, 30));
        myWarenkorb.addPosition(new PositionMwSt118("Motherboard", 1, 30));
        myWarenkorb.addPosition(new PositionMwSt118("CPU", 1, 100));
        myWarenkorb.addPosition(new PositionMwSt118("Memory", 2, 50));
        myWarenkorb.addPosition(new PositionMwSt118("Harddrive", 2, 150));

        System.out.println(myWarenkorb.getGesamtPreis());
    }
}
