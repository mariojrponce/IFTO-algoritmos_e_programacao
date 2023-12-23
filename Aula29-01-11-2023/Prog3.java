import java.util.Scanner;

/*
Altere o programa Prog1.java desta aula o deixando com
as seguintes características:
método1 tem que ser de objeto e pertencer a uma classe
diferente do método main e do método2
método2 tem que ser de objeto e pertencer a uma classe
diferente do método main e do método1

Obs: não pode ser utilizado atributos de classe
na resolução desse problema
Não pode utilizar atributos na classe Prog3, class do 
método main
*/
public class Prog3 {
   
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        Bib1 obj1 = new Bib1();
        Bib2 obj2 = new Bib2();
        System.out.print("Nome: ");
        obj1.nome = dd.next(); 

        obj1.metodo1();  //nm = "Ifto"
        System.out.println(obj1.nome); 
        obj2.nome = obj1.nome;
        obj2.metodo2();
        System.out.println(obj2.nome); 

    }

   
}

class Bib1{
    String nome; //"ifto" => "Ifto"
    public void metodo1(){
        String res ="";  //nome = ifto
                          //'i' -> 105
        res += (char)(nome.charAt(0) -32);

        for(int i=1; i< nome.length(); i++)
            res += nome.charAt(i);
        nome = res;
    }
}

class Bib2{
    String nome; //null => "Ifto"
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

}
