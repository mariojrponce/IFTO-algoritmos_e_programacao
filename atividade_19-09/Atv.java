/*
 * Faça um programa no qual o usuário digite a sigla do estado e o seu programa 
 * deverá apresentar o nome do estado.
    Ex: To  => Tocantins
 */

import java.util.Scanner;

public class Atv{
     public static void main(String[] args) {
        System.out.print("Digite a sigla de um estado brasileiro: ");
        String entrada = new Scanner(System.in).next();

      //Verifica se tem apenas 2 caracteres
        if(entrada.length() != 2){
            System.out.println("Palavra nao possui 2 caracteres.");
            return; //encerrar o método
        }

      //Converte tudo para maiuculo
         System.out.println("\nSIGLA: " + entrada.toUpperCase());
      
         switch (entrada.toUpperCase()) {
            case "AC":
              System.out.println("AC - Acre");
              break;
            case "AL":
              System.out.println("AL - Alagoas");
              break;
            case "AP":
              System.out.println("AP - Amapá");
              break;              
            case "AM":
              System.out.println("AM - Amazonas");
              break;              
            case "BA":
              System.out.println("BA - Bahia");
              break;              
            case "CE":
              System.out.println("CE - Ceará");
              break;              
            case "ES":
              System.out.println("ES - Espírito Santo");
              break;              
            case "GO":
              System.out.println("GO - Goiá");
              break;              
            case "MA":
              System.out.println("MA - Maranhão");
              break;              
            case "MT":
              System.out.println("MT - Mato Grosso");
              break;              
            case "MS":
              System.out.println("MS - Mato Grosso do Sul");
              break;              
            case "MG":
              System.out.println("MG - Minas Gerais");
              break;              
            case "PA":
              System.out.println("PA - Pará");
              break;              
            case "PB":
              System.out.println("PB - Paraíba");
              break;              
            case "PR":
              System.out.println("PR - Paraná");
              break;              
            case "PE":
              System.out.println("PE - Pernambuco");
              break;              
            case "PI":
              System.out.println("PI - Piauí");
              break;              
            case "RJ":
              System.out.println("RJ - Rio de Janeiro");
              break;              
            case "RN":
              System.out.println("RN - Rio Grande do Norte");
              break;              
            case "RS":
              System.out.println("RS - Rio Grande do Sul");
              break;              
            case "RO":
              System.out.println("RO - Rondônia");
              break;              
            case "RR":
              System.out.println("RR - Roraima");
              break;              
            case "SC":
              System.out.println("SC - Santa Catarina");
              break;              
            case "SP":
              System.out.println("SP - São Paulo");
              break;              
            case "SE":
              System.out.println("SE - Sergipe");
              break;              
            case "TO":
              System.out.println("TO - Tocantins");
              break;              
            case "DF":
              System.out.println("DF - Distrito Federal");
              break;              
            default:
              System.out.println("Opção inválida.");
          }

     }
         
}