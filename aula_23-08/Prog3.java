//Exemplo de uso o comando exclamação (negação)
//Aplicado a valores boolean
//O ponto de exclamação nega o valor boolena
// assim !true == false e !false == true
public class Prog3 {
    public static void main(String[] args) {
        boolean v= true;
        if(!v)
            System.out.println("verdadeiro");
        else
            System.out.println("Falso");

        int x =2;
        if(!(x == 2)){
            System.out.println("x é igual a 2");
        }else
            System.out.println("x é diferente de 2");
    }
}
