package Database;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserDatabase {
    private static List<User> GlobalUserList = new ArrayList<>();

    public static void CreateNewUser(String username, String password, Double points) {
        Double userPoints = points > 0 ? points : 0;
        User user = new User (username, password, userPoints);
        user.setGameList(new ArrayList<>());
        GlobalUserList.add(user);
    }

    public static List<User> getGlobalUserList() {
        return GlobalUserList;
    }
}