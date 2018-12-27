/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.ex10;

import java.io.File;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Michel
 */
public class ExclusaoArquivo {

    public static void main(String[] args) {
        while (true) {
            String arq = showInputDialog("Coloque o caminho do arquivo para a "
                    + "exclusão.");
            if (arq == null) {
                break;
            }
            File file = new File(arq);
            if (!file.exists()) {
                showMessageDialog(null, "Arquivo não existe!", "Erro",
                        ERROR_MESSAGE);
            } else {
                file.delete();
            }
        }
    }
}
