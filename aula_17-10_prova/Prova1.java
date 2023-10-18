import java.util.Scanner;

/*  Prova 1 -> 9pts
 * Faça um programa que a partir de um vetor do tipo char de 0 a 9, 
 * imprima todos os caracteres visualmente como numeros até o valor informado pelo usuario.
 * A impressao dos numeros da tela deverá ser feita exclusivamente via impressão dos caracteres contidos no vetor
 */

 public class Prova1 {
    public static void main(String[] args) {
        char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int valor = scanner.nextInt();

        for (int i = 0; i <= valor; i++) {
            if (i < 10) {
                System.out.print(numeros[i]);
            } else {
                System.out.print(numeros[i / 10]);
                System.out.print(numeros[i % 10]);
            }
            System.out.println();
        }

    }
 }