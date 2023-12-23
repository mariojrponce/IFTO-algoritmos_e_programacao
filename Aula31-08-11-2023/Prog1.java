import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 Exemplo de manipulação de arquivos via classe File
 Criando um arquivo sendo que o nome deste será informado
 pelo usuário.
 */
public class Prog1{
    public static void main(String[] args) throws IOException {
        File arq;
        Scanner dd = new Scanner(System.in);
        String nome;

        System.out.print("Informe o nome do arquivo: ");
        nome = dd.next();
        arq = new File(nome); //criando um objeto que pode ser vinculado a um arquivo
        
        
        if(arq.createNewFile()){ //cria um arquivo de texto puro vazio
            System.out.println("Aquivo criado com sucesso.");
        }else{
            System.out.println("Erro ao criar o arquivo.");
        }
    }
}