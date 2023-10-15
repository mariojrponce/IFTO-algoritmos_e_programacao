import java.util.Scanner;

//Exemplo de aplicação no qual o usuario digita dados
//via teclado
public class Prog3 {
    public static void main(String[] args) {
        Scanner dd; //criando uma variável chamada dd que
                    //armazenará um "objeto" do tipo Scanner
        dd = new Scanner(System.in); //criando o objeto 
        byte x; //criando uma variável chamada x   
        System.out.print("Digite um número: ");
        x = dd.nextByte(); //captura o valor digitado no teclado e armazena em x 
        System.out.println("O valor digitado foi: "+x);       
    }
}
