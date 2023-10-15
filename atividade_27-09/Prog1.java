import java.util.Scanner;

/*

Faça uma aplicação que gere uma mensagem criptografada
para uma mensagem digitada pelo usuário.
O usuário deve primeiro digitar a mensagem a ser 
criptografada.
O usuário em seguida deve digitar um caracter que 
deverá substituir todas as vogais da mensagem digitada
e reapresentar a mensagem cripografrada na tela;
Ex: 
usuário digitou: Instituto Federal do Tocantins
caracter digitado: &
*/
public class Prog1{
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        String msg;

        System.out.print("Mensagem: ");
        msg = dd.nextLine();

        System.out.print("Semente: ");
        char sm = dd.next().charAt(0);

        int tamMsg = msg.length(); //tamanho da mensagem
        char c[] = msg.toLowerCase().toCharArray();

        String msgCrip="";

        for(int i=0; i < tamMsg; i++){
            if(c[i] == 'a' || c[i] == 'e' ||
               c[i] == 'i' || c[i] == 'o' ||
               c[i] == 'u' )
                msgCrip += sm;
            else
                msgCrip += msg.charAt(i);
        }
        System.out.println("Mensagem criptografada: "+msgCrip);

    }
}