import java.util.Scanner;

/*
Faça um programa no qual o usuário digite dois números e
o programa java deve apresentar um menu, para que o 
usuário escolha uma das seguintes opções:
 * Menu:
 * 1 - Somar
 * 2 - Subtrair
 * 3 - Multiplicar
 * 4 - Dividir
 * 5 - Sair
O programa deverá apresentar o resultado da operação 
solicitada. Se o usuário digitar como opção um número
diferente de 1 a 5 o programa deverá informar que a 
opção é inválida e pedir para o usuário digitar uma 
opção válida. A calculadora só será encerrada quando 
o usuário pedir a opção 5. Portanto o usuário pode
fazer quantas operações desejar. 
*/

public class Atividade{

    public static void main(String[] args) {
        String menu = "Menu\n"+
        "1 - Somar\n"+
        "2 - Subtrair\n"+
        "3 - Multiplicar\n"+
        "4 - Dividir\n"+
        "5 - Sair\n"+ 
        "Opção: ";
        Scanner dd = new Scanner(System.in);
        for(;;){ //laço infinito
            System.out.print(menu);
            int op = dd.nextInt();

            if(op < 1 || op > 5){
                System.out.println("Opção inválida.");
                continue; //volta a testar o laço
            }else
                if(op == 5)
                    break; //sair do laço

    
            float n[] = new float[2];
            for(int i=0; i<2; i++){
                System.out.print("Operador"+(i+1)+": ");
                n[i] = dd.nextFloat();
            }
            switch(op){
                case 1:
                    System.out.println(n[0] + " + " + n[1] + " == "+(n[0] + n[1]));
                    break;
                case 2:
                    System.out.println(n[0] + " - " + n[1] + " == "+(n[0] - n[1]));
                    break;
                case 3:
                    System.out.println(n[0] + " * " + n[1] + " == "+(n[0] * n[1]));
                    break;
                case 4:
                    System.out.printf("%.1f / %.1f == %.1f\n",n[0], n[1], n[0]/n[1]);
                    break;
            }
        }
    }
}