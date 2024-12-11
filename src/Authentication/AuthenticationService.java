package Authentication;

import Database.User;
import Database.UserDatabase;

import java.util.List;

public class AuthenticationService {
    private static List<User> users = UserDatabase.getGlobalUserList();

    public static Boolean validateUser(User user) {
        return users.contains(user);
    }
}