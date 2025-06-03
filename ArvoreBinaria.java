import java.util.*;

public class ArvoreBinaria {


    public No inserirAVL(No node, String valor) {
        if (node == null) return new No(valor);

        if (valor.compareTo(node.valor) < 0) {
            node.esquerda = inserirAVL(node.esquerda, valor);
        } else if (valor.compareTo(node.valor) > 0) {
            node.direita = inserirAVL(node.direita, valor);
        } else {
            return node;
        }

        node.altura = 1 + Math.max(altura(node.esquerda), altura(node.direita));

        int fb = fatorBalanceamento(node);

        if (fb > 1 && valor.compareTo(node.esquerda.valor) < 0)
            return rotacaoDireita(node);

        if (fb < -1 && valor.compareTo(node.direita.valor) > 0)
            return rotacaoEsquerda(node);

        if (fb > 1 && valor.compareTo(node.esquerda.valor) > 0) {
            node.esquerda = rotacaoEsquerda(node.esquerda);
            return rotacaoDireita(node);
        }

        if (fb < -1 && valor.compareTo(node.direita.valor) < 0) {
            node.direita = rotacaoDireita(node.direita);
            return rotacaoEsquerda(node);
        }

        return node;
    }

    private int altura(No node) {
        return (node == null) ? 0 : node.altura;
    }

    private int fatorBalanceamento(No node) {
        return (node == null) ? 0 : altura(node.esquerda) - altura(node.direita);
    }

    private No rotacaoDireita(No y) {
        No x = y.esquerda;
        No T2 = x.direita;

        x.direita = y;
        y.esquerda = T2;

        y.altura = 1 + Math.max(altura(y.esquerda), altura(y.direita));
        x.altura = 1 + Math.max(altura(x.esquerda), altura(x.direita));

        return x;
    }

    private No rotacaoEsquerda(No x) {
        No y = x.direita;
        No T2 = y.esquerda;

        y.esquerda = x;
        x.direita = T2;

        x.altura = 1 + Math.max(altura(x.esquerda), altura(x.direita));
        y.altura = 1 + Math.max(altura(y.esquerda), altura(y.direita));

        return y;
    }


    public int CountNos(No node) {
        if (node == null) return 0;
        return 1 + CountNos(node.esquerda) + CountNos(node.direita);
    }


    public int contarNosFolha(No node) {
        if (node == null) return 0;
        if (node.esquerda == null && node.direita == null) return 1;
        return contarNosFolha(node.esquerda) + contarNosFolha(node.direita);
    }


    public void preOrdem(No node) {
        if (node != null) {
            System.out.print(node.valor + " ");
            preOrdem(node.esquerda);
            preOrdem(node.direita);
        }
    }


    public void posOrdem(No node) {
        if (node != null) {
            posOrdem(node.esquerda);
            posOrdem(node.direita);
            System.out.print(node.valor + " ");
        }
    }


    public void emNivelComFila(No raiz) {
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
}
