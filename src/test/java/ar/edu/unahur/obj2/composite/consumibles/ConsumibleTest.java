package ar.edu.unahur.obj2.composite.consumibles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.composite.consumibles.Bebible.Cafe;
import ar.edu.unahur.obj2.composite.consumibles.Bebible.JugoDeNaranja;
import ar.edu.unahur.obj2.composite.consumibles.Comestible.Medialuna;
import ar.edu.unahur.obj2.composite.consumibles.Comestible.TipoMedialuna;
import ar.edu.unahur.obj2.composite.consumibles.Comestible.TipoTostado;
import ar.edu.unahur.obj2.composite.consumibles.Comestible.Tostado;

public class ConsumibleTest {
    @Test
    public void PruebaBasica() {
        Cafe cafeConLeche = new Cafe("Cafe con leche", 20.0,
                200, true);
        assertTrue(cafeConLeche.costo().equals(120.0));

        JugoDeNaranja jugoDeNaranja = new JugoDeNaranja("Jugo facha ", 300.0, 200);
        assertTrue(jugoDeNaranja.costo().equals(500.0));

        Tostado tostado = new Tostado("Tostado", 300.0, 100, TipoTostado.Salame_y_Queso);
        assertTrue(tostado.costo().equals(250.0));

        Medialuna medialuna = new Medialuna("Medialuna", 10.0, 300, TipoMedialuna.De_DulceDeLecha);
        assertTrue(medialuna.costo().equals(350.0));

        Combo combo = new Combo("Combo", 500);
        combo.Agregar(cafeConLeche);
        combo.Agregar(jugoDeNaranja);
        combo.Agregar(tostado);
        combo.Agregar(medialuna);
        assertEquals(1220.0, combo.costo());
    }

}
