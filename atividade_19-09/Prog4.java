//Exemplo de como criar um vetor do tipo char a partir
//de uma string
//E como criar uma string a partir de um vetor de char
public class Prog4 {
    public static void main(String[] args) {
        String x = "IFTO";

        char y[] = x.toCharArray();

        System.out.println(x); //IFTO
        System.out.println(y); //IFTO
        y[0] = 'D';
        System.out.println(x); //IFTO
        System.out.println(y);//DFTO

        //Criando uma String através de um vetor de caracteres
        String z = new String(y);
        System.out.println(z);
    }
}
