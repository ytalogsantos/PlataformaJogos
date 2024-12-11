package Authentication;

import Database.User;

public class Login {

    public static Boolean LoginAccount(String username, String password, Double points) {
        if (AuthenticationService.validateUser(new User(username, password, points))) {
            System.out.println("Login bem sucedido.");
            return true;
        }
        else {
            System.out.println("Usuário não cadastrado.");
            return false;
        }
    }
}
