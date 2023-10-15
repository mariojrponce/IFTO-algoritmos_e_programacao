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

public class Prog3{
    public static void main(String[] args) {
        
        System.out.print("Informe o número: ");
        int num = new Scanner(System.in).nextInt();
        switch((num %2 == 0) && (num % 3 == 0)?1:
        (num %2 != 0) && (num % 3 != 0)?2:
        (num %2 == 0) && (num % 3 != 0)?3:4){
            case 1:
                System.out.println(num + " É múltiplo de 2 e de 3.");
                break;
            case 2:
                System.out.println(num + " Não é múltiplo de 2 ou de 3.");
                break;
            case 3:
                System.out.println(num + " É múltiplo apenas de 2.");
                break;
            case 4:
                System.out.println(num + " É múltiplo apenas de 3.");
                break;
        } 
    
    }
}