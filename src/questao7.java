import java.util.Scanner;

public class questao7 {
    public static void main(String[] agrs) {
        try (Scanner in = new Scanner(System.in)) {
            double l;

            System.out.print("Digite o lado do quadrado: \n");
            l = in.nextDouble();

            double perimetro = l * 4, area = l * l;
            System.out.printf("O perímetro do quadrado é " + perimetro + ", e sua área é "+ area + "."); 
        }
    }
}
