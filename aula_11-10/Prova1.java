
import java.util.Scanner;
/*
Faça um programa que ao receber uma frase a
ser informada pelo usuário, substitua todos 
os espaços vazios por traço. 
*/
public class Prova1{
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        char pl[];

        System.out.print("Palavra/Texto: ");
        pl = dd.nextLine().toCharArray();
        //     012345678
        //pl = helder cleber
        for (int i = 0; i < pl.length; i++) {
            if(pl[i] == ' ')
                pl[i] = '-';
        }
        System.out.println(pl);

    }
}