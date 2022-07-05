package ocp.aufgaben.aufgabe05d;

public abstract class Prisma implements Form{
    private double length;
    abstract double getBaseArea();
    abstract double getBasePerimeter();

    public Prisma(double length) {
        this.length = length;
    }

    @Override
    public double getSurfaceArea() {
        return 2*getBaseArea() + getBasePerimeter() * length;
    }

    @Override
    public double getVolume() {
        return getBaseArea() * length;
    }

    public void printInfo() {
        System.out.println("length: " + length);
        System.out.println("Base Area:" + getBaseArea());
        System.out.println("Base Perimeter: " + getBasePerimeter());
        Form.super.printInfo();
    }
}
