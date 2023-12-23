import java.util.Scanner;

public class Atv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        Menu menu = new Menu(frase);
        int opcao;
        do {
            menu.exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    menu.metodo1();
                    break;
                case 2:
                    menu.metodo2();
                    break;
                case 3:
                    //menu.metodo3();
                    break;
                case 4:
                    //menu.metodo4();
                    break;
                case 5:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
    }
}

class Menu {
    private String frase;

    public Menu(String frase) {
        this.frase = frase;
    }

    public void exibirMenu() {
        System.out.println("Menu de opções:");
        System.out.println("1 - Retorna quantas palavras tem na frase");
        System.out.println("2 - Retorna a frase escrita de trás para frente");
        System.out.println("3 - Retornar qual a maior palavra contida na frase digitada");
        System.out.println("4 - Retornar qual a maior palavra contida na frase invertida");
        System.out.println("5 - Sair do programa");
        System.out.print("Escolha uma opção: ");
    }

    public void metodo1() {
        String[] palavras = frase.split(" ");
        int quantidadePalavras = palavras.length;
        System.out.println("A frase contém " + quantidadePalavras + " palavras.");
    }

    public void metodo2() {
        StringBuilder fraseInvertida = new StringBuilder(frase);
        fraseInvertida.reverse();
        System.out.println("Frase invertida: " + fraseInvertida.toString());
    }
}

class OutraClasse {
    public static void metodo4(String fraseInvertida) {
        String[] palavras = fraseInvertida.split(" ");
        String maiorPalavra = "";
        for (String palavra : palavras) {
            if (palavra.length() > maiorPalavra.length()) {
                maiorPalavra = palavra;
            }
        }
        System.out.println("A maior palavra na frase invertida é: " + maiorPalavra);
    }
}

class Objeto {
    private String frase;

    public Objeto(String frase) {
        this.frase = frase;
    }

    public void metodo3() {
        String[] palavras = frase.split(" ");
        String maiorPalavra = "";
        for (String palavra : palavras) {
            if (palavra.length() > maiorPalavra.length()) {
                maiorPalavra = palavra;
            }
        }
        System.out.println("A maior palavra na frase digitada é: " + maiorPalavra);
    }
}