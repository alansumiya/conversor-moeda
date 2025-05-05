import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
       Scanner ler = new Scanner(System.in);
       ConsultaMoeda consultaMoeda = new ConsultaMoeda();
       var busca = "";
       /* int opcao = 0;

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
        }*/

       System.out.println("Digite o sigla da moeda que deseja pesquisar: ");
        busca = ler.nextLine();
        Moeda novaMoeda = consultaMoeda.buscaMoeda(busca);
        System.out.println("USD: " + novaMoeda.conversion_rates().get("USD"));
        System.out.println("BRL: " + novaMoeda.conversion_rates().get("BRL"));


    }
}