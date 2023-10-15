import java.util.Scanner;

//Usando métodos do objeto string
//Transformar um texto de minusculo para maiusculo
public class Prog4 {
    public static void main(String[] args) {
        String var;
        Scanner dd = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        var = dd.next();

        System.out.println("TRANSFORMANDO PARA MAISUCULA");
        System.out.println(var.toUpperCase());

        System.out.println(var);

        var = var.toUpperCase();

        System.out.println(var);
    }
}
