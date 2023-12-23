import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Exemplo de como escrever dentro de um arquivo 
*/
public class Prog2 {
    public static void main(String[] args) throws IOException {
        Scanner dd = new Scanner(System.in);

        int op;
        FileWriter fw = new FileWriter("Cadastro.txt"); //abrindo o arquivo para escrita
        String nome;
        int id;
        while(true){
            System.out.print("Nome: ");
            nome = dd.nextLine();

            System.out.print("Idade: ");
            id = dd.nextInt();
            fw.write(nome+"\t" + id + "\n"); //escrever dentro do arquivo
            System.out.print("Continua? 1(sim)/2(Não): ");
            op = dd.nextInt();
            if(op == 2)
                break;
            dd.nextLine(); //limpar o buffer do teclado
        }
        fw.close(); //fechando e salvando o arquivo
    }
}
