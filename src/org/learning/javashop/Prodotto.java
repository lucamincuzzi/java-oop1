package org.learning.javashop;

import java.util.Random;

public class Prodotto {
    // Attributi
    int codice;
    String nome;
    String descrizione;
    double prezzo;
    int iva;

    // Random generator
    Random rnd = new Random();

    public Prodotto(String nome, String descrizione, double prezzo) {
        this.codice = rnd.nextInt(99999999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = 22;
    }

    public double prezzoBase() {
        return this.prezzo;
    }

    public double prezzoIva(){
        return this.prezzo + ((this.prezzo / 100) * (this.iva));
    }

    public String nomeArticolo(){
        String nome = this.nome;

        // "Converto" il codice del prodotto in stringa
        String strCodice = "" + this.codice;

        // Inizializzo il nome completo dell'articolo
        String codiceNome = strCodice + nome;

        // Inizializzo l'eventuale padding da aggiungere

        int paddingDaAgg = 0;

        // Calcolo quanti 0 di padding da aggiungere
        if (strCodice.length() < 8){
            paddingDaAgg = 8 - strCodice.length();

            // Li aggiungo al codice
            for (int i = 0; i < paddingDaAgg; i++) {
                strCodice += "0";
            }

            // Concateno il codice al nome dell'articolo
            codiceNome = strCodice += nome;
        }

        return codiceNome;
    }
}
