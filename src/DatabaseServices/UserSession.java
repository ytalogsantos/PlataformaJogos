package DatabaseServices;

import Database.User;
import Main.UserProfile;

import java.util.Scanner;

public class UserSession {
    UserProfile user;
    Scanner scanner;
    int choice = 0;

    public UserSession(UserProfile currentUser, Scanner scanner) {
        this.user = currentUser;
        this.scanner = scanner;
    }

    public void manageUserSession() {
        while (true) {
            System.out.println("1. Show profile");
            System.out.println("2. Show game list");
            System.out.println("3. Logout");
            System.out.println("Your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    user.showProfile();
                    break;

            }
        }
    }
}
