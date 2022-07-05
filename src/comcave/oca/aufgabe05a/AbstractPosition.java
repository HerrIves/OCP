package oca.aufgabe05a;

public abstract class AbstractPosition {
    private int amount;
    private float price;
    private final float mwSt;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float getMwSt();

    public AbstractPosition(int amount, float price, float mwSt) {
        this.amount = amount;
        this.price = price;
        this.mwSt = mwSt;
    }

    @Override
    public String toString() {
        return "{" +
                "amount=" + amount +
                ", price=" + price +
                ", mwSt=" + mwSt +
                '}';
    }
}
