import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
Faça um programa que leia um arquivo que contenha nome
e idade e o programa deverá apresentar na tela o nome da pessoa mais
velha. 
*/
public class Prog3{
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
        int x, id, maiorId=0;
        String v="", nome="", nomeF="";
        while (((x = fr.read())!= -1)) { //lendo um caracter
            if(x >=48 && x <=57){
                v +=(char)x; //idade
            }else{
                if((x >=65 && x <=90) || (x >=97 && x <=122)){
                    nome+= (char)x; //nome
                }
                if(v.length() !=0){
                    id = Integer.parseInt(v);
                    v="";
                    if(id > maiorId){
                        maiorId = id;
                        nomeF = nome;
                    }
                    nome="";
                }
            }
        }
        fr.close(); //fechar o arquivo

        System.out.println("O mais velho(a) é: " + nomeF + " idade: "+maiorId);
    
    }
}
