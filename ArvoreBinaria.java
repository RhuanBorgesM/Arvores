import java.util.LinkedList;
import java.util.Queue;

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


    public void emNivel(No raiz) {
        if (raiz == null) return;

        Queue<No> fila = new LinkedList<>();
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
}
