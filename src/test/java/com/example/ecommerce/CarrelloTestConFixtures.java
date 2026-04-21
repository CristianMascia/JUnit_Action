package com.example.ecommerce;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarrelloTestConFixtures {

    private Carrello carrello;

    @BeforeEach
    public void setUp() {
        carrello = new Carrello();
    }

    @Test
    public void testCarrelloVuotoAllaCreazione() {
        assertEquals(0, carrello.getAmount(),
                "Un carrello nuovo deve avere 0 prodotti");
    }

    @Test
    public void testInsertOneProduct() {
        carrello.insertOneProduct();
        carrello.insertOneProduct();
        carrello.insertOneProduct();

        assertEquals(3, carrello.getAmount());
    }

    @Test
    public void testRemoveOneProduct() {
        carrello.insertOneProduct();
        carrello.insertOneProduct();

        carrello.removeOneProduct();

        assertEquals(1, carrello.getAmount());
    }

    @Test
    public void testRemoveFromEmptyCart() {
        carrello.removeOneProduct();

        assertEquals(0, carrello.getAmount(),
                "Il carrello non deve diventare negativo");
    }

    @Test
    public void testInsertERemoveSiEquilibrano() {
        carrello.insertOneProduct();
        carrello.insertOneProduct();
        carrello.removeOneProduct();
        carrello.removeOneProduct();

        assertEquals(0, carrello.getAmount());
    }
}
