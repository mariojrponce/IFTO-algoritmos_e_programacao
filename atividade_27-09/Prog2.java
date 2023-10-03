/*
Faça um programa que analise um vetor do tipo inteiro
para verificar se existem números repetidos no vetor 
*/
public class Prog2 {
    public static void main(String[] args) {

        int x[] = {20,10,100,20,10};

        int tamX = x.length;
        boolean repetido = false; // Variável para indicar se há números repetidos

        for(int i=0; i < tamX; i++){
            for(int j = i+1; j < tamX; j++){
                if(x[i] == x[j]){ // Se houver um número repetido
                    repetido = true; // Definir a variável repetido como true
                    System.out.println("Existem valores repetidos: " + x[i]); // Exibir o valor repetido
                }
            }
        }
        
        if(!repetido)
            System.out.println("Não existem números repetidos"); // Se não houver números repetidos, exibir mensagem correspondente
    }
}
