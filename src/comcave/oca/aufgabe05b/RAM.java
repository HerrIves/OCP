package oca.aufgabe05b;

import oca.aufgabe05a.PositionMwSt118;

class RAM extends PositionMwSt118 {
    int size;

    public int getSize() {
        return size;
    }
    public RAM setSize(int size) {
        this.size = size;
        return this;
    }

    public RAM(String name, int amount, float price) {
        super(name, amount, price);
    }

    public static RAM getInstance(){
        return new RAM("RAM", 1, 100);
    }
    public static RAM getInstance(int size){
        return getInstance().setSize(size);
    }


    @Override
    public String toString() {
        return "RAM{" +
                "size=" + size +
                super.toString()+
                '}';
    }
}
