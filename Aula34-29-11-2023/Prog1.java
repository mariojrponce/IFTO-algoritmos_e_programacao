/*
 * FAÇA UM PROGRAMA QUE COPIE TODAS AS PALAVRAS DE UM ARQUIVO PARA DENTRO DE UM VETOR
 * DE STRINGS;
 * IMPRIMA AS PALAVRAS QUE ESTÃO DENTRO DO VETOR DE STRINGS
 TRANSFORMANDO O TEXTO PARA MAISUCULO
 */

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Prog1 {
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
        String pl[] = new String[50]; //o valor padrão é null

        FileReader fr = new FileReader(arq); //abrindo o arquivo

        //Ler o conteúdo do arquivo e apresentar na tela
        
        //fread() -> lê um byte (8 bits) do arquivo e o converte para inteiro
        //-1 representa o fim do arquivo
        int x;
        String v=""; //criando uma string vazia
        int i=0; //indice para o vetor de string
        while (((x = fr.read())!= -1)) {
            if(x == 32){ //se caracter for igual a barra de espaço
                pl[i] = v.toUpperCase(); 
                i++;
                v="";
                continue;
            }
            v+= (char)x;
        }
        pl[i] = v.toUpperCase();
        for(String y: pl){
            if(y == null)
                break;
            System.out.println(y);
        }
    }
}
