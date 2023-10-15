import java.util.Scanner;

public class Atv {
    public static void main(String[] args) {
      
        System.out.print("Digite apenas 5 caracteres: ");
        String texto = new Scanner(System.in).nextLine();
        
        char[] caracteres = new char[5];
        
        for (int i = 0; i < 5; i++) {
            if (i < texto.length()) {
                caracteres[i] = texto.charAt(i);
            } else {
                caracteres[i] = ' ';
            }
        }
        
        String mensagemGravada = new String(caracteres);
        System.out.println("Mensagem gravada: " + mensagemGravada);
    }
}