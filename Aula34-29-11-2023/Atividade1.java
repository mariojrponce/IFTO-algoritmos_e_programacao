import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
Faça um programa que leia um arquivo que contenha nome
e idade e o programa deverá apresentar na tela o somatório
das idades. 
*/
public class Atividade1 {
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
        
        BufferedReader br = new BufferedReader(new FileReader(arq)); //abrindo um arquivo
        int soma=0;
        String linha;
        //toda vez que o método read() é executado ele lê um byte do arquivo
        while (((linha = br.readLine())!= null)) {
            String v[] = linha.split(" "); //split cria um vetor de strings a partir da strinig
            soma += Integer.parseInt(v[1]);
        }

        System.out.println("O resultado da soma: "+soma);
        br.close(); //fechar o arquivo
    
    }
}
