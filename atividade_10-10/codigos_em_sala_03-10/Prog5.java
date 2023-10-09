import java.util.Scanner;

//Faça um programa que imprima uma palavra a ser 
//informada pelo usuário sem as vogais
//Adaptando o prog4
public class Prog5{
    public static void main(String[] args) {
        if(args.length ==0){
            System.out.println("Ausência de parâmetros.");
            return;
        }
        char x[] = args[0].toLowerCase().toCharArray();

        for(int i=0; i < x.length; i++){
            if(x[i] != 'a' && x[i] != 'e' && 
            x[i] != 'i' && x[i] != 'o' && 
            x[i] != 'u')
                System.out.print(args[0].charAt(i));
        }
        System.out.println();
    }
}
