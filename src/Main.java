import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
       Scanner ler = new Scanner(System.in);
       ConsultaMoeda consultaMoeda = new ConsultaMoeda();
       ValorFinalConversao valorFinalConversao = new ValorFinalConversao();
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
                    Moeda novaMoeda = consultaMoeda.buscaMoeda(busca);
                    System.out.println("BRL: " + novaMoeda.conversion_rates().get("BRL"));
                    System.out.println("USD: " + novaMoeda.conversion_rates().get("USD"));
                    System.out.print("Digite o valor que deseja converter: ");
                    valorAConverter = ler.nextDouble();
                    System.out.println(String.format("""
                            Valor que deseja converter: US$ %.2f
                            Valor final: R$ %.2f
                            """,valorAConverter, valorFinalConversao
                            .valorFinal(valorAConverter,novaMoeda.conversion_rates().get("BRL"))));
                    break;
                case 2:
                    busca = "BRL";
                    Moeda novaMoeda2 = consultaMoeda.buscaMoeda(busca);
                    System.out.println("BRL: " + novaMoeda2.conversion_rates().get("BRL"));
                    System.out.println("USD: " + novaMoeda2.conversion_rates().get("USD"));
                    System.out.print("Digite o valor que deseja converter: ");
                    valorAConverter = ler.nextDouble();
                    System.out.println(String.format("""
                            Valor que deseja converter: R$ %.2f
                            Valor final: US$ %.2f
                            """,valorAConverter, valorFinalConversao
                            .valorFinal(valorAConverter,novaMoeda2.conversion_rates().get("USD"))));
                    break;
                case 3:
                    busca = "JPY";
                    Moeda novaMoeda3 = consultaMoeda.buscaMoeda(busca);
                    System.out.println("JPY: " + novaMoeda3.conversion_rates().get("JPY"));
                    System.out.println("BRL: " + novaMoeda3.conversion_rates().get("BRL"));
                    System.out.print("Digite o valor que deseja converter: ");
                    valorAConverter = ler.nextDouble();
                    System.out.println(String.format("""
                            Valor que deseja converter: JP¥ %.2f
                            Valor final: R$ %.2f
                            """,valorAConverter, valorFinalConversao
                            .valorFinal(valorAConverter,novaMoeda3.conversion_rates().get("BRL"))));
                    break;
                case 4:
                    busca = "BRL";
                    Moeda novaMoeda4 = consultaMoeda.buscaMoeda(busca);
                    System.out.println("BRL: " + novaMoeda4.conversion_rates().get("BRL"));
                    System.out.println("JPY: " + novaMoeda4.conversion_rates().get("JPY"));
                    System.out.print("Digite o valor que deseja converter: ");
                    valorAConverter = ler.nextDouble();
                    System.out.println(String.format("""
                            Valor que deseja converter: R$ %.2f
                            Valor final: JP¥ %.2f
                            """,valorAConverter, valorFinalConversao
                            .valorFinal(valorAConverter,novaMoeda4.conversion_rates().get("JPY"))));
                    break;
                case 5:
                    busca = "KRW";
                    Moeda novaMoeda5 = consultaMoeda.buscaMoeda(busca);
                    System.out.println("KRW: " + novaMoeda5.conversion_rates().get("KRW"));
                    System.out.println("BRL: " + novaMoeda5.conversion_rates().get("BRL"));
                    System.out.print("Digite o valor que deseja converter: ");
                    valorAConverter = ler.nextDouble();
                    System.out.println(String.format("""
                            Valor que deseja converter: ₩ %.2f
                            Valor final: R$ %.2f
                            """,valorAConverter, valorFinalConversao
                            .valorFinal(valorAConverter,novaMoeda5.conversion_rates().get("BRL"))));
                    break;
                case 6:
                    busca = "BRL";
                    Moeda novaMoeda6 = consultaMoeda.buscaMoeda(busca);
                    System.out.println("BRL: " + novaMoeda6.conversion_rates().get("BRL"));
                    System.out.println("KRW: " + novaMoeda6.conversion_rates().get("KRW"));
                    System.out.print("Digite o valor que deseja converter: ");
                    valorAConverter = ler.nextDouble();
                    System.out.println(String.format("""
                            Valor que deseja converter: R$ %.2f
                            Valor final: ₩ %.2f
                            """,valorAConverter, valorFinalConversao
                            .valorFinal(valorAConverter,novaMoeda6.conversion_rates().get("KRW"))));
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opção inválida");

            }
        }




    }
}