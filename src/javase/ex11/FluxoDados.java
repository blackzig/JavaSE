/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.ex11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Michel
 */
public class FluxoDados {

    public static void main(String[] args) {
        try {
            DataOutputStream dos = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("Produto.txt")
                    )
            );
            dos.writeInt(1);
            dos.writeUTF("Maça");
            dos.writeDouble(2.25);

            dos.writeInt(2);
            dos.writeUTF("Pêssego");
            dos.writeDouble(3.78);

            dos.close();
        } catch (IOException e) {
            System.out.println("ERROR1 " + e.getMessage());
        }

        String str = "Produtos registrados:";
        try {
            DataInputStream dis = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream("Produto.txt")
                    )
            );
            while (true) {
                str += "\nProduto " + dis.readInt() + ": " + dis.readUTF()
                        + " - " + dis.readDouble();
            }
        } catch (IOException e) {
            System.out.println("ERROR2 " + e.getMessage());
        }
        showMessageDialog(null, str);
    }

}
