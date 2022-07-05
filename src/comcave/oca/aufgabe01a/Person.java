package oca.aufgabe01a;

public class Person {
    public static int count;
    public int currrentCount = count;

    public Person() {
        count++;
    }

    public int getCurrentCount() {
        return currrentCount;
    }
}
