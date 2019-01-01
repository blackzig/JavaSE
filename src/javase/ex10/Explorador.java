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
public class Explorador {

    public static void main(String[] args) {
        while (true) {
            String dir = showInputDialog("Indique um diretório");
            if (dir == null) {
                System.exit(0);
            }

            File fl_dir = new File(dir);
            if (!fl_dir.exists()) {
                showMessageDialog(null, "Diretório não existe!", "Erro",
                        ERROR_MESSAGE);
            } else if (!fl_dir.isDirectory()) {
                showMessageDialog(null, "Não é um diretório!", "Erro",
                        ERROR_MESSAGE);
            } else {
                String[] conteudo = fl_dir.list();
                String str = "Conteúdo do diretório: " + fl_dir.getPath();
                for (String s : conteudo) {
                    File file = new File(fl_dir.getPath() + File.separator + s);
                    str += "\n " + s + " ("
                            + (file.isFile() ? "Arquivo" : "Diretório") + ")";
                }
                showMessageDialog(null, str);
            }
        }
    }
}
