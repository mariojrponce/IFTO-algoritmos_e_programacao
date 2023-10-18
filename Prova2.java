import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

/*
Faça um programa que analise uma frase e
 coloque os caracteres da frase em ordem
  alfabética
*/
public class Prova2 {
  public static void main(String[] args) {
    Scanner dd = new Scanner(System.in);
    System.out.print("Palavra/frase: ");
    char fr[] = dd.nextLine().toCharArray();

    for (int i = 0; i < fr.length; i++) {
        if(fr[i] == ' ')
            continue;
        for(int j=i+1; j < fr.length; j++){
            if(fr[j] == ' ')
                break;
            if(fr[i] > fr[j]){
                char c =fr[i];
                fr[i] = fr[j];
                fr[j] = c;
            }
        }
    }
    System.out.println(fr);
  }  
}