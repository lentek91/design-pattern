package pl.lentek.observers;

import pl.lentek.domain.WeatherForecast;
import pl.lentek.domain.WeatherForecastObserver;

public class RadioNews implements WeatherForecastObserver {

  @Override
  public void updateForecast(WeatherForecast weatherForecast) {
    System.out.println(
        "Radio - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature()
            + " stopni, ciśnienie: " + weatherForecast.getPressure() + "hPa");
  }
}
