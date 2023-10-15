import java.util.Scanner;

/*
Faça um programa para decompor um número maior que 
0 e inferior a 100.
Exemplo:
Número 23
Resultado 20 + 3 
*/
public class Prog2 {
    public static void main(String[] args) {
        System.out.print("Número: ");
        int num = new Scanner(System.in).nextInt();
        int d=0, u=0;
        d = num / 10;
        u = num % 10;

        System.out.println("Resultado: "+(d*10) +" + " +u);
        
    }
}
