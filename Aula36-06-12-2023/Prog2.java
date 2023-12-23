import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Faça um programa que cadaste dados do usuário

Nome, telefone e email

O programa deve ficar em loop a cada cadastro deve questionar o

usuário se deve cadastrar outro?

Ao fechar o programa e abrí-lo novamente deve continuar o

cadastro dos dados.

Forma de execução:

java <nome_arquivo> 
*/
public class Prog2 {
    public static void main(String[] args) throws IOException {
        if(args.length ==0){
            System.out.println("Informe nome do arquivo");
            return;
        }
        File arq = new File(args[0]);
        
        FileWriter fw = new FileWriter(arq,true); //abrir um arquivo para escrever
        String nome, fone, email;
        Scanner dd = new Scanner(System.in);

        while(true){
            System.out.print("Nome: ");
            nome = dd.nextLine();
            System.out.print("Fone: ");
            fone = dd.nextLine();
            System.out.print("Email: ");
            email = dd.nextLine();
            fw.write(nome + " " + fone + " " + email+"\n");
            System.out.print("Cadastrar outro(1-sim/2-não): ");
            if(dd.nextInt() == 2)
                break;
            dd.nextLine(); //limpar o buffer do teclado
        }
        fw.close(); //fecha e salva o arquivo
    }
}
