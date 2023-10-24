import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Informe número: ");
        int x = dd.nextInt();

        positivoNegativo();
        parImpar(x);
    }

    public static void positivoNegativo() {
        Scanner dd = new Scanner(System.in);

        System.out.print("Informe número: ");
        int x = dd.nextInt();

        if (x >= 0) {
            System.out.println(x + " é positivo.");
        } else {
            System.out.println(x + " é negativo.");
        }
    }

    public static void parImpar(int x) {
        if (x % 2 == 0) {
            System.out.println(x + " é par.");
        } else {
            System.out.println(x + " é ímpar.");
        }
    }

    public static boolean isPositive(int x) {
        return x >= 0;
    }

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }
}
