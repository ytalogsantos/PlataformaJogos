package Database;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class GameDatabase {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private static List<Game> GlobalGameList = new ArrayList<Game>() {
        {add(new Game("Undertale", "RPG Maker", LocalDate.of(2025, 9, 15), 55.0));};
    };

    public static List<Game> getGameList() {
        return GlobalGameList;
    }
}
