/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.ex9;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michel
 */
public class Impressora {

    public synchronized void imprimir(String documento) {
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("Início de impressão: " + documento);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            System.out.println("Linha interrompida!");
            Logger.getLogger(Impressora.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

        System.out.println("Fim de impressão " + documento);
        System.out.println("-----------------------------");
    }

}
