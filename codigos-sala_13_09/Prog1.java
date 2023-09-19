import java.util.Scanner;

/*
Exemplo de código para transformar caracteres 
para maiúscula ou minúscula.
Se a palavra tiver em maiuscula o sistema devera 
transformar para minsucula e vice-versa
*/

public class Prog1 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        String pl;

        System.out.print("Digite uma palavra: ");
        pl = dd.next(); //ifto

        if(pl.charAt(0) >=97)
            System.out.println(pl.toUpperCase());
        else 
            System.out.println(pl.toLowerCase()); 
    }
}
