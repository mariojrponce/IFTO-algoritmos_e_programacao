import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Servidor {

    public static void lendoArquivo(File arq) throws IOException, InterruptedException{
        

        String linha;
        int contLinhas=1; //armazenar qual a próxima linha a ser lida
        while(true){
            BufferedReader br = new BufferedReader(new FileReader(arq));
            for(int i=1; i < contLinhas; i++) //laço para ler as linhas do arquivo já impressa na tela
                br.readLine(); 
            while((linha = br.readLine()) != null){ //lçao para ler novas linha  do arquivo e imprimindo na tela 
                if(linha.equals("1")){
                    br.close();
                    arq.delete(); //apaga o arquivo
                    return; //voltar para o método main
                }
                System.out.println(linha);
                contLinhas++;
            }
            br.close(); //fechar arquivo
            Thread.sleep(1000); //dorme 5 segundos
        }
        
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        File arq;

        if(args.length == 0){
            System.out.println("Informe o nome do arquivo.");
            return;//ou System.exit(0);
        }
        
        arq = new File(args[0]);

        if(arq.exists())
            lendoArquivo(arq);
        else
            System.out.println("Arquivo não existe.");
    }
}
