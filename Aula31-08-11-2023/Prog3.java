import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 Exemplo de manipulação de arquivos via classe File
 Criando um arquivo sendo que o nome deste será informado
 pelo usuário.
 EXEMPLO: COMO CRIAR VÁRIOS ARQUIVOS DE UMA ÚNICA VEZ
 */
public class Prog3{
    public static void main(String[] args) throws IOException {
        File arq;
        for(String x: args){
            arq = new File(x); //criando um objeto que pode ser vinculado a um arquivo
        
            if(arq.createNewFile()){ //cria um arquivo de texto puro vazio
                System.out.println("Aquivo criado com sucesso.");
            }else{
                System.out.println("Erro ao criar o arquivo.");
            }
        }
    }
}