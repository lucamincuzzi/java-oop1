package org.learning.javabank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        // Il costruttore chiederà all'utente il suo nome e cognome per la generazione del conto
        Conto contoUtente = new Conto();

        System.out.println("Grazie! Di seguito le informazioni relative al conto appena generato:");
        System.out.println();

        // Stampo le informazioni del conto appena generato
        System.out.println("Il tuo numero di conto: " + contoUtente.getNConto());
        System.out.println("Nome e cognome dell'intestatario: " + contoUtente.getIntestatario());
        System.out.println("Il tuo attuale saldo: " + contoUtente.getSaldo() + "€");

        System.out.println();

        // Richiesta all'utente della prossima azione da compiere
        int optionSelected = 0;

        while(optionSelected != 3){
            // Inizializzo lo Scanner
            Scanner scan = new Scanner(System.in);

            // Riassegno il valore della scelta dell'utente
            optionSelected = 0;

            // Chiedo all'utente di selezionare un'opzione
            System.out.print("Cosa si desidera fare?");
            System.out.println();

            System.out.println("1: Versamento");
            System.out.println("2: Prelievo");
            System.out.println("3: Uscire");

            System.out.print("Inserire il numero associato alla scelta: ");
            optionSelected = scan.nextInt();

            if(optionSelected == 1){
                System.out.print("Quanto si desidera versare? ");
                double quotaVersamento = scan.nextDouble();
                contoUtente.versamento(quotaVersamento);
            }

            if(optionSelected == 2){
                System.out.print("Quanto si desidera prelevare? ");
                double quotaPrelievo = scan.nextDouble();
                contoUtente.versamento(quotaPrelievo);
            }

            if(optionSelected == 3){
                System.out.print("Grazie per aver scelto Java Bank!");
            }

            // Chiudo lo scanner
            scan.close();
        }
    }
}
