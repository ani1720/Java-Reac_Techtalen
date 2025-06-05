package com.ejercicio;

import com.ejercicio.Geometria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GeometriaTest {

    Geometria geo = new Geometria();

    @Test
    void testAreacuadrado() {
        assertEquals(16, geo.areacuadrado(4));
    }

    @Test
    void testAreaCirculo() {
        double expected = 3.1416 * 5 * 5;
        assertEquals(expected, geo.areaCirculo(5), 0.0001);
    }

    @Test
    void testAreatriangulo() {
        assertEquals(10, geo.areatriangulo(4, 5));
    }

    @Test
    void testArearectangulo() {
        assertEquals(20, geo.arearectangulo(4, 5));
    }

    @Test
    void testAreapentagono() {
        assertEquals(30, geo.areapentagono(6, 10));
    }
}
