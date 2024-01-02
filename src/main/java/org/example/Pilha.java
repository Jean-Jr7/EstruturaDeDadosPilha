package org.example;

public class Pilha {
    private No topPilha;

    public Pilha() {
        this.topPilha = null;
    }
    public void push(No NovoNo) {
        No refAxiliar = topPilha;              // 1. Cria uma referência auxiliar para o nó atual do topo da pilha.
        topPilha = NovoNo;                    // 2. Define o nó fornecido (NovoNo) como o novo topo da pilha.
        topPilha.setRefN(refAxiliar);        // 3. Define a referência do novo topo da pilha para o nó anterior do topo.
    }

    public No pop() {
        if (isEmpety()) {
            throw new IllegalStateException("A pilha está vazia!");
        }
        No noPoped = topPilha;                   //1. Armazena o nó que será removido (o topo atual da pilha).
        topPilha = topPilha.getRefN();          //2. Atualiza o topo da pilha para o próximo nó, removendo o nó atual.
        return noPoped;                        //3. Retorna o nó que foi removido (o antigo topo da pilha).
    }

    public No top() {
        return topPilha;
    }

    public boolean isEmpety() {
        return topPilha == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "-----------------\n";
        stringRetorno += "    pilha\n";
        stringRetorno += "--------------------\n";
        No noAuxiliar = topPilha;
        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefN();
            } else {
                break;
            }
        }stringRetorno += "=========================\n";
        return stringRetorno;
    }
}
