/*
Faça um programa que receba vários números como 
parâmetros do método main e o programa deverá
apresentar o resultado do somatório desses números 
*/
public class Prog1{
    public static void main(String[] args) {
        if(args.length ==0){ //para saber se tem parametros
            System.out.println("Execute com parâmetros.");
            return; //encerra o método
        }

        int soma=0;
        
        //Utilizando for
        /*for(int i=0; i < args.length; i++)
            //pedindo para converter uma String para inteiro
            soma += Integer.parseInt(args[i]);
        
         
        //Utilizando forEach
        for(String x: args)
            soma += Integer.parseInt(x);
        

        //Utilizando While
        int i=0;
        while(i < args.length){
            soma += Integer.parseInt(args[i]);
            i++; 
        }
        */
        //Utilizando Do-While
        int i=0;
        do{
            soma += Integer.parseInt(args[i]);
            i++; 
        }while(i < args.length);
        System.out.println("Soma: "+soma);
    }
}