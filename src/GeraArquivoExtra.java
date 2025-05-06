import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeraArquivoExtra {
    public void salvaJson(List<DadosPesquisa> listaConversao) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        FileWriter escrita = new FileWriter("Conversões.json");
        escrita.write(gson.toJson(listaConversao));
        escrita.close();
    }
}
