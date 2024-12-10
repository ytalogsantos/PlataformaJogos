package Database;
import java.util.ArrayList;
import java.util.List;

public class User {

    public User(String username, String password, Double points) {
        Username = username;
        Password = password;
        Points = points;
    }

    public User(String username, String password, Double points, List<Game> gameLibrary) {
        Username = username;
        Password = password;
        Points = points;
        GameLibrary = gameLibrary;
    }

    private String Username;
    private String Password;
    private Double Points;
    private List<Game> GameLibrary;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String user) {
        Username = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Double getPoints() {
        return Points;
    }

    public void setPoints(Double points) {
        Points = points;
    }

    public List<Game> getGameList() {
        return GameLibrary;
    }

    public void setGameList(List<Game> games) {
        GameLibrary = games;
    }
}
