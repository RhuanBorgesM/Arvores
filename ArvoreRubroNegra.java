public class ArvoreRubroNegra {
    private No raiz;

    public void inserir(int valor) {
        raiz = inserir(raiz, valor);
        raiz.cor = No.PRETO;
    }

    private No inserir(No h, int valor) {
        if (h == null) return new No(valor);

        if (valor < h.valor) {
            h.esquerda = inserir(h.esquerda, valor);
            h.esquerda.pai = h;
        } else if (valor > h.valor) {
            h.direita = inserir(h.direita, valor);
            h.direita.pai = h;
        } else {
            return h;
        }


        if (ehVermelho(h.direita) && !ehVermelho(h.esquerda)) h = rotacaoEsquerda(h);
        if (ehVermelho(h.esquerda) && ehVermelho(h.esquerda.esquerda)) h = rotacaoDireita(h);
        if (ehVermelho(h.esquerda) && ehVermelho(h.direita)) inverterCores(h);

        return h;
    }

    private boolean ehVermelho(No no) {
        return no != null && no.cor == No.VERMELHO;
    }

    private No rotacaoEsquerda(No h) {
        No x = h.direita;
        h.direita = x.esquerda;
        if (x.esquerda != null) x.esquerda.pai = h;
        x.esquerda = h;
        x.cor = h.cor;
        h.cor = No.VERMELHO;
        x.pai = h.pai;
        h.pai = x;
        return x;
    }

    private No rotacaoDireita(No h) {
        No x = h.esquerda;
        h.esquerda = x.direita;
        if (x.direita != null) x.direita.pai = h;
        x.direita = h;
        x.cor = h.cor;
        h.cor = No.VERMELHO;
        x.pai = h.pai;
        h.pai = x;
        return x;
    }

    private void inverterCores(No h) {
        h.cor = No.VERMELHO;
        if (h.esquerda != null) h.esquerda.cor = No.PRETO;
        if (h.direita != null) h.direita.cor = No.PRETO;
    }

    public void emOrdem() {
        emOrdem(raiz);
        System.out.println();
    }

    private void emOrdem(No no) {
        if (no != null) {
            emOrdem(no.esquerda);
            System.out.print(no.valor + (no.cor == No.VERMELHO ? "(R) " : "(B) "));
            emOrdem(no.direita);
        }
    }
}
