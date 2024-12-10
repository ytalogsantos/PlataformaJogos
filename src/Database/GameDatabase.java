package Database;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class GameDatabase {

    private static List<Game> GlobalGameList = new ArrayList<Game>();

    static {
        GlobalGameList.add(new Game("Undertale", "RPG Maker", LocalDate.of(2025, 9, 15), 55.0));
        GlobalGameList.add(new Game("Litle Goody Two Shoes", "RPG Maker", LocalDate.of(2023, 10, 31), 150.0));
    }

    public static List<Game> getGlobalGameList() {
        return GlobalGameList;
    }
}