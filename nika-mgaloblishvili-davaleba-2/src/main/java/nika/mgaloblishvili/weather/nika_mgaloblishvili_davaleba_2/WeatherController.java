package nika.mgaloblishvili.weather.nika_mgaloblishvili_davaleba_2;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/weather-bot")
public class WeatherController {

    @OnOpen
    public void handleOpen() {
        System.out.println("Connected");
    }

    @OnClose
    public void handleClose() {
        System.out.println("End");
    }

    @OnError
    public void handleError(Throwable t) {
        t.printStackTrace();
    }

    @OnMessage
    public String handleMessage(String message) {
        return WeatherService.answer(message);
    }

}
