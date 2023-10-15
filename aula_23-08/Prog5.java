import java.util.Scanner;

/*
Faça um programa que crie uma variável
e atribua um valor inteiro a essa variável, sendo esse
valor informado pelo usuário.

Crie uma outra variável chamada y.
Se o valor digitado pelo usuário for:
<=10 atribua 0 a y
>10 e menor ou igual 20 atribua 1 a y
Se > 20 atribua 2 a y
FAÇA O PROGRAMA USANDO O OPERADOR TERNARIO ?:
*/
public class Prog5 {
    public static void main(String[] args) {
        int x, y;

        System.out.print("Informe um número: ");
        x = new Scanner(System.in).nextInt();

        /* 
        if(x <=10)
            y =0;
        else
            if(x >10 && x<=20)
                y=1;
            else 
                y=2;
        */
        y = (x <=10)?0:(x >10 && x<=20)?1:2;
        System.out.println("O valor de y == "+y);


    }

}
