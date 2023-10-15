import java.util.Scanner;

/*
Faça um programa no qual o usuário digite
3 números inteiro e o programa deverá informar o 
maior e o menor

Usar vetor e laço
*/
public class Prog6 {
    public static void main(String[] args) {
        int res[] = new int[2]; //guardar o menor e maior valor
        //res[0] = maior res[1] = menor
        int n[] = new int[1000]; //números digitados
        Scanner dd = new Scanner(System.in);

        for(int i=0; ;i++){
            System.out.print("Número["+i+"] ");
            n[i] = dd.nextInt();
            if(i==0){
                res[0] = n[i];
                res[1] = n[i];
            }else{
                if(n[i] > res[0])
                    res[0] = n[i];
                if(n[i] < res[1])
                    res[1] = n[i];
            }
            System.out.print("Continuar(1-Sim/2-Não): ");
            int op = dd.nextInt();
            if(op == 2)
                break;
        }

        System.out.println("Maior: "+res[0]);
        System.out.println("Menor: "+res[1]);
    }
}
