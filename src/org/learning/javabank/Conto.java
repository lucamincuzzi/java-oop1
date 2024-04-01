package org.learning.javabank;

import java.util.Random;
import java.util.Scanner;

public class Conto {
    int nConto;
    String intestatario;
    double saldo;

    public Conto() {
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);

        this.nConto = rnd.nextInt(1000) + 1;
        System.out.print("Benvenuto/a in Java Bank! Inserire il proprio nome e cognome ");
        this.intestatario = scan.nextLine();
        this.saldo = 0.00;
    }

    public String versamento(double quotaVersamento){
        this.saldo += quotaVersamento;
        return "Quota versata correttamente! Il tuo nuovo saldo è di: " + this.saldo;
    }

    public String prelievo(double quotaPrelievo){
        if(this.saldo >= quotaPrelievo){
            this.saldo -= quotaPrelievo;
            return "Quota prelevata correttamente! Il tuo nuovo saldo è di: " + this.saldo;
        }
        return "Il tuo saldo non è sufficiente per prelevare la quota richiesta";
    }

    public String getNConto(){
        return "" + this.nConto;
    }

    public String getIntestatario(){
        return this.intestatario;
    }

    public double getSaldo(){
        return this.saldo;
    }
}
