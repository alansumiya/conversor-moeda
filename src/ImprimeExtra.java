public class ImprimeExtra {
    ConsultaMoeda consultaMoeda = new ConsultaMoeda();
    ValorFinalConversao valorFinalConversao = new ValorFinalConversao();
    GeraLog log = new GeraLog();

    public void ImprimeCotacao(String entrada, String saida){
        Moeda novaMoeda = consultaMoeda.buscaMoeda(entrada);
        System.out.println(entrada + ": " + novaMoeda.conversion_rates().get(entrada));
        System.out.println(saida + ": " + novaMoeda.conversion_rates().get(saida));
    }

    public double ImprimeValorFinal(String entrada, String saida, double valorAConverter){
        Moeda novaMoeda = consultaMoeda.buscaMoeda(entrada);
        double resultado = valorFinalConversao.valorFinal(valorAConverter, novaMoeda.conversion_rates().get(saida));
        System.out.println(String.format("""
                    Valor que deseja converter: %s %.2f
                    Valor final: %s %.2f
                    """,entrada,valorAConverter, saida, resultado));
        log.registrar(entrada, saida, valorAConverter, resultado);
        return resultado;

    }


}
