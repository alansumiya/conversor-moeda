import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainExtra {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        ImprimeExtra imprime = new ImprimeExtra();
        GeraArquivoExtra salva = new GeraArquivoExtra();
        List<DadosPesquisa> historicoPesquisa = new ArrayList<>();
        GeraLog exibeLog = new GeraLog();
        int opcao = 0;
        var entrada = "";
        var saida = "";

        double valorAConverter;

        while(opcao != 4){
            System.out.println("""
                   ##                               ##
                   ##            Conversor          ##
                   ##               de              ##
                   ##             Moedas            ##
                   ##                               ##
                   Seja bem-vindo!
                   
                   1 - Fazer conversão
                   2 - Histórico de Conversões
                   3 - Registro de logs
                   4 - Sair
                   Escolha a opção desejada:
                   """);
            opcao = ler.nextInt();
            ler.nextLine();
            switch (opcao){
                case 1:
                    System.out.print("Digite a moeda de entrada: ");
                    entrada = ler.nextLine().toUpperCase();
                    System.out.print("Digite a moeda de saída: ");
                    saida = ler.nextLine().toUpperCase();
                    imprime.ImprimeCotacao(entrada, saida);
                    System.out.print("Digite o valor que deseja converter: ");
                    valorAConverter = ler.nextDouble();
                    double valorFinalConversao = imprime.ImprimeValorFinal(entrada, saida, valorAConverter);
                    DadosPesquisa dadosPesquisa = new DadosPesquisa(entrada, saida, valorAConverter,valorFinalConversao);
                    historicoPesquisa.add(dadosPesquisa);

                    break;
                case 2:
                    salva.salvaJson(historicoPesquisa);
                    System.out.printf("%-10s %-10s %-10s %-10s\n", "Origem", "Destino", "Valor", "Resultado");
                    for (DadosPesquisa c : historicoPesquisa) {
                        System.out.printf("%-10s %-10s %-10.2f %-10.2f\n",
                                c.entrada(), c.saida(), c.valorAConverter(), c.valorFinalConversao());
                    }
                    break;
                case 3:
                    exibeLog.exibirLog(exibeLog.getCaminhoArquivo());
                    break;

                case 4:
                    break;
                default:
                    System.out.println("Opção inválida");

            }
        }
    }
}
