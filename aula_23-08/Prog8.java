import java.util.Scanner;

/*
2. Faça um programa que ao receber três números
 inteiros, digitados pelo usuário,  informe qual é o 
 maior e qual é o menor deles.  
*/
public class Prog8 {
    public static void main(String[] args) {
        int n1,n2,n3,ma,me;
        Scanner dd = new Scanner(System.in);

        System.out.print("N1: ");
        n1 = dd.nextInt();
        ma = n1;
        me = n1;

        System.out.print("N2: ");
        n2 = dd.nextInt();
        if(n2 > ma)
            ma = n2;
        
        if(n2 < me)
            me = n2;

        System.out.print("N3: ");
        n3 = dd.nextInt();
        if(n3 > ma)
            ma = n3;
    
        if(n3 < me)
            me = n3;
        
        System.out.println("Maior: "+ma + " Menor = "+me);
    }    
}
