import java.util.Scanner;

/*  Prova 1 -> 9pts
 * Faça um programa que a partir de um vetor do tipo char de 0 a 9, 
 * imprima todos os caracteres visualmente como numeros até o valor informado pelo usuario.
 * A impressao dos numeros da tela deverá ser feita exclusivamente via impressão dos caracteres contidos no vetor
 */

 public class Prova1 {
    public static void main(String[] args) {
        
        Scanner dd = new Scanner(System.in);
        System.out.print("Imprima de 0 a: ");
        int entrada = dd.nextInt();

        char vChar[] = new char[entrada]; // declaração com alocação de espaço em um vetor CHAR

        int vInt[] = new int[entrada]; // declaração com alocação de espaço em um vetor INT
        
        int gravar = 1; //Corrigir valor que inicia com 0
        
        for (int i=0; i<entrada; i++) { 
            
            vInt[i] = gravar; // Armazena o valor direto em INT

            vChar[i] = (char) gravar; // armazena o valor convertido para char

            System.out.println("int:" + vInt[i]);

            System.out.println("char:" + vChar[i]);
            
            gravar++;
        }

    }
 }