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
public class Prog10 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        int num;

        System.out.print("Informe número: ");
        num = dd.nextInt();

        if(num % 2 == 0){
            if(num >= 0)
                System.out.println(num + " é par e positivo.");
            else
                System.out.println(num + " é par e negativo.");            
        }else{
            if(num >= 0)
                System.out.println(num + " é impar e positivo.");
            else
                System.out.println(num + " é impar e negativo.");            

        }
    }
}
