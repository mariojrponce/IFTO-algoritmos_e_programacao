import java.util.Scanner;

/*
Faça um programa no qual o usuário digite a
sigla do estado e o seu programa deverá 
apresentar o nome do estado.

Ex: To  => Tocantins 
*/
public class Atividade{
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        String sigla;

        System.out.print("Sigla: ");
        sigla = dd.next();

        //Questionando se tem ao menos dois caracteres
        if(sigla.length() <=1){
            System.out.println("A sigla deve ter no mínimo dois caracteres.");
            return; //encerra o programa
        }

        //sigla.toUpperCase() -> transforma os caracteres para maisuculo
        //substring(0, 2) -> gera uma nova string com os dois primeiros caracteres
        sigla = sigla.toUpperCase().substring(0, 2);

        switch(sigla){ //equals()
            case "AM":
                System.out.println("Amazonas");
                break;
            case "TO":
                System.out.println("Tocantins");
                break;
            case "GO":
                System.out.println("Goias");
                break;
            case "MA":
                System.out.println("Maranhão");
                break;
            case "PA":
                System.out.println("Pará");
                break;
            default:
                System.out.println("Estado inexistente.");
        }
    }
}