package designPattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ddilipk
 */
public class Channel implements Subject{
    private List<Subscriber> subscribers = new ArrayList<>();
    String title;
    
    @Override
    public void subscribe(Subscriber sub){
        subscribers.add(sub);
    }
    
    @Override
    public void unSubscribe(Subscriber sub){
        subscribers.remove(sub);
    }
    
    @Override
    public void notifySubscribers(){
        for(Subscriber sub: subscribers){
            sub.update();
        }
    }
    
    @Override
    public void upload(String title){
        this.title = title;
        notifySubscribers();
    }
}
