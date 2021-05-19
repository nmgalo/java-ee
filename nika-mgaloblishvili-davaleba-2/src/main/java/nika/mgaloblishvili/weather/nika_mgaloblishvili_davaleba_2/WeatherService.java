package nika.mgaloblishvili.weather.nika_mgaloblishvili_davaleba_2;

public class WeatherService {

    public static String answer(String question) {
        ApiClient restClient = new ApiClient();

        String result;

        try {
            if (question.equals("all")) {
                result = restClient.get("weather");
            } else {
                result = restClient.get("weather/" + question);
            }
        } catch (Exception e) {
            result = "An error occurred, please try again later";
            System.out.println(e.getMessage());
        }

        return result;
    }

}
