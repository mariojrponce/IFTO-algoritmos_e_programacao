import java.util.Scanner;

/*
Alterar o primeiro caracter da palavra digitada 
pelo usuário para maisculo 
*/
public class Prog6 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        char pl[];

        System.out.print("Palavra: ");
        pl = dd.next().toCharArray();
                   
        pl[0] = (char)(pl[0] - 32);
        System.out.println(pl);

    }
}
