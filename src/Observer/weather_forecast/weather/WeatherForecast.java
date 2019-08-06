package Observer.weather_forecast.weather;



import Observer.weather_forecast.notify.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {

    private int temperature;
    private int  pressure;
    private Set<Observer> registerObservers;

    public WeatherForecast(){
        registerObservers = new HashSet<>();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public Set<Observer> getRegisterObservers() {
        return registerObservers;
    }

    public void setRegisterObservers(Set<Observer> registerObservers) {
        this.registerObservers = registerObservers;
    }


    @Override
    public void registerObserver(Observer observer) {
      registerObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
      registerObservers.remove(observer);
    }

    public void updateForecast(int temperature,int pressure){
       this.temperature = temperature;
       this.pressure = pressure;
       notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: registerObservers) {
            observer.updateForecast(this);
        }
    }
}
