/*
 * Faça um programa no qual o usuário digite a sigla do estado e o seu programa 
 * deverá apresentar o nome do estado.
    Ex: To  => Tocantins
 */

import java.util.Scanner;

public class Atv{
     public static void main(String[] args) {
        System.out.println("Digite a sigla de um estado brasileiro: ");
        String entrada = new Scanner(System.in).next();

      //Verifica se tem apenas 2 caracteres
        if(entrada.length() != 2){
            System.out.println("Palavra nao possui 2 caracteres.");
            return; //encerrar o método
        }

      //Converte tudo para maiuculo
         System.out.println(entrada.toUpperCase());
      
         
}