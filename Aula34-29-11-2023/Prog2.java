import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
Faça um programa que leia um arquivo que contenha nome
e idade e o programa deverá apresentar na tela o somatório
das idades. 
*/
public class Prog2 {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Informe o nome do arquivo a ser visualizado.");
            return;
        }
        File arq = new File(args[0]); //Criando um objeto a ser vinculado a um arquivo
        if(!arq.exists()){
            System.out.println("Aquivo não existe.");
            return;
        }
        
        FileReader fr = new FileReader(arq); //abrindo o arquivo
        int x, soma=0;
        String v="";
        while (((x = fr.read())!= -1)) {
            if(x >=48 && x <=57){
                v +=(char)x;
            }else{
                if(v.length() !=0){
                    soma += Integer.parseInt(v);
                    v="";
                }
            }
        }

        System.out.println("O resultado da soma: "+soma);
    
    }
}
