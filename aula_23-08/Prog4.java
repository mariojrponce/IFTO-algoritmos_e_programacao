import java.util.Scanner;

//Exemplo de uso do operador ternároio (:?)
/*
Atribua 4 a Y se o valor digitado pelo usuário for menor
ou igual 4 e 5 se o valor digitado pelo usuário maior
que 4
O valor atribuido pelo usuário será armazenado em x 
*/
public class Prog4 {
    public static void main(String[] args) {
        int x, y;

        System.out.print("Informe um número: ");
        x = new Scanner(System.in).nextInt();
        /* 
        if(x <= 4)
            y = 4;
        else
            y =5;
        */
        
        //refazendo o código com operador ternario :?
        y = (x <=4)?4:5;
        System.out.println("O valor de y == "+y);


    }
}
