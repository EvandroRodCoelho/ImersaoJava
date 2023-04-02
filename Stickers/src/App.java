import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;

import services.ClientHttp;

public class App {

    public static void main(String[] args) throws Exception {

        String ImdbUrl = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
        String NasaUrl = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2022-06-12&end_date=2022-06-14";
        // extrair só os dados que interessam (titulo, poster, classificação)
        var http = new ClientHttp();
        String json  = http.getDatas(NasaUrl);



        // exibir e manipular os dados 

        var extractor = new NasaContentExtractor();
        List<Content> contents = extractor.extractContent(json);
        
        for (int i = 0; i < 3; i++) {
            Content content = contents.get(i);

            InputStream inputStream = new URL(content.getImageUrl()).openStream();
            String archiveName ="assets/exit/" + content.getTitle() + ".png";

            var generate = new StickerGenerator();
      
            generate.createSticker(inputStream, archiveName);
            System.out.println(content.getTitle());
        }
    }
}