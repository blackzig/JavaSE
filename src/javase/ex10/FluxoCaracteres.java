/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.ex10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michel
 */
public class FluxoCaracteres {

    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("src\\javase\\EntiArarasDev2017.pptx");
            fw = new FileWriter("src\\javase\\copia1.pptx");
            int bt;
            while ((bt = fr.read()) != -1) {
                fw.write(bt);
            }
        } catch (IOException e) {
            System.out.println("ERROR " + e.getMessage());
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException ex) {
                    Logger.getLogger(FluxoCaracteres.class.getName())
                            .log(Level.SEVERE, null, ex);
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(FluxoCaracteres.class.getName())
                            .log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
