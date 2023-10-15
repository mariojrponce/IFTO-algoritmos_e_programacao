//Exemplo de uso de operadores aritméticos
public class Prog1 {
    public static void main(String[] args) {
        int x =2;

        x = x+2;
        //x +=2;
        //System.out.println("Valor de x == "+x);
        //System.out.println("Valor de x1 == "+(x+2));
        System.out.println("Valor de x == "+(x+=2));
        System.out.println("Valor de x2 == "+x);
    }
}
