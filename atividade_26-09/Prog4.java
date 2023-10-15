import java.util.Scanner;

/*
Faça um programa solicitando que o usuário digite uma 
palavra ou frase e depois reapresente a palavra sem as 
vogais
Ex: Campus Palmas
Res: Cmps Plms 
*/
public class Prog4 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        
        System.out.print("Plavra/frase: ");
        String fr = dd.nextLine(); //Campus Palmas
        char fr2[] = fr.toLowerCase().toCharArray(); //campus palmas
        int tamFr = fr2.length;
        for(int i=0; i< tamFr; i++){
            if(fr2[i] != 'a' && fr2[i] != 'e'&&
            fr2[i] != 'i' && fr2[i] != 'o' &&
            fr2[i] != 'u')
                System.out.print(fr.charAt(i));
        }
        System.out.println();
    }    
}
