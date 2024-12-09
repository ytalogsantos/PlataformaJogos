package Database;
import java.util.ArrayList;
import java.util.List;

public class UserInfo {

    public UserInfo(String user, String password, Double points) {
        Username = user;
        Password = password;
        Points = points;
        GameLibrary = new ArrayList<Game>();
    }
    private String Username;
    private String Password;
    private Double Points;
    private List<Game> GameLibrary;

    public String getUser() {
        return Username;
    }

    public void setUser(String user) {
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

    public List<Game> getGames() {
        return GameLibrary;
    }

    public void setGames(List<Game> games) {
        GameLibrary = games;
    }
}
