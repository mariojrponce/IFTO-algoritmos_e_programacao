//PROVA VALENDO 6
import java.util.Scanner;


public class Prova2{

    public int [] metodo1(int x[]){
        int y[] = new int[x.length];
        for(int i=0, j=0; i< x.length; i++){
            if(x[i] % 2 == 0){
                y[j] = x[i];
                System.out.println(x[i]);
                j++;
            }
        }
        return y;
    }

    public void metodo3(int x[]){
        for(int y: x){
            if(y % 10 == 0 && y !=0)
                System.out.println(y);
        }       
    }
    public static void main(String[] args) {
        int x[]={48,50,74,80,9,13,17,72,21,22,2};

        String menu = "1 - Imprimir apenas números pares.\n"+
                      "2 - Imprimir apenas valores entre x e y.\n"+ //obs. x e y deverá ser informado pelo usuario via scanner ou informado diretamente no código no método main
                      "3 - Imprimir apenas os números com terminação 0\n"+
                      "4 - Sair\n"+
                      "Opção: ";
        int op;
        Scanner dd = new Scanner(System.in);
        while(true){
            System.out.print(menu);
            op = dd.nextInt();
            Prova2 obj = new Prova2();

            switch(op){
                case 1:
                   //metodo1  (método de objeto da classe Prova2) - deve retornar o resultado para o objeto main
                    x = obj.metodo1(x);
                    break;
                case 2:
                    //metodo2 (método de objeto pertencente a uma classe diferente de Prova2)  - fará isso com o dado retornado do método1
                    x = new Teste().metodo2(x, dd);
                    break;
                case 3:
                    //metodo3 (método de objeto da classe Prova2)  - fará isso com o dado retornado de método2
                    new Prova2().metodo3(x);
                    break;
                case 4:
                    return;
            }
        }
        
    }
}

class Teste{
    public int [] metodo2(int x[], Scanner dd){
        int y[] = new int[x.length];
        int ini, fim;
        System.out.print("Inicio do intervalo: ");
        ini =  dd.nextInt();
        System.out.print("Fim do intervalo: ");
        fim =  dd.nextInt();

        for(int i=0, j=0; i< x.length; i++){
            if(x[i] >= ini && x[i] <= fim){
                y[j] = x[i];
                System.out.println(x[i]);
                j++;
            }
        }
        return y;
    }
}