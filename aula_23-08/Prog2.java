import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

/*
Faça um programa no qual o usuário digite um número inteiro
O programa deverá analisar o número digitado e produzir
as seguintes menssagens:
- número par e positivo
- número par e negativo
- número impar e positivo
- número impar e negativo
*/
//FAÇA O PROGRAMA USANDO A TABELA VERDADE E TAMBÉM IF-ELSE

public class Prog2 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        int num;

        System.out.print("Informe número: ");
        num = dd.nextInt();
       //num =2
        if(num % 2 == 0 && num >= 0)
            System.out.println(num + " é par e positivo.");
        else
            if(num % 2 == 0 && num < 0)
                System.out.println(num + " é par e negativo.");
            else 
                if(num % 2 != 0 && num >= 0)
                    System.out.println(num + " é impar e positivo.");
                else 
                    if(num % 2 != 0 && num < 0)
                        System.out.println(num + " é impar e negativo.");            
    }
}