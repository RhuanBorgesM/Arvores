public class ArvoreBinaria {


    public int CountNos(No node) {
        if (node == null) return 0;
        return 1 + CountNos(node.esquerda) + CountNos(node.direita);
    }


    public void preOrdem(No node) {
        if (node == null) return;
        System.out.print(node.valor + " ");
        preOrdem(node.esquerda);
        preOrdem(node.direita);
    }


    public void emNivelComFila(No raiz) {
        if (raiz == null) return;
        java.util.Queue<No> fila = new java.util.LinkedList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            No atual = fila.poll();
            System.out.print(atual.valor + " ");
            if (atual.esquerda != null) fila.add(atual.esquerda);
            if (atual.direita != null) fila.add(atual.direita);
        }
    }


    public void posOrdem(No node) {
        if (node == null) return;
        posOrdem(node.esquerda);
        posOrdem(node.direita);
        System.out.print(node.valor + " ");
    }


    public int contarNosFolha(No node) {
        if (node == null) return 0;
        if (node.esquerda == null && node.direita == null) return 1;
        return contarNosFolha(node.esquerda) + contarNosFolha(node.direita);
    }


    public void preOrdemComPilha(No raiz) {
        if (raiz == null) return;
        java.util.Stack<No> pilha = new java.util.Stack<>();
        pilha.push(raiz);

        while (!pilha.isEmpty()) {
            No atual = pilha.pop();
            System.out.print(atual.valor + " ");
            if (atual.direita != null) pilha.push(atual.direita);
            if (atual.esquerda != null) pilha.push(atual.esquerda);
        }
    }
}
