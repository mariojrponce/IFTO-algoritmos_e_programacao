import java.util.Scanner;

/*
Faça um programa solicitando que o usuário digite uma 
palavra ou frase e depois reapresente a palavra sem as 
vogais
Ex: Campus Palmas
Res: Cmps Plms 
*/
public class Prog3 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        
        System.out.print("Plavra/frase: ");
        String fr = dd.nextLine(); //Campus Palmas
        String fr2 = fr.toLowerCase(); //campus palmas
        int tamFr = fr.length();
        for(int i=0; i< tamFr; i++){
            if(fr2.charAt(i) != 'a' && fr2.charAt(i) != 'e'&&
            fr2.charAt(i) != 'i' && fr2.charAt(i) != 'o' &&
            fr2.charAt(i) != 'u')
                System.out.print(fr.charAt(i));
        }
        System.out.println();
    }    
}
