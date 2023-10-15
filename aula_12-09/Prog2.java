import java.util.Scanner;

//Exemplo de criação de Strings
//Programa para digitar o nome do aluno e duas notas
//o programa ao final deverá apresentar o nome do aluno
//e a media
public class Prog2 {
    int x;
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        String nome;
        float n1, n2;

        System.out.print("Informe o nome do aluno: ");
        nome = dd.nextLine();

        System.out.print("Nota1: ");
        n1 = dd.nextFloat();

        System.out.print("Nota2: ");
        n2 = dd.nextFloat();

        System.out.println(nome + ": "+((n1+n2)/2));
    }
}
