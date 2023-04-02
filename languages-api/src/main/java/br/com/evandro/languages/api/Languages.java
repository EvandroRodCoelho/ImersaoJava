package br.com.evandro.languages.api;

public class Languages {
    private String image;
    private String title;
    private int ranking;
    
    public Languages(String title, String image, int ranking) {
        this.image = image;
        this.title = title;
        this.ranking = ranking;
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
