package Observer.weather_forecast.notify;

import Observer.weather_forecast.weather.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);

}
