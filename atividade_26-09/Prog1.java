//Exemplo de como criar mais de uma variável na expressão do laço for
public class Prog1 {
    public static void main(String[] args) {
        for(int i=0, j=0, t=0;i < 5 && j%2 ==0; i++, j+=2, t+=3){
            System.out.println(i + " => "+j +" => "+ t);
        }
        //Essa dá erro porque está tentando acessar variáveis que só são visiveis dentro do laço
        //System.out.println(i + " => "+j +" => "+ t);
    }
}
