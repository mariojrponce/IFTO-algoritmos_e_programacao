/*
Crie um vetor de inteiros de 3 posições já preenchendo
durante o processo criação.
Crie um segundo vetor de mesmo tipo e tamanho e copie
os dados do primeiro vetor para o segundo
Imprima os dados do segundo vetor na tela 
*/
public class Prog3 {
    public static void main(String[] args) {
        int x[] = {10,20,30};
        int y[] = new int[3];

        y[0] = x[0];
        y[1] = x[1];
        y[2] = x[2];

        x[0] = 50; //veja que o y[0] nao será alterado
        System.out.println(y[0] + " "+y[1] + " "+y[2]);
        
    }
}
