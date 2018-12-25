/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.ex9;

/**
 *
 * @author Michel
 */
public class Ex9_2 {

    public static void main(String[] args) {
        Impressora matricial = new Impressora();

        Fila docto1 = new Fila("Relatório de vendas", matricial);
        Fila docto2 = new Fila("Planilha de custos", matricial);
        Fila docto3 = new Fila("Ficha de conferência", matricial);

        docto1.start();
        docto2.start();
        docto3.start();
    }
}
