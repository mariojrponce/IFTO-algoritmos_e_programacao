import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Prog1 {


    public static void contabilizar(int mega[], File arq) throws IOException{
        //Abrindo o arquivo para leitura
        BufferedReader br = new BufferedReader(new FileReader(arq));
        String linha;

        //Lendo linha a linha do arquivo
        while((linha = br.readLine())!= null){
            //gerando um vetor de strigs a partir de uma string
            String v[] = linha.split(","); 

            //Lendo o vetor de string gerado
            for(String x: v){
                int pos = Integer.parseInt(x);
                mega[pos-1]++;
            }
        }
        for(int i=0; i < mega.length; i++){
            if(i < 9)
                System.out.print("0"+(i+1) + " = " + mega[i] + "\t");
            else 
                System.out.print((i+1) + " = " + mega[i] + "\t");
            if(i != 0 && (i+1)%5 ==0)
                System.out.println();
        }
        System.out.println();
    }
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
        String menu = "1 - Contabilizar os números sorteados\n"+
                      "2 - Sair do programa\n"+
                      "Opção: ";

        int mega[] = new int[60]; //criando um setor de 60 posiçoes
        Scanner dd = new Scanner(System.in);
        while(true){
            System.out.print(menu);
            int op = dd.nextInt();
            switch(op){
                case 1:
                    contabilizar(mega, arq);
                    break;
                case 2:
                    return;
                default:
                    break;
            }
        }
    }
}
