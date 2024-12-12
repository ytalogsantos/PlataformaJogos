package Authentication;

import Database.User;
import Database.UserDatabase;

import java.util.List;

public class Registration {

    private static List<User> users = UserDatabase.getGlobalUserList();

    public static boolean RegisterAccount(String username, String password, Double points) {
        User newUser = new User(username, password, points);
        if (AuthenticationService.isRegistrationValid(newUser)) {
            UserDatabase.CreateNewUser(newUser);
            return true;
        }
        else {
            return false;
        }
    }
}
