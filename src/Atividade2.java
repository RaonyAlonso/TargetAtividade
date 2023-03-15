import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite o termo que deseja saber");
        int valor = x.nextInt();
        int n1 = 1;
        int n2 = 1;
        boolean f = true;
        while (f) {
           // System.out.print((n1 + n2) + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if (valor == n3) {
                System.out.println("Pertence a sequência de Fibonacci");
                f = false;
            } else if (valor < n3) {
                System.out.println("Não pertence");
                f = false;
            }

        }
    }

}
