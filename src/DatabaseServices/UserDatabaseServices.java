package DatabaseServices;

import Database.User;

import java.util.List;

public class UserDatabaseServices {

    List<User> userList;

    public UserDatabaseServices(List<User> userList) {
        this.userList = userList;
    }

    public User findByUsername(String username) {
         for (User user : userList) {
             if (user.getUsername().equals(username))
                 return user;
         }
         return null;
    }
}