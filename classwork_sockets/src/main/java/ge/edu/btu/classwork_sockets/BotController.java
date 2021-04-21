package ge.edu.btu.classwork_sockets;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/bot-socket")
public class BotController {

    @OnOpen
    public void handleOpen() {
        System.out.println("Connected ...");
    }

    @OnMessage
    public String handleMessage(String message) {
        return BotService.generateAnswer(message);
    }

    @OnClose
    public void handleClose() {
        System.out.println("End");
    }

    @OnError
    public void handleError(Throwable t) {
        t.printStackTrace();
    }

}
