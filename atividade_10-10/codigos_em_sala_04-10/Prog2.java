/*
Faça um programa que receba dois operandos e o
simbolo da operaçao como parâmetros do método main e 
o programa deverá apresentar o resultado 
da operação

Ex: java Prog2 3 + 4  7
java Prog2 5 / 2  2,5
*/
public class Prog2 {
    public static void main(String[] args) {
        if(args.length !=3){
            System.out.print("Informe nesta ordem: ");
            System.out.println("operador1 operacao operador2");
            return;
        }

        //Descobrir se o simbolo da operação é valido
        switch(args[1]){
            case "+","-","x","/":
            break;
            default:
                System.out.println("Operaçao invalida.");
                return;
        }
        
        double op1 = Double.parseDouble(args[0]);
        double op2 = Double.parseDouble(args[2]);

        switch(args[1]){
            case "+":
                System.out.printf("%.1f + %.1f = %.1f\n",op1,op2,(op1+op2));
                break;
            case "-":
                System.out.printf("%.1f - %.1f = %.1f\n",op1,op2,(op1-op2));
                break;
            case "x":
                System.out.printf("%.1f x %.1f = %.1f\n",op1,op2,(op1*op2));
                break;
            case "/":
                System.out.printf("%.1f / %.1f = %.1f\n",op1,op2,(op1/op2));
        }
    }    
}
