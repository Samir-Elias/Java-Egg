/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Cuenta {
    Scanner leer = new Scanner(System.in);
    private String titular = "Jorge";
    private int saldo = 5000;
    private int saldoTotal;
    private String sn;
    private String sn1;
    private int retiro;
    public Cuenta() {
    }

    public void ingresoNombre() {
        
        do {
            if (!(titular.equalsIgnoreCase("jorge"))) {
                System.out.println("Intente con un usuario correcto");
            }
            System.out.println("Ingrese nombre de usuario");
            titular = leer.next();

        } while (!(titular.equalsIgnoreCase("jorge")));
    }

    public void retirar_dinero() {
        if (titular.equalsIgnoreCase("jorge")) { 
            System.out.println("Bienvenido Jorge, ¿le interesa extraer dinero? S/N");
             sn = leer.next();
             if (!(sn.equalsIgnoreCase("N"))) {
                 saldoTotal = saldo;
                 do {
                 System.out.println("Su saldo disponible es de: " + saldoTotal);
                 System.out.println("Cuanto quiere retirar?");
                 retiro = leer.nextInt();
                 saldoTotal -= retiro;
                 if (saldoTotal <= 0) {
                     saldoTotal = 0;
                 }
                 System.out.println("Desea volver a retirar? S/N");
                 sn1 = leer.next();
                 } while (saldoTotal != 0 || (!(sn1.equalsIgnoreCase("N"))));
                 
                 if (saldoTotal <= 0) {
                     saldoTotal = 0;
                 }
                 System.out.println("Su saldo restante es de: " + saldoTotal);
             }
            }  
    }
}
