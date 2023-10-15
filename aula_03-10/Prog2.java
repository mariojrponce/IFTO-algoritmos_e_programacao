//Exemplo e criação de laços infinitos 
//for, while e do-while
public class Prog2 {
    public static void main(String[] args) {
        int i=0;
        for (;;) { //laço infinito
            System.out.println("For: "+i);
            i++;
            if(i == 5)
                break;
        }

        int j=0;
        while(true){ //laço infinito
            System.out.println("While: "+j);
            j++;
            if(j == 5)
                break;
        }

        int t=0 ;
        do{
            System.out.println("Do-While: "+t);
            t++;  
            if(t == 5)
                break;
        }while(true);  //laço infinito
    }
}
