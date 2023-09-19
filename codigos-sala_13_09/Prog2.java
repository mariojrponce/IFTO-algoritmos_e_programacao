import java.util.Scanner;

/*
Faça um programa que receba uma palavra de exatamente
4 caracteres e reapresente a palavra com o primeiro
caracter em maisuculo.
Ex: ifto -> Ifto 
*/
public class Prog2 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        String pl;

        System.out.print("Digite uma palavra: ");
        pl = dd.next(); //ifto

        if(pl.length() != 4){
            System.out.println("Palavra nao possui 4 caracteres.");
            return; //encerrar o método
        }

        // 0 1 2 3
        // i f t o
        //   I   <= (char)  73  <= i =105    -32
        char y = (char) (pl.charAt(0) - 32);
        pl =""+y+pl.charAt(1)+pl.charAt(2)+pl.charAt(3);
        System.out.println(pl); //Ifto
    }
}
