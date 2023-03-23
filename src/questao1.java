import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            int a, b;

            System.out.println("Informe o primeiro valor: ");
            a = ler.nextInt();

            System.out.println("Informe o segundo valor: ");
            b = ler.nextInt();

            System.out.println("\nResultados:\n");
            System.out.printf("%d + %d = %3d\n", a, b, (a + b));
            System.out.printf("%d - %d = %3d\n", a, b, (a - b));
            System.out.printf("%d * %d = %3d\n", a, b, (a * b));
            System.out.printf("%d e %d = %3d (média)\n", a, b, ((a + b) / 2));
        }
    }
}
