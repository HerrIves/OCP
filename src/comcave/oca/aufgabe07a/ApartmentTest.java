package oca.aufgabe07a;

import org.junit.jupiter.api.Test;

class ApartmentTest {
    static Apartment apartment = new Apartment();

    @Test
    void addZimmer() {
        apartment.addRoom(new Toilet());
        apartment.addRoom(new Toilet());
        apartment.addRoom(new Toilet());
        apartment.addRoom(new Toilet());
        apartment.addRoom(new Toilet());

    }
}