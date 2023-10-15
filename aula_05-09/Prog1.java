import java.util.Scanner;

/*
 1. Faça um programa que determine se o conteúdo de um 
 tipo char é:
Número
Pontuação
Vogal minúscula
Vogal maiúscula
Consoante minúscula
Consoante maiúscula
Outro caracter 
*/
public class Prog1{
  public static void main(String[] args) {
    System.out.print("Informe  o caracter: ");
    char x = new Scanner(System.in).next().charAt(0);

    //if(x >= 48 && x <= 57)
    if(x >= '0'  && x <= '9'){
        System.out.println("Número");
        return;
    }
    if(x == '.' || x == ';' || x == '?' ||
    x == '!' || x == ':'){
        System.out.println("Pontuação");
        return;
    }
    if(x >= 'a' && x <= 'z'){
        if(x == 'a' || x == 'e' || x == 'i' ||
        x == 'o' || x == 'u')
            System.out.println("Minúscula e vogal.");
        else
            System.out.println("Minúscula e consoante.");
        return; 
    }

    if(x >= 'A' && x <= 'Z'){
        if(x == 'A' || x == 'E' || x == 'I' ||
        x == 'O' || x == 'U')
            System.out.println("Maiúscula e vogal.");
        else
            System.out.println("Maiúscula e consoante.");
    }else 
        System.out.println("Outro caracter.");
  }  
}