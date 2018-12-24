/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michel
 */
public class JavaSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread tc = Thread.currentThread();
        tc.setName("Thread corrente");
        tc.setPriority(Thread.MIN_PRIORITY);
        threadTc(tc);
        waitThread();

        System.out.println();
        tc.setName("Thread única");
        tc.setPriority(Thread.MAX_PRIORITY);
        threadTc(tc);
        waitThread();

        System.out.println();
        tc.setName("Thread atual");
        tc.setPriority(Thread.NORM_PRIORITY);
        threadTc(tc);
    }

    private static void threadTc(Thread tc) {
        System.out.println("Nome: " + tc.getName());
        System.out.println("Prioridade: " + tc.getPriority());
    }

    private static void waitThread() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("ERRO: thread interrompida");
            Logger.getLogger(JavaSE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
