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
public class Fila extends Thread {

    private final String documento;
    private final Impressora impressora;
    
    public Fila(String documento, Impressora impressora) {
        this.documento = documento;
        this.impressora = impressora;
    }
    
    @Override
    public void run() {
        impressora.imprimir(documento);
    }
}
