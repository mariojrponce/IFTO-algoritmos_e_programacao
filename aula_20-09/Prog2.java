import java.util.Scanner;

/*
Imprima todos os números impares existentes que
são menores que um número a ser informado pelo 
usuario e superior a 0 

Ex> usuario informou 5
1 3
usuario informou 10
1 3 5 7 9
*/
public class Prog2 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        int num;
        
        System.out.print("Informe um número: ");
        num = dd.nextInt(); //num =5

        for (int i = 1; i < num; i++) {
            if(i%2 !=0)
                System.out.println(i);
        }
    }
}
