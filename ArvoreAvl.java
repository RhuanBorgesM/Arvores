public class ArvoreAvl {
    public static void main(string[] args) {
        ArvoreAvl arvore = new ArvoreAvl();

        int[] chaves = {10, 20, 30, 40, 50, 25};

        for (int chave : chaves) {
            arvore.raiz = arvore.inserir(arvore.raiz, chave);
        }
    }
    System.out.println("Percurso em ordem da arvore AVL");
    arvore.percursoEmOrdem(arvore.raiz);
}

