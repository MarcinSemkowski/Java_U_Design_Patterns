package Observer.weather_forecast.notify;

import Observer.weather_forecast.weather_news.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);

}
