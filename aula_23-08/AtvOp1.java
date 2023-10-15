import java.util.Scanner;

import javax.xml.transform.Source;

/*
3.Faça um programa que ao receber duas notas 
de um aluno calcule a média e informe se o
aluno foi aprovado, está de recuperação ou 
foi reprovado.
a) para ser aprovado o aluno tem que ter
 media igual ou superior a 6
b) para ficar em recuperação o aluno tem que
ter media superior ou igual a 4 e inferior
 a 6
c) para ficar reprovado o aluno tem que
 possuir media inferior a 4 
*/

public class AtvOp1{
    public static void main(String[] args) {
        double n1, n2, media;
        Scanner dd = new Scanner(System.in);

        System.out.print("Nota1: ");
        n1 = dd.nextDouble();

        System.out.print("Nota2: ");
        n2 = dd.nextDouble();

        media = (n1+n2)/2;
        System.out.printf("Media do aluno %.1f\n",media);
        if(media >= 6)
            System.out.println("Aprovado.");
        else 
            if(media >= 4 && media < 6)
                System.out.println("Recuperação.");
            else 
                System.out.println("Reprovado.");
    }
}