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

public class Atividade{
    public static void main(String[] args) {
        
        System.out.print("Informe o número: ");
        int num = new Scanner(System.in).nextInt();
        
        if(num %2 == 0){ //true
            if(num % 3 != 0) //falso
                System.out.println(num + " É múltiplo apenas de 2.");
            else
                System.out.println(num + " É múltiplo de 2 e de 3.");
        }else{
            if(num % 3 == 0) //falso
                System.out.println(num + " É múltiplo apenas de 3.");
            else
                System.out.println(num + " Não é múltiplo de 2 ou de 3.");
        }
    
    }
}