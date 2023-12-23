import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
Faça um programa que procure uma palavra dentro do arquivo, caso 
encontre apresente a linha do arquivo no qual essa palavra se 
encontra.

Forma de execução:
java <nome_arquivo> <palavra_a_ser_procurada> 
*/

public class Prog1{
    public static void main(String[] args) throws IOException {
        if(args.length !=2){
            System.out.println("Informe nome do arquivo");
            System.out.println("Informe palavra a ser buscada");
            return;
        }
        File arq = new File(args[0]);
        if(!arq.exists()){
            System.out.println("Arquivo não existe");
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader(arq));
        String linha;
        int contLinhas=0;
        boolean flag = false;
        while((linha = br.readLine()) != null){
            contLinhas++;
            String v[] = linha.split(" ");
            for(String x: v){
                if(x.equalsIgnoreCase(args[1])){
                    System.out.println("Linha: "+contLinhas + " => "+linha);
                    flag = true;
                    break;
                }
            }
        }
        if(!flag){
            System.out.println(args[1] +" não existe no arquivo "+args[0]);
        }
        br.close(); //fechar o aquivo
    }
}