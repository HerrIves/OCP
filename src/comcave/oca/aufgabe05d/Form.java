package oca.aufgabe05d;

public interface Form {
    double getSurfaceArea();
    double getVolume();

    default void printInfo() {
        System.out.println("Surface area:" + getSurfaceArea());
        System.out.println("Volume: " + getVolume());
    }
}

