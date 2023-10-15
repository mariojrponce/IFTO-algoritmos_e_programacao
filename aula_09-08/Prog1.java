//Exemplo de como substituir um dado de uma variável
public class Prog1 {
    public static void main(String[] args) {
        int x =10;

        x = 30;

        System.out.println("O valor de x = "+x);

        //Obs: ao atribuir um dado a um variável que já 
        //possui um valor, o valor anteior é subtituído
        //pelo valor novo e o programa não consegue
        //mais ter acesso ao valor anterior
    }
}
