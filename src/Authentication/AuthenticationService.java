package Authentication;

import Database.User;

import java.util.List;

public class AuthenticationService implements Authentication {

    private List<User> users;

    public AuthenticationService(List<User> users) {
        this.users = users;
    }

    @Override
    public boolean isLoginValid(User user) {
        return users.contains(user);
    }

    @Override
    public boolean isRegistrationValid(User user) {
        return !users.stream().anyMatch(
                existingUser -> existingUser.getUsername().equals(user.getUsername())
        );
    }
}