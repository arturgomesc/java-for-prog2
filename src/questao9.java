import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            int a, b, c;

            System.out.println("Digite um valor: \n");
            a = ler.nextInt();

            b = a + 1;
            c = a - 1;
            System.out.print("O sucessor de " + a + " é " + b + " e seu antecessor é " + c + ".");
        }
    }
}
