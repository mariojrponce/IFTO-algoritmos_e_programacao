import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.print.attribute.standard.Fidelity;

/*
Faça uma aplicação que fique em loop escrevendo dentro de um arquivo. 
O sistema pede para que o usuário digite alguma coisa e
 posteriormente grava no arquivo. Após gravar, o programa deverá 
 pedir novamente que usuário digite alguma coisa e grava no arquivo 
 e ficará assim até que o usuário digite 1.

Obs. O nome desse programa deverá-ser Cliente.java. 
*/
public class Cliente{

    public static void escreverNoArquivo(Scanner dd, File arq) throws IOException, InterruptedException{
        FileWriter fw = new FileWriter(arq,true); //abrindo o arquivo para escrita
        String msg;
        while(true){
            System.out.print("Mensagem: ");
            msg = dd.nextLine();
            fw.write(msg+"\n");
            if(msg.equals("1")){
                break;
            }
            fw.flush(); //salvar o arquivo
            Thread.sleep(1000); //programa ficar dormindo por 1

        }
        fw.close(); //fechar o arquivo salvando
        dd.close(); //fecha a conexao com o teclado
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        File arq;

        if(args.length == 0){
            System.out.println("Informe o nome do arquivo.");
            return;//ou System.exit(0);
        }

        arq = new File(args[0]);
        Scanner dd = new Scanner(System.in);
        escreverNoArquivo(dd, arq);
    }
}