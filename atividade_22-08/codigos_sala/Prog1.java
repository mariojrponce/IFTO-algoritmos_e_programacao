import javax.swing.plaf.synth.SynthOptionPaneUI;

//Exemplo de uso de operadores ariméticos com tipo char
public class Prog1{
    public static void main(String[] args) {
        char x = 'A';
        System.out.println(x); //A
        System.out.println((int)x); //65
        System.out.println((char)(x+1)); // B
        System.out.println(x);//A
        x++; // x = x + 1;
        System.out.println(x); //B
    }
}