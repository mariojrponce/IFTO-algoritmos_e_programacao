/*
Exemplo de como ler um arquivo e mostrar o conteúdo dele 
na tela do computador. Igual ao programa cat do linux 
O nome do arquivo será passado como parâmetro para o método main
*/

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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

        //Ler o conteúdo do arquivo e apresentar na tela
        
        //fread() -> lê um byte (8 bits) do arquivo e o converte para inteiro
        //-1 representa o fim do arquivo
        int x;
        while (((x = fr.read())!= -1)) {
            if(x == 32)
                System.out.println();
            else
                System.out.print((char)x);
        }


        System.out.println(); //imprimir uma linha em branco
        fr.close();
    }
}
