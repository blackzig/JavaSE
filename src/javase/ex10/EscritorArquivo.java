/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.ex10;

import java.awt.HeadlessException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Michel
 */
public class EscritorArquivo {
    
    public static void main(String args[]) {
        String nome = showInputDialog("Digite o nome do arquivo");
        if (nome == null) {
            System.exit(0);
        }
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(nome));
            int numeroLinha = 0;
            while (true) {
                String linha = showInputDialog("Informe o texto da linha "
                        + ++numeroLinha);
                if (linha == null) {
                    break;
                }
                pw.println(linha);
            }
            pw.close();
        } catch (HeadlessException | IOException e) {
            showMessageDialog(null, "Erro durante a gravação", "Erro",
                    ERROR_MESSAGE);
        }
    }
}
