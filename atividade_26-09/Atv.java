import java.util.Scanner;

public class Atv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            case 5:
                System.out.println("Programa encerrado.");
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção de 1 a 5.");
                break;
            }
        }
}
