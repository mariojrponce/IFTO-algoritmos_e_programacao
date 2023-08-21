import java.util.Scanner;

/*
Faça um programa no qual o usuário digite um número 
inteiro e o programa deverá falar se ele é par ou impar. 
*/
public class Prog7 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        int num;

        System.out.print("Informe número: ");
        num = dd.nextInt();
        if(num %2 == 0)
            System.out.println(num + " é par");
        if(num %2 != 0)
            System.out.println(num + " é impar");
    }    
}