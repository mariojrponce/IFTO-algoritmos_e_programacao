import java.util.Scanner;

/*
Imprima um número de 1 até  número informado pelo
usuário 
*/

public class Prog1{
    public static void main(String[] args) {
       Scanner dd = new Scanner(System.in);
       int num;
       
       System.out.print("Informe um número: ");
       num = dd.nextInt(); //num =5
    
           //i=6     6 <= 5
       for(int i =1; i <=num; i++){
        System.out.println(i);  //1 2 3 4 5
       }
    }
}