package org.example;

public class No {
    private int dado;

    private No refN = null;

    /**
     * No: Refere-se ao tipo de dado que a variável refNo pode armazenar. Como refNo é do tipo No
     * ela pode armazenar uma referência para um objeto da própria classe No.
     */
    public No(){

    }
    public No(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefN() {
        return refN;
    }

    public void setRefN(No refN) {
        this.refN = refN;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
