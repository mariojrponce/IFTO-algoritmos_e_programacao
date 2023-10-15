import java.util.Scanner;

/*
2. Faça um programa que em tempo de execução seja 
informado a nota de 5 alunos e o programa informe na 
tela:
- a média da turma
- a menor nota 
- a maior nota  
*/
public class Prog3 {
    public static void main(String[] args) {
        float nota, media, maiorNota, menorNota;
        Scanner dd = new Scanner(System.in);

        System.out.print("Nota1: ");
        nota = dd.nextFloat();
        maiorNota = nota;
        menorNota = nota;
        media = nota;

        System.out.print("Nota2: ");
        nota = dd.nextFloat();
        maiorNota = (nota > maiorNota)?nota:maiorNota;
        menorNota = (nota < menorNota)?nota:menorNota;
        media +=nota; //media = media + nota;

        System.out.print("Nota3: ");
        nota = dd.nextFloat();
        maiorNota = (nota > maiorNota)?nota:maiorNota;
        menorNota = (nota < menorNota)?nota:menorNota;
        media +=nota; //media = media + nota;

        System.out.print("Nota4: ");
        nota = dd.nextFloat();
        maiorNota = (nota > maiorNota)?nota:maiorNota;
        menorNota = (nota < menorNota)?nota:menorNota;
        media +=nota; //media = media + nota;

        System.out.print("Nota5: ");
        nota = dd.nextFloat();
        maiorNota = (nota > maiorNota)?nota:maiorNota;
        menorNota = (nota < menorNota)?nota:menorNota;
        media +=nota; //media = media + nota;
        media /=5; //media = media/5

        System.out.printf("Media da turma: %.1f\n",media);
        System.out.printf("Maior nota: %.1f\n", maiorNota);
        System.out.printf("Menor nota: %.1f\n", menorNota);

    }
}
