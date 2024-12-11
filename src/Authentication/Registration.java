package Authentication;

import Database.User;
import Database.UserDatabase;

import java.util.List;

public class Registration {

    private static List<User> users = UserDatabase.getGlobalUserList();

    public static Boolean RegisterAccount(String username, String password, Double points) {
        User newUser = new User(username, password, points);
        if (!AuthenticationService.validateUser(newUser)) {
            UserDatabase.CreateNewUser(newUser);
            System.out.println("Registration completed successfully.");
            return true;
        }
        else {
            System.out.println("You already have an account. Please, return and select Login");
            return false;
        }
    }
}
