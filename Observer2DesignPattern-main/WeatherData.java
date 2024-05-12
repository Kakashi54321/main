import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private float temp;
    private float humidity;
    private float pressure;
    private List<Observer> observers;
    public WeatherData(){
        observers = new ArrayList<Observer>();
    }
    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    public void notifyObservers(){
        for(Observer observer: observers) observer.update(temp, humidity, pressure);
    }
    public void measurementChanged(){
        notifyObservers();
    }
    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
