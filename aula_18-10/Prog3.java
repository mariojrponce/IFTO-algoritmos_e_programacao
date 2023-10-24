import java.util.Scanner;

/*Faça um programa que ao receber um número informe se
se ele é par ou impar, negativo ou positivo.
-deve se criar um método para determinar se o número
é positivo/negativo e outro método para determinar 
se o número é par ou impar

-> métodos sem retorno e com passagem de parâmetros

*/

public class Prog3{
    
    public static void postivoNegativo(int x){
        if(x >= 0){
            System.out.println(x + " é positivo.");
        }else
        System.out.println(x + " é negativo.");
    }

    public static void parImpar(int x){
        if(x %2 ==0)
            System.out.println(x + " é par.");
        else 
          System.out.println(x + " é impar.");
    }
    public static void main(String[] args) {   
        
        Scanner dd = new Scanner(System.in);

        System.out.print("Informe número: ");
        int x = dd.nextInt();
        postivoNegativo(x);
        parImpar(x);
    }
}