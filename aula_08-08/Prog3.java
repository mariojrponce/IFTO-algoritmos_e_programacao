/*
Exemplo de como converter um tipo de dado para outro tipo
A conversão recebe o nome de cast 
*/
public class Prog3 {
    public static void main(String[] args) {
        byte x = 4; //byte reserva 8 bits na memória
        short y = 8192; //short reserva 16 bits na memória
        short a = x; //fazendo uma cópia do valor de x e colocando em a
        //byte b = y; //dá erro porque precisa fazer a conversão (cast)
        byte c = (byte)y;
        System.out.println("O valor de c = "+c);

        double z = 4.1;
        int f = (int)z;
        System.out.println("O valor de f = "+f);

        short d = 3;
        char e = d;

        //Observação tome cuidado para que não haja perda na conversão
    }
}

