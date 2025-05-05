import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int opcao = 0;

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
       }
    }
}