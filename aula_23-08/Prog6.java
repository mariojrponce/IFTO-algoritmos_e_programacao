import java.util.Scanner;

/*

Editar
 

1. Um comerciante comprou um produto e quer vendê-lo com
 lucro de 45% se o valor de custo for menor que 20,00; 
 caso contrário, o lucro será de 30%. Entrar com o valor
  do produto e imprimir o valor da venda.  
*/
public class Prog6 {
    public static void main(String[] args) {
        double valorCusto, valorVenda;

        System.out.print("Informe custo: ");
        valorCusto = new Scanner(System.in).nextDouble();

        if(valorCusto < 20)
            valorVenda = valorCusto * 1.45;
        else
            valorVenda = valorCusto * 1.3;

        System.out.printf("Valor de venda: %.2f\n",valorVenda);
    }
}
