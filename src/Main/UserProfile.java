package Main;

import Database.Game;
import Database.User;

public class UserProfile {
    private User user;

    public UserProfile(User user) {
        this.user = user;
    }

    public void showProfile() {
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