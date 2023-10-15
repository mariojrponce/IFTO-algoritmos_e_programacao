import java.util.Scanner;

/*
Faça um programa que limite a quantidade de caracteres 
de um texto a ser digitado pelo usuario. Se o usuario 
digitar mais do que o numero estipulado de caracteres
que o seu programa avise a ele e armazene apenas a 
quantidade de caracteres informada.

Ex:
Digite apenas 5 caracteres: abcdefghij
Mensagem gravada: abcde 
*/
public class Atividade{
    public static void main(String[] args) {
        String pl;
        Scanner dd = new Scanner(System.in);
        System.out.print("Digite uma palavra de "+
                        "no máximo 10 caracteres: ");
        
        pl = dd.nextLine().substring(0, 10);
        System.out.println("Dado armazenado: "+pl);        
    }
}