import java.util.Scanner;

/*Faça um programa que ao receber um número informe se
se ele é par ou impar, negativo ou positivo.
OBS: TODA A LÓGICA DEVER SER FEITA DENTRO DO MÉTODO MAIN
 */

public class Prog1{
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Informe número: ");
        int x = dd.nextInt();

        if(x >= 0){
            System.out.println(x + " é positivo.");
        }else
        System.out.println(x + " é negativo.");

        if(x %2 ==0)
            System.out.println(x + " é par.");
        else 
          System.out.println(x + " é impar.");
    }
}