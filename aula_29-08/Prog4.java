import java.util.Scanner;

/*
Faça um programa no qual o usuário digite dois números 
e o programa java deve apresentar um menu, para que o
 usuário escolha uma das seguintes opções: (VALE 4,5 PTS)

Menu:
1 - Somar
2 - Subtrair
3 - Multiplicar

 4 - Dividir

O programa deverá apresentar o resultado da operação
 solicitada. Se o usuário digitar como opção um número
  diferente de 1 a 4 o programa deverá informar que a 
  opção é inválida e programa será encerrado. 
*/
public class Prog4 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        float n1, n2, total;
        int op;

        System.out.print("Menu:\n1- Somar\n2-Subtrair\n"+
                        "3- Multiplicar\n4-Dividir\nOpção: ");
        op = dd.nextInt();
        if(op < 1 || op > 4){
            System.out.println("Opção inválida.");
            return;
        }
        System.out.print("Valor1: ");
        n1 = dd.nextFloat();

        System.out.print("Valor2: ");
        n2 = dd.nextFloat();

        if(op == 1)
            total = n1 + n2;
        else
            if(op == 2)
                total = n1 - n2;
            else 
                if(op == 3)
                    total = n1 * n2;
                else 
                    total = n1 / n2;
        
        System.out.printf("Resultado: %.1f\n",total);
    }
}
