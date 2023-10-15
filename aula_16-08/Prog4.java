import java.util.Scanner;

/*
Faça um programa no qual o usuário digite dois valores
inteiros e o seu programa deverá informar se os números
são iguais e se não forem qual é o maior dos números 
digitados. 
*/
public class Prog4 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        int x, y;

        System.out.print("Valor1: ");
        x = dd.nextInt();
        System.out.print("Valor2: ");
        y = dd.nextInt();

        if(x == y){
            System.out.println("Os valores são iguais.");
        }else{
            if(x > y)
                System.out.println(x + " é maior que "+ y);
            else    
                System.out.println(y + " é maior que "+ x);
        }
    }
}
