import java.util.Scanner;

/*
Faça um programa que ao receber um número inteiro
positivo imprima na tela todos os números primos 
inferiores ao número informado.
*/
public class Prog2 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        int num;

        while(true){ //laço infinito
            System.out.print("Digite o número: ");
            num = dd.nextInt();
            if(num <=0){
                System.out.println("Número inválido.");
                continue; //voltar ao inicio do laço
            }
            break; //sair do laço
        }

        if(num <=3){
            System.out.println("Números primo:");
            for (int i = 1; i < num ; i++) {
                System.out.println(i);
            }
            return;
        }

        System.out.println("Os números primos: ");
           //num =15
             // i= 7
        for (int i = num-1; i > 2; i--) {
            
                 //3
            int div = i/2; //até onde vou tentar dividir num
            boolean sit=true; //a principio num é primo
            for(int j=2; j <=div; j++){
                if(i % j == 0){ //se true é divisível
                    
                    sit = false;
                    break;
                }
            }
            if(sit)
                System.out.println(i);
        }
        System.out.println("2\n1");
    }
}
