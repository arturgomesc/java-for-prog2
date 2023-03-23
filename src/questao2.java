import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;

        System.out.print("Informe a primeira nota: \n");
        a = in.nextDouble();

        System.out.print("Informe a segunda nota: \n");
        b = in.nextDouble();

        System.out.print("Informe a terceira nota: \n");
        c = in.nextDouble();

        double media = (a + b + c) / 3;

        System.out.print("Sua média: " + media);
    }
}
