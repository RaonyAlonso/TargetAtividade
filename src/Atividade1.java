public class Atividade1 {
    public static void main(String[] args) {
        int INDICE = 13, SOMA = 0, K = 0;
        do {
            K++;
            SOMA = SOMA + K;
        }
        while (K<INDICE);
        System.out.println(SOMA);
        /* O resultado da variável SOMA é 91*/
    }

}
