package ge.edu.btu.quiz_3;

import java.util.ArrayList;
import java.util.List;

public class CovidStatisticFakeData {

    public static List<Covid> getStats() {
        List<Covid> stats = new ArrayList<>();
        stats.add(new Covid("Georgia", 200, -1, 199));
        stats.add(new Covid("USA", 100000, 2193, 3128));
        stats.add(new Covid("Germany", 2178381, 126, 23762));
        return stats;
    }

}
