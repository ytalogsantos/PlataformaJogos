package DatabaseServices;

import Database.Game;

import java.util.List;

public class GameDatabaseServices {
    List<Game> games;

    public GameDatabaseServices(List<Game> games) {
        this.games = games;
    }

    public Game findByTitle(String title) {
        for(Game game : games) {
            if (game.getTitle().equals(title)) {
                return game;
            }
        }
        return null;
    }
}
