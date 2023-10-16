import java.util.Scanner;

//Exemplos de como criar Strings
public class Prog3 {
    
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        String x = "Ifto";
        String y = new String("Ifto");
        System.out.print("Palavra: ");
        String z = dd.next();
        String t = x;
        String b = "Ifto";
        String c = "Campus";

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        if(x == b)
            System.out.println("x e b são Iguais");
        else 
            System.out.println("x e b Diferentes");
     
        c = "Palmas";
        
        if(x == y)
            System.out.println("x e y são Iguais");
        else 
            System.out.println("x e y Diferentes");
        
        if(x == t)
            System.out.println("x e t são Iguais");
        else 
            System.out.println("x e t Diferentes");

        if(x == z)
            System.out.println("x e z são Iguais");
        else 
            System.out.println("x e z Diferentes");
    }
}
