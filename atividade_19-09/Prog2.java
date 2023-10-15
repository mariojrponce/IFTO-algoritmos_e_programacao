import java.util.Scanner;

/*
Faça um programa que crie um vetor do tipo String
de 3 posições.
O usuário deverá preencher o vetor com palavras
via scanner
O programa deverá imprimir os dados do vetor 
*/
public class Prog2 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        String x[] = new String[3];

        System.out.print("Primeira palavra: ");
        x[0] = dd.next();

        System.out.print("Segunda palavra: ");
        x[1] = dd.next();

        System.out.print("Terceira palavra: ");
        x[2] = dd.next();

        System.out.println("DADOS DO VETOR");
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    
        
    }
}
