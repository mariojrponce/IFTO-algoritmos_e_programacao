import java.util.Scanner;

//Faça um programa que imprima uma palavra a ser 
//informada pelo usuário sem as vogais
//Adaptando o prog5 para fazer uso do forEach
public class Prog6{
    public static void main(String[] args) {
        if(args.length ==0){
            System.out.println("Ausência de parâmetros.");
            return;
        }
        char x[] = args[0].toLowerCase().toCharArray();

        int i=0;
        for(char y: x){
            if(y!= 'a' && y != 'e' && 
            y != 'i' && y != 'o' && 
            y != 'u')
                System.out.print(args[0].charAt(i));
            i++;
        }
        System.out.println();
    }
}
