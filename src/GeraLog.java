import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GeraLog {
    private String caminhoArquivo = "C:\\Users\\alans\\OneDrive - CESB - Centro de Educação Superior de Brasilia LTDA\\Documentos\\Cursos TI\\Curso Java\\Java Alura\\ConversorMoeda\\log_conversoes.txt";

    public String getCaminhoArquivo() {
        return caminhoArquivo;
    }

    public void registrar(String entrada, String saida, double valorAConverter, double valorFinalConversao)  {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHora = agora.format(formatter);

        String log = String.format("[%s] Convertido %.2f %s para %s = %.2f\n",
                dataHora, valorAConverter, entrada, saida, valorFinalConversao);

        try(FileWriter escrita = new FileWriter(caminhoArquivo, true)){
            escrita.write(log);
        } catch (IOException e) {
            System.out.println("Erro ao escrever no log: " + e.getMessage());
        }
    }

    public void exibirLog(String caminhoArquivo){
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))){
            String linha;
            int contador = 1;
            System.out.println("📄 Histórico de Conversões");
            System.out.println("-------------------------------");

            while ((linha = leitor.readLine()) != null) {
                System.out.printf("%02d) %s\n", contador++, linha);
            }

            if (contador == 1) {
                System.out.println("⚠️ Nenhum registro encontrado.");
            }
        } catch (IOException e){
            System.out.println("Erro ao ler o arquivo de log: "+ e.getMessage());
        }
    }


}
