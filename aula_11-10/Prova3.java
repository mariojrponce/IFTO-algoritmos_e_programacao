import java.util.Scanner;

/*
 * Faça um programa que ao receber uma frase a ser informada pelo usuário e apresenta a frase com as palavras em ordem 
 * decrescente, ou seja, da direita para a esquerda.
 * 
 * Exmemplo:
 * Entrada: Hoje teremos prova.
 * Saída: prova. teremos Hoje
 * 
 * Entrada Hoje
 * Saida: Hoje
 * 
 * Entrada: Hojeteremosprova.
 * Saída: Hojeteremosprova.
 
 * 
 * OBS: NÃO PODE USAR MÉTODOS PRONTOS QUE JÁ FAÇAM A APRESENTAÇÃO DA MENSAGEM AO CONTRÁRIO
 */

public class Prova3{
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        System.out.print("Informe uma frase: ");
        String frase = dd.nextLine();

        int p=0;

        System.out.print("Resultado: ");
        for(int i= frase.length() -1; i >=0;  i--){
            if(frase.charAt(i) == ' ' && frase.charAt(i-1) != ' '){
                if(p==0){
                    System.out.print(frase.substring(i+1));
                    p=i;
                }
                else{
                    System.out.print(frase.substring(i, p));
                    p=i;
                }
            }
            if(i==0 && p !=0)
                System.out.print(" "+ frase.substring(i, p));
            
            if(i==0 && p ==0)
                System.out.print(frase);
        }
       
        System.out.println();
    }
}