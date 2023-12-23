import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.SpringLayout;

/*
Exemplo de como ler um arquivo linha a linha 
*/
public class Prog4 {
    public static void main(String[] args) throws IOException{
        if (args.length == 0) {
            System.out.println("Informe o nome do arquivo a ser visualizado.");
            return;
        }
        File arq = new File(args[0]); // Criando um objeto a ser vinculado a um arquivo
        if (!arq.exists()) {
            System.out.println("Aquivo não existe.");
            return;
        }

        //Ler o arquivo linha a linha
        BufferedReader br = new BufferedReader(new FileReader(arq));
        String linha;
        while((linha = br.readLine())!=null){
            System.out.println(linha);
        }
    }
}
