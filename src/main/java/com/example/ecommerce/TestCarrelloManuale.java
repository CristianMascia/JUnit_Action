package com.example.ecommerce;

public class TestCarrelloManuale {

    public static void main(String[] args) {
        int passati = 0;
        int falliti = 0;

        // ------------------------------------------------------------------
        // Test 1: un carrello appena creato contiene 0 prodotti
        // ------------------------------------------------------------------
        Carrello c1 = new Carrello();
        if (c1.getAmount() == 0) {
            System.out.println("T1 OK  - carrello nuovo ha 0 prodotti");
            passati++;
        } else {
            System.out.println("T1 FAIL - atteso 0, trovato " + c1.getAmount());
            falliti++;
        }

        // ------------------------------------------------------------------
        // Test 2: dopo un insertOneProduct, amount vale 1
        // ------------------------------------------------------------------
        Carrello c2 = new Carrello();
        c2.insertOneProduct();
        if (c2.getAmount() == 1) {
            System.out.println("T2 OK  - insertOneProduct incrementa di 1");
            passati++;
        } else {
            System.out.println("T2 FAIL - atteso 1, trovato " + c2.getAmount());
            falliti++;
        }

        // ------------------------------------------------------------------
        // Test 3: tre insert consecutivi portano amount a 3
        // ------------------------------------------------------------------
        Carrello c3 = new Carrello();
        c3.insertOneProduct();
        c3.insertOneProduct();
        c3.insertOneProduct();
        if (c3.getAmount() == 3) {
            System.out.println("T3 OK  - 3 insert consecutivi");
            passati++;
        } else {
            System.out.println("T3 FAIL - atteso 3, trovato " + c3.getAmount());
            falliti++;
        }

        // ------------------------------------------------------------------
        // Test 4: aggiunto uno, rimosso uno, il carrello torna vuoto
        // ------------------------------------------------------------------
        Carrello c4 = new Carrello();
        c4.insertOneProduct();
        c4.removeOneProduct();
        if (c4.getAmount() == 0) {
            System.out.println("T4 OK  - insert + remove = 0");
            passati++;
        } else {
            System.out.println("T4 FAIL - atteso 0, trovato " + c4.getAmount());
            falliti++;
        }

        // ------------------------------------------------------------------
        // Test 5: rimozione da un carrello vuoto NON deve portare
        // l'amount in negativo
        // ------------------------------------------------------------------
        Carrello c5 = new Carrello();
        c5.removeOneProduct();
        if (c5.getAmount() == 0) {
            System.out.println("T5 OK  - remove da vuoto resta a 0");
            passati++;
        } else {
            System.out.println("T5 FAIL - atteso 0, trovato " + c5.getAmount()
                    + "  (il carrello non dovrebbe andare sotto zero)");
            falliti++;
        }

        // ------------------------------------------------------------------
        // Riepilogo finale
        // ------------------------------------------------------------------
        System.out.println();
        System.out.println("============================================");
        System.out.println("Totale test: " + (passati + falliti)
                + "   passati: " + passati
                + "   falliti: " + falliti);
        System.out.println("============================================");
    }
}
