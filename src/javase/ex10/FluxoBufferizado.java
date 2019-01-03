/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.ex10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michel
 */
public class FluxoBufferizado {

    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("src\\javase\\Aulas.txt"));
            bw = new BufferedWriter(new FileWriter("src\\javase\\AulasFB.txt"));
            String linha;
            while ((linha = br.readLine()) != null) {
                bw.write(linha + System.getProperty("line.separator"));
            }
        } catch (IOException e) {
            System.out.println("ERROR " + e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(FluxoBufferizado.class.getName())
                            .log(Level.SEVERE, null, ex);
                }
            }
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException ex) {
                    Logger.getLogger(FluxoBufferizado.class.getName())
                            .log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
