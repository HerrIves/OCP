package oca.aufgabe05d;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormsTest {
    Quader quader = new Quader(4, 5, 10);

    @Test
    void testGetSurfaceArea() {
        assertEquals(220, quader.getSurfaceArea());
    }

    @Test
    void getVolume() {
        assertEquals(200, quader.getVolume());
    }

    @Test
    void getBaseArea() {
        assertEquals(20, quader.getBaseArea());
    }

    @Test
    void getBasePerimetr() {
        assertEquals(18, quader.getBasePerimeter());
    }
}