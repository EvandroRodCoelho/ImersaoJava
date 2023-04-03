package br.com.evandro.languages.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mainLanguages")
public class Languages {
    @Id
    private String id; 
    private String image;
    private String title;
    private int ranking;
    
    public Languages() {

    };
    public Languages(String title, String image, int ranking) {
        this.image = image;
        this.title = title;
        this.ranking = ranking;
    }
    public String getId() {
        return id;
    }
    public String getImage() {
        return image;
    }
    public String getTitle() {
        return title;
    }
    public int getRanking() {
        return ranking;
    }
    
}
