public class ProgramaPrincipal {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        No raiz = null;

        
        raiz = arvore.inserirAVL(raiz, "D");
        raiz = arvore.inserirAVL(raiz, "B");
        raiz = arvore.inserirAVL(raiz, "F");
        raiz = arvore.inserirAVL(raiz, "A");
        raiz = arvore.inserirAVL(raiz, "C");
        raiz = arvore.inserirAVL(raiz, "E");

        System.out.println("Pré-Ordem:");
        arvore.preOrdem(raiz);

        System.out.println("\n\nPós-Ordem:");
        arvore.posOrdem(raiz);

        System.out.println("\n\nEm Nível:");
        arvore.emNivelComFila(raiz);

        System.out.println("\n\nTotal de Nós: " + arvore.CountNos(raiz));
        System.out.println("Nós Folha: " + arvore.contarNosFolha(raiz));
    }
}
