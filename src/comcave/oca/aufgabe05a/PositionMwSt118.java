package oca.aufgabe05a;

public class PositionMwSt118 extends AbstractPosition{
    String name;
    private static final float mwSt = 1.18f;

    @Override
    public float getMwSt() {
        return mwSt;
    }

    public PositionMwSt118(String name, int amount, float price) {
        super(amount, price, mwSt);
        this.name = name;
    }
}
