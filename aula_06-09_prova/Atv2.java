import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        double salario = 0.0, inss = 0.0, ir = 0.0, liquido = 0.0;
        double salInss = 0.0;
        String classe = "";

        System.out.print("Informe o salário: ");
        salario = new Scanner(System.in).nextDouble();

        if(salario <= 0.0) {
            System.out.println("Valor inválido");
        }
        else {
            //Calculo INSS - 11% sobre o salario bruto
                inss = salario * 0.11;

            //Calculo IR - 27,5% sobre o salario maior que R$2.500,00
            if(salario > 2500.00){
                ir = salario * (27.5 / 100);
            }

            liquido = salario - (inss + ir);
        }

        if(liquido >= 22000.00){
            classe = "Classe A";
        }
        else if(liquido >= 7100.00){
            classe = "Classe B";
        }
        else if(liquido >= 2900.00){
            classe = "Classe C";
        }
        else if(liquido >= 1048.00){
            classe = "Classe D";
        }
        else if(liquido < 1048.00){
            classe = "Classe E";
        }

        System.out.println("#######EXTRATO#######");
        System.out.println("Salário Bruto: R$"+salario);
        System.out.println("INSS (-11%): R$"+inss);
        if(salario > 2500.00){System.out.println("Imposto de renda (-27,5%): R$"+ir);}
        System.out.println("Salário Liquido: R$"+liquido);
        System.out.println(classe);
    }   
}