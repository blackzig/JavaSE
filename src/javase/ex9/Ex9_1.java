/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.ex9;

import java.util.logging.Level;
import java.util.logging.Logger;
import javase.JavaSE;

/**
 *
 * @author Michel
 */
public class Ex9_1 {

    public static void main(String[] args) {
        Thread principal = Thread.currentThread();
        principal.setName("Linha principal");
        principal.setPriority(Thread.NORM_PRIORITY);
        System.out.println("Linha criada: " + principal);

        Thread secundaria = new Thread(new MinhaLinha());
        secundaria.setName("Linha secundária");
        secundaria.setPriority(Thread.NORM_PRIORITY);
        System.out.println("Linha criada: " + secundaria);

        System.out.println("");
        secundaria.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(JavaSE.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Linha principal encerrada");
    }

}
