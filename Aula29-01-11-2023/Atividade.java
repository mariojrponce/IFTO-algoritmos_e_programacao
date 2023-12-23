import java.util.Scanner;

/*
Faça um programa java no qual o usuário digite uma frase,
via instrução contida no método main, e essa frase deve
obrigatoriamente ser armazenada em um vetor de char.

O método main também deve apresentar um menu de opções
com as seguintes opções:

1 - Retorna quantas palavras tem na frase (método1)
2 -Retorna a frase escrita de traz para frente, 
como se fosse, um espelho(método2)
3- Retornar qual a maior palavra contida na frase 
digitada no método main(método3)
4 - Retornar qual a maior palavra contida na frase
produzida pelo método2(método4)
5 - Sair do programa

obs:
metodo1 deve ser um método de objeto pertencente a 
mesma classe do método main

método2 deve ser um método de classe pertencente a uma 
classe diferente do método main

método3 deve ser um método de objeto pertencente a uma 
classe diferente da classe do método main e do método2

Método 4 deve ser um método de classe pertencente a 
mesma classe do método3.
*/
public class Atividade{
      
    
    public int metodo1(char fr[]){
        int cont=0;
        for(int i=0; i < fr.length; i++){
            if(fr[i] == ' ')
                cont++;
        }
        return cont+1;
    }
    public static void main(String[] args) {
        String menu = "1 - Quanta palavras tem na frase\n"+
                      "2 - Mostrar a frase de tras para frente\n"+
                      "3 - Maior palavra da frase\n"+
                      "4 - Maior palavra da frase gerada pela opção2\n"+
                      "5 - Sair do programa\n"+
                      "Opção: ";
        
        
        Scanner dd = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        char fr[] = dd.nextLine().toCharArray();
        int op;
        String ret="";
        while(true){ //laço infinito
            System.out.print(menu);
            op = dd.nextInt();
            
            switch(op){
                case 1:
                    Atividade obj = new Atividade();
                    int c = obj.metodo1(fr);
                    System.out.println("Na frase exite "+c +" palavras.");
                    break;
                case 2:
                    ret = Classe2.metodo2(fr);
                    System.out.println(ret);
                    break;
                case 3:
                    String ret2;
                    ret2 = new Classe3().metodo3(fr);
                    System.out.println("Maior palavra: "+ret2);
                    break;
                case 4:
                    String ret3 =Classe3.metodo4(ret);
                    System.out.println("Maior palavra: "+ret3);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}

class Classe2{
    public static String metodo2(char fr[]){
        String s="";
        for(int i=fr.length-1; i>=0; i--)
            s +=fr[i];
        return s;
    }
}

class Classe3{
    public String metodo3(char fr[]){
        String x1="", x2="";
        for(int i=0; i < fr.length; i++){ //i=5 < 18
            if(i==0){
                x1+=fr[i]; //x1 ="ifto"
                continue;
            }else{
                if(fr[i] != ' '){ 
                    x1 +=fr[i]; //x1 = "palmas"
                    continue;
                }else{
                    if(x1.length() > x2.length()){
                        x2 = x1;
                        x1="";
                    }else{
                        x1 ="";
                    }
                }
            }
        }
        if(x1.length() > x2.length())
            x2 = x1;
        return x2;
       

    }

    public static String metodo4(String x){
        Classe3 obj = new Classe3();
        String ret = obj.metodo3(x.toCharArray());
        return ret;
    }
}