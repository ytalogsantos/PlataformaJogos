package Main;

import Authentication.Login;
import Authentication.Registration;
import Database.Game;
import Database.GameDatabase;
import Database.User;
import Database.UserDatabase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Game> GlobalGameList = GameDatabase.getGlobalGameList();

        while (true) {

            System.out.println("1. Login\n2.Register\n");
            int loginForm = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Username: ");
            String username = scanner.nextLine();
            System.out.println("Password: ");
            String password = scanner.nextLine();

            switch (loginForm) {
                case 1: // Login
                    Login.LoginAccount(username, password, 0.0);
                    break;
                case 2: // Register
                    Registration.RegisterAccount(username, password, 0.0);
                    break;
            }
        }

//        System.out.println("** Global Game List **");
//
//        for (Game game : GlobalGameList) {
//            System.out.println("Game: " + game.getTitle());
//            System.out.println("Genre: " + game.getGenre());
//            System.out.println("Release date: " + game.getReleaseDate());
//            System.out.println("Prize: " + game.getPrize() + "\n");
//            System.out.println("---------------------------\n");
//        }
//
//        List<User> UserList = UserDatabase.getGlobalUserList();
//        System.out.println("## Global User List ##");
//
//        for (User user : UserList) {
//            System.out.println("User: " + user.getUsername());
//            System.out.println("Total poins: " + user.getPoints() + "\n");
//            System.out.println("------ Game Library ------");
//            for (Game game : user.getGameList()) {
//                System.out.println("Game: " + game.getTitle());
//                System.out.println("Genre: " + game.getGenre());
//                System.out.println("Release date: " + game.getReleaseDate());
//                System.out.println("Prize: " + game.getPrize());
//                System.out.println("---------------------------");
//            }
//        }
    }
}