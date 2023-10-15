/*
Faça um programa que analise um vetor do tipo inteiro
para verificar se existem números repetidos no vetor 
*/
public class Prog3 {
    public static void main(String[] args) {

        int x[] = {20,10,100,30,40};

        int tamX = x.length;
        int cont =0;

        for(int i=0; i < tamX; i++){
            for(int j = i+1; j < tamX; j++){
                if(x[i] == x[j]){
                    cont++;
                    break;
                }
            }
            if(cont !=0){
                System.out.println("Existem valores repetidos");
                break;
            }
        }
        if(cont == 0)
            System.out.println("Não existem números repetidos");
    }
}
