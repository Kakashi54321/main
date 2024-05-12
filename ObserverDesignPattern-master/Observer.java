package designPattern.Observer;

/**
 *
 * @author ddilipk
 */
public interface Observer {

    void subscribeChannel(Channel ch);

    void update();
    
}
