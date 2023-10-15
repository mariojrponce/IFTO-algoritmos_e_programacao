import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

/*
Faça um programa para decompor um número maior que 
0 e inferior a 100.
Exemplo:
Número 23
Resultado 20 + 3 
*/
public class Prog3 {
    public static void main(String[] args) {
        System.out.print("Número: ");
        int num = new Scanner(System.in).nextInt();
        int d=0, u=0;
        
        d = (num >=90)?9:(num >=80)?8:(num >=70)?7:
        (num >=60)?6:(num >=50)?5:(num >=40)?4:
        (num >=30)?3:(num >=20)?2:(num >=10)?1:0;

        if(num%2==0){
            if(d*10+0 == num)
                u =0;
            else 
                if(d*10+2 == num)
                    u =2;
                else 
                    if(d*10+4 == num)
                        u =4;
                    else 
                        if(d*10+6 == num)
                            u =6;
                        else 
                            u =8;
        }else{
            if(d*10+1 == num)
                u =1;
            else 
                if(d*10+3 == num)
                    u =3;
                else 
                    if(d*10+5 == num)
                        u =5;
                    else 
                        if(d*10+7 == num)
                            u =7;
                        else 
                            u =9;

        }

        System.out.println("Resultado: "+(d*10) +" + " +u);
        
    }
}
