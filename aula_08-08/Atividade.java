/*
Faça um programa que crie duas variáveis locais no 
método main. Uma variável local é do tipo int e a outra
 do tipo double. Some as duas variáveis e armazene o 
 resultado em uma terceira variável do tipo int e 
 apresente o valor dessa variavel na tela. 
*/
public class Atividade{
    public static void main(String[] args) {
        int x = 4; //variável local (tipo primitivo)
        double y = 4.3; //variável local (tipo primitivo)

        int z; //variável local (tipo primitivo)
        z = x + (int)y; //converte y para inteiro depois soma com x e atribui a z
        z = (int)(x + y); //faz a soma primeiro e converte o resultado para int

        System.out.println("O valor de z == "+z);
        //obs: somar int + double o resultado é sempre double
    }
}