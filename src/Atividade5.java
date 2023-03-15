import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Escreva uma palavra: ");
        String palavra = x.nextLine();
        System.out.println(new StringBuilder(palavra).reverse().toString());
    }
}
