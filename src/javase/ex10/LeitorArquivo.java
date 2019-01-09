/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.ex10;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Michel
 */
public class LeitorArquivo {

    public static void main(String args[]) {
        String nome = showInputDialog("Digite o nome do arquivo");
        if (nome == null) {
            System.exit(0);
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(nome));
            String conteudoArquivo = "";
            while (true) {
                String linha = br.readLine();
                if (linha == null) {
                    break;
                }
                conteudoArquivo += linha + "\n";
            }
            br.close();
            showMessageDialog(null, conteudoArquivo);
        } catch (HeadlessException | IOException e) {
            showMessageDialog(null, "Arquivo não encontrado!", "Erro",
                    ERROR_MESSAGE);
        }
    }
}
