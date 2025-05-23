public class ProgramaPrincipal {
    public static void main(String[] args) {

        No A = new No("A");
        No B = new No("B");
        No C = new No("C");
        No D = new No("D");
        No E = new No("E");
        No F = new No("F");


        A.esquerda = B;
        A.direita = C;
        B.esquerda = D;
        B.direita = E;
        C.direita = F;


        ArvoreBinaria arvore = new ArvoreBinaria();

        // Contagem dos nós
        System.out.println("Total de nós na árvore: " + totalNos);

        //Pré-ordem
        System.out.print("Pré-ordem: ");
        arvore.preOrdem(A);

        //Em nivel
        System.out.print("\nEm nível: ");
        arvore.emNivel(A);

        //Pós-ordem
        System.out.print("\nPós-ordem: ");
        arvore.posOrdem(A);
    }
}
