package Observer.weather_forecast.notify;

import Observer.weather_forecast.weather.WeatherForecast;

public class RadioNews implements Observer {

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() +
                "stopni, ciśnienie: " + weatherForecast.getPressure());
    }
}
