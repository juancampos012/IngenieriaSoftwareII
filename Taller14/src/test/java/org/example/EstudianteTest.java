package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EstudianteTest {
    private static Estudiante estudiante;

    @BeforeAll
    public static void setup() {
        estudiante = new Estudiante("Juan", 20);
    }

    @AfterAll
    public static void tearDown() {
        estudiante = null;
    }

    @Test
    public void agregarCalificacionTest() {
        estudiante.agregarCalificacion(8.5);
        assertEquals(1, estudiante.getNumeroCalificaciones());
    }

    @Test
    public void obtenerPromedioTest() {
        estudiante.agregarCalificacion(7.0);
        estudiante.agregarCalificacion(9.0);
        double promedioEsperado = (8.5 + 7.0 + 9.0) / 3;
        assertEquals(promedioEsperado, estudiante.obtenerPromedio(), 0.01);
    }

    @Test
    public void getNumeroCalificacionesTest() {
        assertEquals(3, estudiante.getNumeroCalificaciones());
    }

    @Test
    public void agregarCalificacionExcepcionTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            estudiante.agregarCalificacion(11);
        });
        assertEquals("La calificación debe estar entre 0 y 10.", exception.getMessage());
    }
}