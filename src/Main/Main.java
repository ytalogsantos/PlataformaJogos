package Main;

import Database.Game;
import Database.GameDatabase;
import Database.User;
import Database.UserDatabase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Game> GameList = GameDatabase.getGlobalGameList();

        System.out.println("** Global Game List **");

        for (Game game : GameList) {
            System.out.println("Game: " + game.getTitle());
            System.out.println("Genre: " + game.getGenre());
            System.out.println("Release date: " + game.getReleaseDate());
            System.out.println("Prize: " + game.getPrize() + "\n");
            System.out.println("---------------------------\n");
        }

        List<User> UserList = UserDatabase.getGlobalUserList();
        System.out.println("## Global User List ##");

        for (User user : UserList) {
            System.out.println("User: " + user.getUsername());
            System.out.println("Total poins: " + user.getPoints() + "\n");
            System.out.println("------ Game Library ------");
            for (Game game : user.getGameList()) {
                System.out.println("Game: " + game.getTitle());
                System.out.println("Genre: " + game.getGenre());
                System.out.println("Release date: " + game.getReleaseDate());
                System.out.println("Prize: " + game.getPrize());
                System.out.println("---------------------------");
            }
        }
    }
}