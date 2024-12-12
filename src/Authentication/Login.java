package Authentication;

import Database.User;

public class Login {

    public static Boolean LoginAccount(String username, String password, Double points) {
        if (AuthenticationService.isLoginValid(new User(username, password, points))) {
            System.out.println("Login successful.");
            return true;
        }
        else {
            System.out.println("Username or password incorect.");
            return false;
        }
    }
}
