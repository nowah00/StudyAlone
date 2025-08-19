package prob02.prob02_1;

public class Movie {
    private String title;
    private String genre;

    public Movie() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void play(){
        System.out.printf("%s(%s) 상영중입니다.\n", getTitle(), getGenre());
    }
}
