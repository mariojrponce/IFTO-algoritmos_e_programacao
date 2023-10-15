import java.util.Scanner;

/*
1. Faça um programa que receba a idade de uma pessoa 
e mostre na saída em qual categoria ela se encontra: 
0 - 9 -> Criança 
10-14 infantil 
15-17 juvenil 
18-59 adulto
Igual ou superior a 60 idoso
*/
public class Prog1 {
    public static void main(String[] args) {
        int id;

        System.out.print("Digite idade: ");
        id = new Scanner(System.in).nextInt();
        if(id >= 60)
            System.out.println("Idoso.");
        else
            if(id >=18 && id < 60)
                System.out.println("Adulto.");
            else 
                if(id >=15 && id <= 17)
                    System.out.println("Juvenil");
                else 
                    if(id >=10 && id <=14)
                        System.out.println("Infantil.");
                    else 
                        System.out.println("Criança.");

    }
}
