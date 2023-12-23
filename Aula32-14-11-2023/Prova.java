//PROVA VALENDO 4
import java.util.Scanner;


public class Prova{

    public static void metodo1(int x[]){
        for(int y: x){
            if(y % 2 == 0)
                System.out.println(y);
        }
    }

    public void metodo3(int x[]){
        for(int y: x){
            if(y % 10 == 0)
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

            switch(op){
                case 1:
                    //metodo1  (método de classe da classe Prova)
                    metodo1(x);
                    break;
                case 2:
                    //metodo2 (método de classe) - pertencente a classe diferente da classe Prova
                    Teste.metodo2(x, dd);
                    break;
                case 3:
                    //metodo3 (método de objeto da classe Prova) - pertencente a a classe do método1
                    new Prova().metodo3(x);
                    break;
                case 4:
                    return;
            }
        }
        
    }
}

class Teste{
    public static void metodo2(int x[], Scanner dd){
        int ini, fim;
        System.out.print("Inicio do intervalo: ");
        ini =  dd.nextInt();
        System.out.print("Fim do intervalo: ");
        fim =  dd.nextInt();

        for(int y: x){
            if(y >= ini && y <= fim)
                System.out.println(y);
        }
    }
}