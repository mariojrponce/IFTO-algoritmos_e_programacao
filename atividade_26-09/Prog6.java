/*
 * Uso do for de forma mais elegante
 * foreach
 */
public class Prog6 {
    public static void main(String[] args) {
        int x[] = {10, 20, 30, 40};

        //visualizar todos os elementos do vetor
        for(int i=0; i < x.length; i++)
            System.out.println(x[i]);
        
        //Usando foreacch
        System.out.println("FOREACH");
        for(int j: x)
            System.out.println(j);
    }
}
