
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
}
