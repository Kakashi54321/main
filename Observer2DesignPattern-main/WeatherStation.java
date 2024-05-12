public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherdata = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherdata);
        weatherdata.setMeasurements(1,2,3);
        weatherdata.setMeasurements(4,5,6);
    }
}
