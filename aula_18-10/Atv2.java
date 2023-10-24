import java.util.Scanner;

public class Atv2 {
        public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int x = dd.nextInt();

        System.out.print("Informe outro número: ");
        int y = dd.nextInt();

        int soma = somar(x, y);
        int produto = multiplicar(x, y);

        System.out.println("A soma de " + x + " e " + y + " é igual a " + soma);
        System.out.println("O produto de " + x + " e " + y + " é igual a " + produto);
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }
}
