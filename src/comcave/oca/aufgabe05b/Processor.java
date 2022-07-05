package oca.aufgabe05b;

import oca.aufgabe05a.PositionMwSt118;

class Processor extends PositionMwSt118 {
    int geschwindigkeit;

    public int getGeschwindigkeit() {        return geschwindigkeit;    }
    public Processor setGeschwindigkeit(int geschwindigkeit) {        this.geschwindigkeit = geschwindigkeit;
        return this;
    }

    public Processor(String name, int amount, float price) {
        super(name, amount, price);
    }

    public static Processor getInstance(){
        return new Processor("Prozessor", 1, 100);
    }

    public static Processor getInstance(int geschwindigkeit){
        return getInstance().setGeschwindigkeit(geschwindigkeit);
    }

    @Override
    public String toString() {
        return "Processor{" +
                "geschwindigkeit=" + geschwindigkeit +
                '}';
    }
}
