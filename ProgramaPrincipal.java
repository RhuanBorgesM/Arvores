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


        System.out.println("Total de nós: " + arvore.CountNos(A));

        System.out.print("Pré-ordem (recursiva): ");
        arvore.preOrdem(A);

        System.out.print("\nPré-ordem (com pilha): ");
        arvore.preOrdemComPilha(A);

        System.out.print("\nEm nível (com fila): ");
        arvore.emNivelComFila(A);

        System.out.print("\nPós-ordem: ");
        arvore.posOrdem(A);

        System.out.println("\nNós folha: " + arvore.contarNosFolha(A));
    }
}
