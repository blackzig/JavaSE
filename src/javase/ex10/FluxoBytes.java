/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.ex10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michel
 */
public class FluxoBytes {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("src\\javase\\EntiArarasDev2017.pptx");
            fos = new FileOutputStream("src\\javase\\copia.pptx");
            int bt;
            while ((bt = fis.read()) != -1) {
                fos.write(bt);
            }
        } catch (IOException e) {
            System.out.println("ERROR " + e.getMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(FluxoBytes.class.getName())
                            .log(Level.SEVERE, null, ex);
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(FluxoBytes.class.getName())
                            .log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}

/*
https://docs.oracle.com/javase/8/docs/api/?java/io/FileInputStream.html

A FileInputStream obtains input bytes from a file in a file system. 
What files are available depends on the host environment.
FileInputStream is meant for reading streams of raw bytes such as image data. 
For reading streams of characters, consider using FileReader.

*/