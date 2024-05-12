package designPattern.Observer;

/**
 *
 * @author ddilipk
 */
public class Youtube {
    public static void main(String[] args) {
        Channel channel = new Channel();

        Subscriber s1 = new Subscriber("Dilip");
        Subscriber s2 = new Subscriber("Rahul");
        Subscriber s3 = new Subscriber("Kabir");
        Subscriber s4 = new Subscriber("Neha");
        Subscriber s5 = new Subscriber("Anjali");

        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);
        channel.subscribe(s4);
        channel.subscribe(s5);

        s1.subscribeChannel(channel);
        s2.subscribeChannel(channel);
        s3.subscribeChannel(channel);
        s4.subscribeChannel(channel);
        s5.subscribeChannel(channel);
        
        channel.unSubscribe(s5); // s5(Anjali), won't get notified
        
        channel.upload("How to learn Programming");
    }   
}
