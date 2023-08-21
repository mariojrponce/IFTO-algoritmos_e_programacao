import java.util.Scanner;

/*
Faça um programa no qual o usuário digite um número inteiro
O programa deverá analisar o número digitado e produzir
as seguintes menssagens:
- número par e positivo
- número par e negativo
- número impar e positivo
- número impar e negativo
*/
public class Prog11 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        int num;

        System.out.print("Informe número: ");
        num = dd.nextInt();

        if(num % 2 == 0)
            System.out.print(num + " é par");
        else
            System.out.print(num + " é impar"); 
        
        if(num >= 0)
            System.out.println(" e  positivo.");
        else
            System.out.println(" e  negativo.");
    }
}

