import java.util.Scanner;

/*
Faça um programa que ao receber um número inteiro
positivo processe o número para descobrir se ele
é primo.  
*/
public class Prog1 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        int num;

        while(true){
            System.out.print("Digite o número: ");
            num = dd.nextInt();
            if(num <=0){
                System.out.println("Número inválido.");
                continue;
            }
            break; //sair do laço1
        }

        if(num <=3){
            System.out.println("É número primo.");
            return;
        }

        int div = num/2; //até onde vou tentar dividir num
        boolean sit=true; //a principio num é primo
        for(int i=2; i <=div; i++){
            if(num % i == 0){ //se true é divisível
                sit = false;
                break;
            }
        }

        if(sit){
            System.out.println("É um número primo");
        }else 
            System.out.println("Não é primo");

    }
}
