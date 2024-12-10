package Database;

import java.time.LocalDate;

public class Game {

    public Game(String title, String genre, LocalDate releaseDate, Double prize) {
        Title = title;
        Genre = genre;
        ReleaseDate = releaseDate;
        Prize = prize;
    }

    private String Title;
    private String Genre;
    private LocalDate ReleaseDate;
    private Double Prize;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public LocalDate getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        ReleaseDate = releaseDate;
    }

    public Double getPrize() {
        return Prize;
    }

    public void setPrize(Double prize) {
        Prize = prize;
    }

}
