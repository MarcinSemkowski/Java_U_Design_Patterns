package Observer.weather_forecast.weather;


import Observer.weather_forecast.notify.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();

}
