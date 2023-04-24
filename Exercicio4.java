import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        System.out.println("Exercicio4");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua operação (1- perímetro,2- área,3- volume)");
        int operacao = scanner.nextInt();

        System.out.println("Digite o valor do raio");
        double raio = scanner.nextDouble();

        double pi = 3.141592;

        if (operacao == 1) {
            double perímetro = 2 * pi * raio;
            System.out.printf("O perímetro do círculo é: %.2f%n", perímetro);
        } else if (operacao == 2) {
            double área = pi * raio * raio;
            System.out.printf("A área do circulo é: %.2f%n", área);
        } else if (operacao == 3) {
            double volume = (4.0 / 3.0) * pi * raio * raio * raio;
            System.out.printf("O volume da esfera é: %.2f%n", volume);

        } else {

            System.out.println("Código da operação é inválido.");
        }
        scanner.close();
    }

}