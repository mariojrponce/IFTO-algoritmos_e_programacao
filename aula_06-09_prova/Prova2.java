/*
Faça um programa no qual o usuário deverá informar o salário bruto de um funcionário.
Através dessa entrada o programa deverá mostrar um extrato com os descontos dos tributos 
até apresentar o salário líquido

Ex.
Salário Bruto : 12000
INSS - 11% sobre o salário Bruto
IR - 27,5% sobre que o excede 2.500,00 
Salário Liquido = Salario Bruto - INSS - IR

Classifique a funcionário conforme a renda;
Classe A - salário liquido igual pu superior a 22.000
Classe B - de 7.100 e inferior a 22.000
Classe C - de 2.900 e inferior a 7.100
classe D - de 1.048 e inferior a 2.900
classe E - inferior a 1048

*/

import java.util.Scanner;

public class Prova2 {
    public static void main(String[] args) {
        double salBruto, salLiq, inss, ir;

        System.out.print("Salário Bruto: ");
        salBruto = new Scanner(System.in).nextDouble();
        inss = salBruto * 0.11;
        ir = (salBruto - 2500) * 0.275;
        salLiq = salBruto - inss - ir;
        
        System.out.println("#####EXTRATO#####");
        System.out.printf("Salário Bruto: R$ %.2f\t\t\n",salBruto);
        System.out.printf("INSS ( -11): R$ %.2f\t\t\n",inss);
        System.out.printf("Imposto de Renda( -22,5): R$ %.2f\t\t\n",ir);
        System.out.printf("Salário Liquido: R$ %.2f\t\t\n",salLiq);

        if(salLiq >= 22000)
            System.out.println("Classe A");
        else
            if(salLiq >= 7100 && salLiq < 22000)
                System.out.println("Classe B");
            else 
                if(salLiq >= 2900 && salLiq < 7100)
                    System.out.println("Classe C");
                else
                    if(salLiq >= 1047 && salLiq < 2900)
                        System.out.println("Classe D");
                    else 
                        System.out.println("Classe E");
        
    }
}
