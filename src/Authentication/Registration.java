package Authentication;

import Database.User;
import Database.UserDatabase;

public class Registration {

    Authentication authentication;

    public Registration(Authentication authentication) {
        this.authentication = authentication;
    }

    public boolean RegisterAccount(String username, String password, Double points) {
        User newUser = new User(username, password, points);
        if (authentication.isRegistrationValid(newUser)) {
            UserDatabase.CreateNewUser(newUser);
            return true;
        }
        return false;
    }
}
