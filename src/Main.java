import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
       Scanner ler = new Scanner(System.in);
       Imprime imprime = new Imprime();
       int opcao = 0;
       var busca = "";


       double valorAConverter;

        while(opcao != 7){
            System.out.println("""
                   ##                               ##
                   ##            Conversor          ##
                   ##               de              ##
                   ##             Moedas            ##
                   ##                               ##
                   Seja bem-vindo!
                   
                   1 - Dólar -->  Real
                   2 - Real --> Dólar
                   3 - Iene --> Real
                   4 - Real --> Iene
                   5 - Won --> Real
                   6 - Real --> Won
                   7 - Sair
                   Escolha a opção desejada:
                   """);
            opcao = ler.nextInt();
            switch (opcao){
                case 1:
                    busca = "USD";
                    imprime.ImprimeCotacao(busca, opcao);
                    System.out.print("Digite o valor que deseja converter: ");
                    valorAConverter = ler.nextDouble();
                    imprime.ImprimeValorFinal(busca, opcao, valorAConverter);
                    break;
                case 2:
                    busca = "BRL";
                    imprime.ImprimeCotacao(busca, opcao);
                    System.out.print("Digite o valor que deseja converter: ");
                    valorAConverter = ler.nextDouble();
                    imprime.ImprimeValorFinal(busca, opcao, valorAConverter);
                    break;
                case 3:
                    busca = "JPY";
                    imprime.ImprimeCotacao(busca, opcao);
                    System.out.print("Digite o valor que deseja converter: ");
                    valorAConverter = ler.nextDouble();
                    imprime.ImprimeValorFinal(busca, opcao, valorAConverter);
                    break;
                case 4:
                    busca = "BRL";
                    imprime.ImprimeCotacao(busca, opcao);
                    System.out.print("Digite o valor que deseja converter: ");
                    valorAConverter = ler.nextDouble();
                    imprime.ImprimeValorFinal(busca, opcao, valorAConverter);
                    break;
                case 5:
                    busca = "KRW";
                    imprime.ImprimeCotacao(busca, opcao);
                    System.out.print("Digite o valor que deseja converter: ");
                    valorAConverter = ler.nextDouble();
                    imprime.ImprimeValorFinal(busca, opcao, valorAConverter);
                    break;
                case 6:
                    busca = "BRL";
                    imprime.ImprimeCotacao(busca, opcao);
                    System.out.print("Digite o valor que deseja converter: ");
                    valorAConverter = ler.nextDouble();
                    imprime.ImprimeValorFinal(busca, opcao, valorAConverter);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opção inválida");

            }
        }




    }
}