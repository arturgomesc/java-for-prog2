import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double a, b;


            System.out.print("Insira a primeira nota: ");
            a = in.nextDouble();

            System.out.println("Insira a segunda nota: ");
            b = in.nextDouble();

            double c = (a + b) / 2;

            if (a > b) {
                System.out.println("Sua média é " + c + ", e sua maior nota foi " + a + ".");
            } else if (b > a) {
                System.out.println("Sua média é " + c + ", e sua maior nota foi " + b + ".");
            } else {
                System.out.println("Você tirou a mesma nota duas vezes, portanto, sua média é " + c + ".");
            }
        }
    }

}
