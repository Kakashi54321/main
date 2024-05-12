package designPattern.Observer;

/**
 *
 * @author ddilipk
 */
public interface Subject {

    void notifySubscribers();

    void subscribe(Subscriber sub);

    void unSubscribe(Subscriber sub);

    void upload(String title);
    
}
