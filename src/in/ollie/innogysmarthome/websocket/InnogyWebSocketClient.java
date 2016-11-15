package in.ollie.innogysmarthome.websocket;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketError;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;
import org.slf4j.LoggerFactory;

@WebSocket
public class InnogyWebSocketClient {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(InnogyWebSocketClient.class);
    private final CountDownLatch closeLatch;
    @SuppressWarnings("unused")
    private Session session;
    public boolean isConnected = false;

    public InnogyWebSocketClient() {
        this.closeLatch = new CountDownLatch(1);
    }

    @OnWebSocketConnect
    public void onConnect(Session session) {
        logger.info("onConnect({})", session);
        this.session = session;
        isConnected = true;
    }

    @OnWebSocketClose
    public void onClose(int statusCode, String reason) {
        logger.info("onClose({}, {})", statusCode, reason);
        this.session = null;
        this.closeLatch.countDown();
        isConnected = false;
    }

    public boolean awaitClose(int duration, TimeUnit unit) throws InterruptedException {
        return this.closeLatch.await(duration, unit);
    }

    @OnWebSocketError
    public void onError(Throwable cause) {
        logger.warn("onError", cause);
        isConnected = false;
    }

    @OnWebSocketMessage
    public void onMessage(String msg) {
        logger.info("onMessage() - {}", msg);
    }
}
