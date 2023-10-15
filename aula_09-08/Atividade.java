import java.util.Scanner;

/*
Faça um programa que o solicite o usuário a digitar
- um dado do tipo byte
- um dado do tipo short
- um dado do tipo int
- um dado do tipo long
- um dado do tipo float
- um dado do tipo double
- um dado do tipo char

E depois apresente os dados digitados na tela. 
*/

public class Atividade{
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        byte b; short s; int i; long l; float f;
        double d; char c;

        System.out.print("Digite um dado do tipo byte: ");
        b = dd.nextByte();
        System.out.print("Digite um dado do tipo short: ");
        s = dd.nextShort();
        System.out.print("Digite um dado do tipo int: ");
        i = dd.nextInt();
        System.out.print("Digite um dado do tipo long: ");
        l = dd.nextLong();
        System.out.print("Digite um dado do tipo float: ");
        f = dd.nextFloat();
        System.out.print("Digite um dado do tipo double: ");
        d = dd.nextDouble();
        System.out.print("Digite um dado do tipo char: ");
        c = dd.next().charAt(0);

        System.out.println("O valor de b == "+b);
        System.out.println("O valor de s == "+s);
        System.out.println("O valor de i == "+i);
        System.out.println("O valor de l == "+l);
        System.out.println("O valor de f == "+f);
        System.out.println("O valor de d == "+d);
        System.out.println("O valor de c == "+c);
        

    }
}