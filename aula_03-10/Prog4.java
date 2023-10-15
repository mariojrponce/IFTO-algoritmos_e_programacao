import java.util.Scanner;

//Faça um programa que imprima uma palavra a ser 
//informada pelo usuário sem as vogais
public class Prog4 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        System.out.print("Informe uma palavra: ");
        String nm = dd.next();

        char x[] = nm.toLowerCase().toCharArray();

        for(int i=0; i < x.length; i++){
            if(x[i] != 'a' && x[i] != 'e' && 
            x[i] != 'i' && x[i] != 'o' && 
            x[i] != 'u')
                System.out.print(nm.charAt(i));
        }
        System.out.println();
    }
}
