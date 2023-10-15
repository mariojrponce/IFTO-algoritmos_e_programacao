import java.util.Scanner;

/*
Alterar o primeiro caracter da palavra digitada 
pelo usuário para maisculo 
*/
public class Prog5 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        String pl;

        System.out.print("Palavra: ");
        pl = dd.next();   //ifto
                   
        int x = pl.charAt(0) - 32;
        String n = pl.substring(1, pl.length());
        System.out.println((char)x + n);

    }
}
