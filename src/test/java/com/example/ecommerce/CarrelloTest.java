package com.example.ecommerce;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class CarrelloTest {

    // ------------------------------------------------------------------
    // Esempio 1 — verifica del costruttore
    // ------------------------------------------------------------------
    @Test
    public void testCarrelloVuotoAllaCreazione() {
        // Arrange + Act
        Carrello carrello = new Carrello();

        // Assert
        assertEquals(0, carrello.getAmount(),
                "Un carrello nuovo deve avere 0 prodotti");
    }

    // ------------------------------------------------------------------
    // Esempio 2a — insertOneProduct
    // ------------------------------------------------------------------
    @Test
    public void testInsertOneProduct() {
        Carrello c = new Carrello();

        c.insertOneProduct();
        c.insertOneProduct();
        c.insertOneProduct();

        assertEquals(3, c.getAmount(),
                "Dopo 3 insert il carrello deve contenere 3 prodotti");
    }

    // ------------------------------------------------------------------
    // Esempio 2b — removeOneProduct in condizioni normali
    // ------------------------------------------------------------------
    @Test
    public void testRemoveOneProduct() {
        Carrello c = new Carrello();
        c.insertOneProduct();
        c.insertOneProduct();

        c.removeOneProduct();

        assertEquals(1, c.getAmount(),
                "Dopo 2 insert e 1 remove il carrello deve contenere 1 prodotto");
    }

    @Test
    public void testRemoveFromEmptyCart() {
        Carrello c = new Carrello();

        c.removeOneProduct();

        assertEquals(0, c.getAmount(),
                "Il carrello non deve diventare negativo");
    }
}
