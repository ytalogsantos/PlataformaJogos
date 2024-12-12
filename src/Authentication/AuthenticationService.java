package Authentication;

import Database.User;
import Database.UserDatabase;

import java.util.List;

public class AuthenticationService {
    private static List<User> users = UserDatabase.getGlobalUserList();

    public static boolean isLoginValid(User user) {
        return users.contains(user);
    }

    public static boolean isRegistrationValid (User user) {
        if (isUsernameTaken(user.getUsername())) {
            return false;
        }
        return true;
    }

    private static boolean isUsernameTaken(String username) {
        for (User existingUser : users) {
            if (existingUser.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}