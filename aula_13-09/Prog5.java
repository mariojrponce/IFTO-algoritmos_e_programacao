import java.util.Scanner;

//Exemplo de como testar se uma string é igual a outra
public class Prog5 {
    public static void main(String[] args) {
        String a = "Ifto";

        System.out.print("Palavra: ");
        String b = new Scanner(System.in).next();

        if(a == b){
            System.out.println("iguais.");
        }else
            System.out.println("diferentes.");

        //Forma correta de comparar strings
        if(a.equalsIgnoreCase(b))
            System.out.println("iguais.");
        else
            System.out.println("diferentes.");
    }
}
