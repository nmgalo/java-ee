package nika.mgaloblishvili.weather.nika_mgaloblishvili_davaleba_1;

import java.util.ArrayList;
import java.util.List;

public class Forecasts {
    public static List<Weather> getForecasts() {
        List<Weather> forecasts = new ArrayList<>();

        forecasts.add(new Weather("Tbilisi", 20, 15, 70, DirectionType.EAST, 20));
        forecasts.add(new Weather("Batumi", 21, 19, 70, DirectionType.EAST, 20));
        forecasts.add(new Weather("Kutaisi", 24, 14, 80, DirectionType.WEST, 20));

        return forecasts;
    }
}