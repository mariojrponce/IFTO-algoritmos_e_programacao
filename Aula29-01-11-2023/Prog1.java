import java.util.Scanner;

/*
Altere o programa Prog2.java da última aula, alterando 
todos os métodos para métodos de objeto
e os métodos devem ser:
sem parâmetros e sem retorno
Obs: não pode ser utilizado atributos de classe
na resolução desse problema
*/
public class Prog1 {
    String nome;
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        Prog1 obj = new Prog1();
        System.out.print("Nome: ");
        obj.nome = dd.next(); //nm = "ifto"

        obj.metodo1();  //nm = "Ifto"
        System.out.println(obj.nome); 
        obj.metodo2();
        System.out.println(obj.nome);
    }

    public void metodo2(){
        String c="", v="";
        char vogal[]={'a','A','e','E','i','I','o','O','u','U'};
        for(int i=0; i < nome.length(); i++){
            char car = nome.charAt(i);
            boolean sit = false; //sit == true => vogal e false=consoante
            for(int j=0; j< vogal.length; j++){
                if(car == vogal[j]){
                    sit = true;
                    break;
                }    
            }
            if(sit)
                v +=car; //"Io"
            else
                c +=car; //"ft"
        }
        nome = c+v;
        
    }
    public void metodo1(){
        String res ="";  //nome = ifto
                          //'i' -> 105
        res += (char)(nome.charAt(0) -32);

        for(int i=1; i< nome.length(); i++)
            res += nome.charAt(i);
        nome = res;
    }
}
