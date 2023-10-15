import java.util.Scanner;

/*
Imprima todos os números de forma decrescente até 1
a partir de um número a ser informado pelo usuario

Ex> usuario informou 5
4 3 2 1
*/
public class Prog4 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        int num;
        
        System.out.print("Informe um número: ");
        num = dd.nextInt(); //num =5

        for (int i = num; i>0;i--) {
            System.out.println(i);
        }
    }
}
