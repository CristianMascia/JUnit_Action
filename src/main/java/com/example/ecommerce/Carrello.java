package com.example.ecommerce;

public class Carrello {

    private int amount;

    public Carrello() {
        this.amount = 0;
    }

    public int getAmount() {
        return amount;
    }

    public void insertOneProduct() {
        amount++;
    }

    public void removeOneProduct() {
        amount--;
    }

    // public void removeOneProduct() {
    //     if (amount > 0) {
    //         amount--;
    //     }
    // }

}
