import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

/*
1. Faça um programa Java que determine quantos dígitos 
tem um número inteiro positivo digitado pelo usuário. 
Precisão de até 9 dígitos. (VALE 6,0 PTS) 
*/
public class Prog1{
    public static void main(String[] args) {
        int num, cont=0;

        System.out.print("Digite um número: ");
        num = new Scanner(System.in).nextInt();
        if (num <= 9)
            cont =1;
        else 
            if(num >=10 && num <= 99)
                cont =2;  
            else 
                if(num >=100 && num <=999)
                    cont =3;
                else 
                    if(num >=1000 && num <=9999)
                        cont =4;
                    else 
                        if(num >=10000 && num <=99999)
                            cont =5;
                        else 
                            if(num >=100000 && num <=999999)
                                cont =6;
                            else 
                                if(num >=1000000 && num <=9999999)
                                    cont =7;
                                else 
                                    if(num >=10000000 && num <=99999999)
                                        cont =8;
                                    else 
                                        if(num >=100000000 && num <=999999999)
                                            cont =9;
                                    
                System.out.println(num + " possui " + cont + " digitos");                    
    }
}