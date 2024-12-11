package Database;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserDatabase {
    private static List<User> GlobalUserList = new ArrayList<>();

    public static void CreateNewUser(User user) {
        Double userPoints = user.getPoints() > 0 ? user.getPoints() : 0;
        user.setGameList(new ArrayList<>());
        user.setPoints(userPoints);
        GlobalUserList.add(user);
    }

    public static List<User> getGlobalUserList() {
        return GlobalUserList;
    }
}