package Authentication;

import Database.User;

public interface Authentication {
    public boolean isLoginValid(User user);

    public boolean isRegistrationValid(User user);
}