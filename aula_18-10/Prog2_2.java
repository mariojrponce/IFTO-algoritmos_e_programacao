import java.util.Scanner;

/*Faça um programa que ao receber um número informe se
se ele é par ou impar, negativo ou positivo.
-deve se criar um método para determinar se o número
é positivo/negativo e outro método para determinar 
se o número é par ou impar

-> métodos sem retorno e sem passagem de parâmetros

*/

public class Prog2_2{
    static int x; //atributo

    public static void postivoNegativo(){
        if(x >= 0){
            System.out.println(x + " é positivo.");
        }else
            System.out.println(x + " é negativo.");

        parImpar();
    }

    public static void parImpar(){
        if(x %2 ==0)
            System.out.println(x + " é par.");
        else 
          System.out.println(x + " é impar.");
    }
    public static void main(String[] args) {   
        
        Scanner dd = new Scanner(System.in);

        System.out.print("Informe número: ");
        x = dd.nextInt();
        postivoNegativo();
        
    }
}