/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.ex10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michel
 */
public class FluxoLinhas {

    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            br = new BufferedReader(new FileReader("src\\javase\\Aulas.txt"));
            pw = new PrintWriter(new FileWriter("src\\javase\\AulasFW.txt"));
            String linha;
            while ((linha = br.readLine()) != null) {
                pw.println(linha);
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
            if (pw != null) {
                pw.close();
            }
        }
    }
}
/*
https://stackoverflow.com/questions/1747040/difference-between-java-io-printwriter-and-java-io-bufferedwriter
*/