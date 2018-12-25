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
public class MinhaLinha implements Runnable {

    @Override
    public void run() {
        System.out.println("Linha secundária iniciada");

        for (int i = 5; i >= 0; i--) {
            try {
                System.out.println("Contagem: " + i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MinhaLinha.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println("Linha secundária encerrada");
    }

}
