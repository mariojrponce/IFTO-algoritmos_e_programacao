//Exemplo como receber parâmetros do método main
public class Prog3 {
    public static void main(String[] args) {
        System.out.print("O método main ");
        System.out.print("recebeu "+ args.length );
        System.out.println(" parâmetros.");

        //Listando os parâmetros recebidos
        if(args.length != 0){
            //for(String x: args)
            //    System.out.println(x);
            for(int i=0; i < args.length; i++)
                System.out.println(args[i]);
        }
    }
}
