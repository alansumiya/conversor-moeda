public class Imprime {

    ConsultaMoeda consultaMoeda = new ConsultaMoeda();
    ValorFinalConversao valorFinalConversao = new ValorFinalConversao();


    public void ImprimeCotacao(String busca, int opcao){
        Moeda novaMoeda = consultaMoeda.buscaMoeda(busca);
        System.out.println(busca + ": " + novaMoeda.conversion_rates().get(busca));
        
        if(opcao == 1 || opcao == 3 || opcao == 5){
            String siglaMoedaConvertida = "BRL";
            System.out.println(siglaMoedaConvertida + ": " + novaMoeda.conversion_rates()
                    .get(siglaMoedaConvertida));
        } else if (opcao == 2) {
            String siglaMoedaConvertida = "USD";
            System.out.println(siglaMoedaConvertida + ": " + novaMoeda.conversion_rates()
                    .get(siglaMoedaConvertida));
        } else if (opcao == 4) {
            String siglaMoedaConvertida = "JPY";
            System.out.println(siglaMoedaConvertida + ": " + novaMoeda.conversion_rates()
                    .get(siglaMoedaConvertida));
        } else if (opcao == 6) {
            String siglaMoedaConvertida = "KRW";
            System.out.println(siglaMoedaConvertida + ": " + novaMoeda.conversion_rates()
                    .get(siglaMoedaConvertida));
        }

    }

    public void ImprimeValorFinal(String busca, int opcao, double valorAConverter){
        Moeda novaMoeda = consultaMoeda.buscaMoeda(busca);
        if(opcao == 1) {
            System.out.println(String.format("""
                    Valor que deseja converter: US$ %.2f
                    Valor final: R$ %.2f
                    """, valorAConverter, valorFinalConversao
                    .valorFinal(valorAConverter, novaMoeda.conversion_rates().get("BRL"))));
        } else if (opcao == 2) {
            System.out.println(String.format("""
                            Valor que deseja converter: R$ %.2f
                            Valor final: US$ %.2f
                            """,valorAConverter, valorFinalConversao
                    .valorFinal(valorAConverter,novaMoeda.conversion_rates().get("USD"))));

        } else if (opcao == 3) {
            System.out.println(String.format("""
                            Valor que deseja converter: JP¥ %.2f
                            Valor final: R$ %.2f
                            """,valorAConverter, valorFinalConversao
                            .valorFinal(valorAConverter,novaMoeda.conversion_rates().get("BRL"))));
        } else if (opcao == 4) {
            System.out.println(String.format("""
                            Valor que deseja converter: R$ %.2f
                            Valor final: JP¥ %.2f
                            """,valorAConverter, valorFinalConversao
                    .valorFinal(valorAConverter,novaMoeda.conversion_rates().get("JPY"))));
        } else if (opcao == 5) {
            System.out.println(String.format("""
                            Valor que deseja converter: ₩ %.2f
                            Valor final: R$ %.2f
                            """,valorAConverter, valorFinalConversao
                    .valorFinal(valorAConverter,novaMoeda.conversion_rates().get("BRL"))));
        } else if (opcao == 6) {
            System.out.println(String.format("""
                            Valor que deseja converter: R$ %.2f
                            Valor final: ₩ %.2f
                            """,valorAConverter, valorFinalConversao
                    .valorFinal(valorAConverter,novaMoeda.conversion_rates().get("KRW"))));        }
    }
}
