import java.util.Scanner;

//Exemplo de switch-case
//Descobrir se o número digitado foi 4 ou 5
public class Prog4 {
    public static void main(String[] args) {
        
        System.out.print("Numero: ");
        switch(new Scanner(System.in).nextInt()){
            case 4:
                System.out.println("Número 4 digitado");
                break;
            case 5:
                System.out.println("Número 5 digitado.");
                break;
            default:
                System.out.println("Não foi digitado 4 ou 5");
        }
    }
}
