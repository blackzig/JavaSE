/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.ex10;

import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Michel
 */
public class CriacaoArquivo {

    public static void main(String[] args) {
        String dir = showInputDialog("Em qual diretório deseja criar?");
        if (dir == null) {
            System.exit(0);
        }
        File fl_dir = new File(dir);

        if (!fl_dir.exists()) {
            fl_dir.mkdirs();
            showMessageDialog(null, "Diretório criado: " + fl_dir.getPath());
        } else {
            showMessageDialog(null, "Diretório já existe!");
        }

        try {
            while (true) {
                String arq = showInputDialog("Qual o nome do arquivo?");
                if (arq == null) {
                    System.exit(0);
                }

                File file = new File(fl_dir.getPath() + File.separator + arq);

                if (!file.exists()) {
                    file.createNewFile();
                } else {
                    showMessageDialog(null, "Arquivo já existe!", "Erro",
                            ERROR_MESSAGE);
                }
            }
        } catch (HeadlessException | IOException e) {
            showMessageDialog(null, "Erro ocorrido!", "Erro", 0);
        }
    }
}
