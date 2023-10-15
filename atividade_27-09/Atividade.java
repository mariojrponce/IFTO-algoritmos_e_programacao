/*
Prog2
Faça um programa que analise um vetor do tipo inteiro
para verificar se existem números repetidos no vetor 

Altere o Prog2.java de forma que ele me apresente quais 
números se encontra repetidos dentro de vetor.
Obs. Pode existir vários grupos de repetidos no vetor
int x[] = {20,10,100,20,10};
Existem repetidos o 10 e o 20 no vetor
*/
public class Atividade {
    public static void main(String[] args) {
                 //0  1  2  3  4
        int x[] = {20,10,20,20,10};  //20B

        int tamX = x.length;
        int cont =0; //2
        //  i=2      1 < 5
        for(int i=0; i < tamX; i++){
              //      
            for(int j = i+1; j < tamX; j++){
                //  x[1] == 10  x[4] = 10
                if(x[i] == x[j]){
                    cont++;
                    System.out.println(x[i] + " está repetido no vetor.");
                    break;
                }
            }
        }
        if(cont == 0)
            System.out.println("Não existem números repetidos");
    }
}