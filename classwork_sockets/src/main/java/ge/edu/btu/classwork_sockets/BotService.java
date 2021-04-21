package ge.edu.btu.classwork_sockets;

public class BotService {

    public static String generateAnswer(String question) {
        String answer;
        switch (question) {
            case "Hi":
                answer = "ზდაროვა ბრააატ";
                break;
            case "როგორხარ?":
                answer = "საკაიფოდ";
                break;
            default:
                answer = "სმისლე";
        }
        return answer;
    }

}
