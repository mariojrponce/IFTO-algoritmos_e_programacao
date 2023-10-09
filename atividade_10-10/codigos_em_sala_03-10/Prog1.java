/*
Exemplo de laços:
for, while e do-while 
*/
//Imprimir de 1 a 5
public class Prog1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("For: "+i);
        }

        int j=0;
        while(j < 5){
            System.out.println("While: "+j);
            j++;
        }

        int t=0;
        do{
            System.out.println("Do-While: "+t);
            t++;  
        }while(t < 5);
    }
}
