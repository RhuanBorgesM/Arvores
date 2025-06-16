public class No {
    int valor;
    No esquerda, direita, pai;


    int altura;


    boolean cor;

    public static final boolean VERMELHO = true;
    public static final boolean PRETO = false;

    public No(int valor) {
        this.valor = valor;
        this.altura = 1;
        this.cor = VERMELHO;
    }
}
