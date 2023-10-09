import java.util.Scanner;

/*
Faça um programa para validade se o que o usuário
digitou via Scanner ou via parâmetro do método main
é um número 
Se não for force o usuário a digitar novamente.
*/
public class Prog3 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        String idade;
        for(;;){
            System.out.print("Digite a idade: ");
            idade = dd.next(); 
            char v[] = idade.toCharArray(); // 5 t
            boolean sit = false;
            for(char x: v){
                if (x < '0' || x > '9'){
                    sit = true;
                    break;
                }
            }
            if(sit){
                System.out.println("Digite apenas numeros");
                continue;
            }
            break;
        }
        int id = Integer.parseInt(idade);
        System.out.println("O numero digitado foi: "+id);
    }    
}
