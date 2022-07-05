package oca.aufgabe05b;

import oca.aufgabe05a.PositionMwSt118;

class Festplatte extends PositionMwSt118 {
    int size;

    public int getSize() {
        return size;
    }

    public Festplatte setSize(int size) {        this.size = size;
        return this;
    }
    public Festplatte(String name, int amount, float price) {
        super(name, amount, price);
    }

    public static Festplatte getInstance(){
        return new Festplatte("HDD", 1, 50);
    }

    public static Festplatte getInstance(int i) {
        return getInstance().setSize(i);
    }

    @Override
    public String toString() {
        return "Festplatte{" +
                "size=" + size +
                '}';
    }
}
