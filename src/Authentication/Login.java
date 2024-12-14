package Authentication;

import Database.User;

public class Login {

    Authentication authentication;

    public Login(Authentication authentication) {
        this.authentication = authentication;
    }

    public boolean LoginAccount(String username, String password, Double points) {
        if (authentication.isLoginValid(new User(username, password, points))) {
            System.out.println("Login successful.");
            return true;
        }
        System.out.println("Username or password incorrect.");
        return false;
    }
}
