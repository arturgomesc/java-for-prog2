import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)){

            double raio;
            double pi = 3.14;

            System.out.print("Digite o raio: \n");
            raio = in.nextDouble();

            double C = 2 * pi * raio;
            double area = pi * (raio * raio);

            System.out.printf("Tendo " + raio + " como raio, a circunferência é " + C + "e a área é " + area +".");
        
        }
    }
}
