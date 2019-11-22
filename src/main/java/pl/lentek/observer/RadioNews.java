package main.java.pl.lentek.observer;

import main.java.pl.lentek.entity.WeatherForecast;
import main.java.pl.lentek.entity.WeatherForecastObserver;

public class RadioNews implements WeatherForecastObserver {

  @Override
  public void updateForecast(WeatherForecast weatherForecast) {
    System.out.println(
        "Radio - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature()
            + " stopni, ciśnienie: " + weatherForecast.getPressure() + "hPa");
  }
}
