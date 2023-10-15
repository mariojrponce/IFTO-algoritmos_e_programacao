import java.util.Scanner;

//Faça um programa no qual o usuario digita uma 
//palavra ou frase o programa a reapresente ao contrario
/*
Ex: campus palmas
res: samlap supmac 
*/
public class Prog5 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        System.out.print("Plavra/frase: ");
        char fr[] = dd.nextLine().toCharArray(); 
        for(int i = fr.length -1; i >=0; i--)
            System.out.print(fr[i]);
        
        System.out.println();

        
    }
}
