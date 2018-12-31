/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.ex10;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Michel
 */
public class InfoArquivo {

    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        while (true) {
            String arq = showInputDialog("Qual arquivo deseja analisar?");
            if (arq == null) {
                break;
            }
            File file = new File(arq);
            if (!file.exists()) {
                showMessageDialog(null, "Caminho não existe", "Erro",
                        ERROR_MESSAGE);
            } else {
                String props = "Propriedades do arquivo: "
                        + "\nLocalização: " + file.getPath()
                        + "\nTipo: "
                        + (file.isDirectory() ? "Diretório" : "Arquivo")
                        + "\nÚltima modificação: "
                        + df.format(new Date(file.lastModified()))
                        + "\nOculto: " + (file.isHidden() ? "Sim" : "Não")
                        + "\nPermissões: "
                        + "\n-Leitura: " + (file.canRead() ? "Sim" : "Não")
                        + "\n-Escrita: " + (file.canWrite() ? "Sim" : "Não")
                        + "\n-Execução: " + (file.canExecute() ? "Sim" : "Não");
                showMessageDialog(null, props);
            }
        }
    }
}
