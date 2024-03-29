package org.learning.javashop;

public class Main {
    public static void main(String[] args) {
        Prodotto papaya = new Prodotto("Papaya", "frutto", 5.60);

        System.out.println(papaya.prezzoBase());
        System.out.println(papaya.prezzoIva());
        System.out.println(papaya.nomeArticolo());

        System.out.println();

        Prodotto smartphone = new Prodotto("Samsung Galaxy S23", "telefono", 759.99);

        System.out.println(smartphone.prezzoBase());
        System.out.println(smartphone.prezzoIva());
        System.out.println(smartphone.nomeArticolo());
    }
}
