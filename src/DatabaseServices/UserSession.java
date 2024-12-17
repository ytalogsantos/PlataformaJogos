package DatabaseServices;

import Database.Game;
import Database.GameDatabase;
import Database.User;
import Main.GlobalGameLibrary;
import Main.UserProfile;

import java.util.List;
import java.util.Scanner;

public class UserSession {
    UserProfile user;
    Scanner scanner;
    List<Game> games;
    GlobalGameLibrary globalGameLibrary;
    int choice = 0;

    public UserSession(UserProfile currentUser, GlobalGameLibrary gameLibrary, Scanner scanner) {
        this.user = currentUser;
        this.scanner = scanner;
        this.games = games;
        this.globalGameLibrary = gameLibrary;
    }

    public void manageUserSession() {
        while (true) {
            System.out.println("1. Show profile");
            System.out.println("2. Buy game");
            System.out.println("3. Logout");
            System.out.println("Your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    user.showProfile();
                    break;
                case 2:
                    globalGameLibrary.showGameLibrary();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }
}
