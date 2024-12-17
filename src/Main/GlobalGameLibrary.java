package Main;

import Database.Game;

import java.util.List;

public class GlobalGameLibrary {
    List<Game> games;

    public GlobalGameLibrary(List<Game> games) {
        this.games = games;
    }

    public void showGameLibrary() {
        for (Game game : games) {
            System.out.println("Game: " + game.getTitle());
            System.out.println("Genre: " + game.getGenre());
            System.out.println("Release date: " + game.getReleaseDate());
            System.out.println("Prize: " + game.getPrize());
            System.out.println("---------------------------");
        }
    }
}
