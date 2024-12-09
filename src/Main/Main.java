package Main;

import Database.Game;
import Database.GameDatabase;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Game> GameList = GameDatabase.getGameList();

        System.out.println("** Global Game List **");

        for (Game game : GameList) {
            System.out.println("Game: " + game.getTitle());
            System.out.println("Genre: " + game.getGenre());
            System.out.println("Release date: " + game.getReleaseDate());
            System.out.println("Prize: " + game.getPrize());
        }
    }
}