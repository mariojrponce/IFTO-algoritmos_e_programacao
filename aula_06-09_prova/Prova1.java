/*
 * Faça um programa no qual o usuário digita um número inteiro em uma variável chamada segredo.
 * O programa deverá adivinhar o valor digitado sem explicitamente visualizar o valor da variável.
 * Assim não é permitido fazer uso de System.out.println(segredo) para imprimir o resultado.
 * O programador deverá fazer questionamentos à variável sem em momento 
 * algum fazer cópia do conteúdo da variável segredo. Ao fim desses questionamentos o programa
 * poderá deduzir qual foi o valor digitado. (VALE 6 PONTOS)
 * 
 * Regras:
 * - o valor a ser digitado deve estar entre 0 até 999.
 */
import java.util.Scanner;

public class Prova1{
    public static void main(String[] args) {
        
        System.out.print("Digite o número segredo: ");
        int seg = new Scanner(System.in).nextInt();

        if(seg <0 || seg >= 1000){
            System.out.println("Número inválido");
            return;
        }
        int c=0, d=0, u=0;
        if(seg >= 100){
            c = seg/100;
            if(seg % 100 > 10)
                d = (seg % 100)/10;   
        }else{
            if(seg >= 10)
                d = (seg % 100)/10; 
        }
        
        if(seg %2 == 0)
            if(seg == (c*100 + d * 10 +2))
                u = 2;
            else 
                if(seg == (c*100 + d * 10 +4))
                    u = 4;
                else 
                    if(seg == (c*100 + d * 10 +6))
                        u = 6;
                    else 
                        if(seg == (c*100 + d * 10 +8))
                            u = 8;
         
            if(seg == (c*100 + d * 10 +1))
                u = 1;
            else 
                if(seg == (c*100 + d * 10 +3))
                    u = 3;
                else 
                    if(seg == (c*100 + d * 10 +5))
                        u = 5;
                    else 
                        if(seg == (c*100 + d * 10 +7))
                            u = 7;
                        else 
                            if(seg == (c*100 + d * 10 +9))
                                u = 9;    
        System.out.println("O valor digitado foi: "+c+d+u);
    }
}