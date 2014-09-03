/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesjava;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Neto Andrade
 */
@ManagedBean
public class NumeroAleatorioBean {

    private int maximo;
    private int numeroAleatorio;

    public String gerarNumeroAleatorio() {

        this.numeroAleatorio = (int) (Math.random() * this.maximo);

        return "resposta";
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }

}
