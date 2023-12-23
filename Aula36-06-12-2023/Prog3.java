/*
Faça um programa que leia o arquivo gerado pelo Prog2.java
e valide os telefones e emails
telefone - tem que possuir 8 dígitos e todos devem ser números
email - tem que @ e ponto (.) * 
*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Prog3 {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Informe nome do arquivo");
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

        //Validando o número de telefone
        while((linha = br.readLine()) != null){
            contLinhas++;
            String v[] = linha.split(" ");
            if(v[1].length() !=9){
                System.out.println("Tamanho inválidos");
                System.out.println(linha);
                continue;
            }
            char num[] = v[1].toCharArray();
            for(char x: num){
                if(x < '0' || x > '9'){
                    System.out.println("Caracter inválido");
                    System.out.println(linha);
                    break;
                }

            }
        }
        br.close();
        br = new BufferedReader(new FileReader(arq));
        //Validando email
        while((linha = br.readLine()) != null){
            String v[] = linha.split(" ");
            char m[] = v[2].toCharArray();
            int contArroba=0, contPonto=0;
            for(char x: m){
                if(x == '.')
                    contPonto++;
                if(x == '@')
                    contArroba++;
            }
            if(contArroba ==0 || contPonto ==0){
                System.out.println("Email inválido");
                System.out.println(linha);
            }
        }
        br.close();

    }
}
