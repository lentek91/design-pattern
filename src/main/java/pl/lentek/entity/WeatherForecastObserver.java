package main.java.pl.lentek.entity;

import main.java.pl.lentek.entity.WeatherForecast;

public interface WeatherForecastObserver {

  void updateForecast(WeatherForecast weatherForecast);
}
