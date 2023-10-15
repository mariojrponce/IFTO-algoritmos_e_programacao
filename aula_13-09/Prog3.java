/*
Exemplo de criar uma string a partir de outra string 
*/
public class Prog3 {
    public static void main(String[] args) {
        String nome = "Instituto Federal do Tocantins.";

        System.out.println(nome);
        System.out.println("A string nome possui "+
        nome.length() + " caracteres.");

        //Criando uma substring
        //Copie a partir do décimo caracter até o final
        String n2 = nome.substring(10);
        System.out.println(n2);

        //Criando uma string a partir de um intervalo
        String n3 = nome.substring(0, 10);
        System.out.println(n3);
        
    }
}
