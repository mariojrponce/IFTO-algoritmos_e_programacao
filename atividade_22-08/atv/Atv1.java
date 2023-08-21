import java.util.Scanner;

/*
* FAÇA UM PROGRAMA JAVA QUE O USUARIO INFORME UM
* NÚMERO VIA TECLADO E O SEU PROGRAMA INFORME 
* UM DOS SEGUINTES RESULTADOS:
* - É MÚLTIPLO APENAS DE 2
* - É MÚLTIPLO APENAS DE 3
* - É MÚLTIPLO DE 2 E DE 3
* - NÃO É MÚLTIPLO DE 2 E NEM DE 3

OBS: SER MÚLTIPLO DE 2 SIGNIFICA QUE A DIVISÃO DESSE NÚMERO POR 2 == 0
SER MÚLTIPLO DE 3 SIGNIFICA QUE A DIVISÃO DESSE NÚMERO POR 3 == 0
*/

public class Atv1 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        int num;

        System.out.print("Informe número: ");
        num = dd.nextInt();

        if(num % 2 == 0) {
            System.out.println("Valor é multiplo de 2");
        }
        else {
            System.out.println("NÃO é multiplo de 2");
        }
        if(num % 3 == 0){
            System.out.println("Valor é multipo de 3");
        }
        else{
            System.out.println("NÃO é multiplo de 3");
        }
        if((num % 3 == 0) && (num % 2 == 0)){
            System.out.println("Valor é multiplo de 2 e 3 ao mesmo tempo");
        }
        else {
            System.out.println("Valor NÃO é multiplo de 2 e 3 ao mesmo tempo");
        }
    }
}
