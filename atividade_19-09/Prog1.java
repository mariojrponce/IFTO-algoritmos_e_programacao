//Exemplo de criação de vetores
public class Prog1 {
    
    public static void main(String[] args) {
        int x[]; //criando uma variável que esperar receber um endereço de um vetor do tipo int
        int y[] = {10,20,30}; //criando um vetor de 3 posições e já inicializando
        double z[] = new double[4]; //criando um vetor de 4 posiçoes do tipo double e guardando o endereço em z
    
        System.out.println(y[2]);
        System.out.println(z[2]);

        x = y; //x e y passam a apontar para o mesmo vetor
        System.out.println(x[0]);
        x[0] = 11;
        System.out.println(y[0]);
    }
}
