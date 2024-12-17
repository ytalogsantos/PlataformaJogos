package Main;

import Authentication.Authentication;
import Authentication.AuthenticationService;
import Authentication.Login;
import Authentication.Registration;
import Database.Game;
import Database.GameDatabase;
import Database.User;
import Database.UserDatabase;
import DatabaseServices.UserDatabaseServices;
import DatabaseServices.UserSession;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static String getUserInput(Scanner scanner, String prompt) {
        System.out.println(prompt);
        return scanner.nextLine().toLowerCase();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<User> users = UserDatabase.getGlobalUserList();
        GlobalGameLibrary globalGameLibrary = new GlobalGameLibrary(GameDatabase.getGlobalGameList());
        Authentication authentication = new AuthenticationService(users);
        Login login = new Login(authentication);
        Registration registration = new Registration(authentication);
        UserDatabaseServices databaseServices = new UserDatabaseServices(users);
        User currentUser;
        UserProfile currentUserProfile;

        while (true) {
            System.out.println("1.Login\n2.Register");
            int loginForm = scanner.nextInt();
            scanner.nextLine();

            String username = getUserInput(scanner, "Username: ");
            String password = getUserInput(scanner, "Password: ");

            switch (loginForm) {
                case 1: // Login
                    if (login.LoginAccount(username, password, 0.0)) {
                        currentUser = databaseServices.findByUsername(username);
                        currentUserProfile = new UserProfile(currentUser);
                        UserSession userSession = new UserSession(currentUserProfile, globalGameLibrary, scanner);
                        userSession.manageUserSession();
                    }
                    break;
                case 2:
                    if (registration.RegisterAccount(username, password, 0.0)) {
                        System.out.println("Registration successful.");

                    } else {
                        System.out.println("Username already exists.");
                    }
                    break;
            }
        }
    }
}