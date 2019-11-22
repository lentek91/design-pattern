package main.java.pl.lentek.observer;

import main.java.pl.lentek.entity.WeatherForecastObserver;

public interface Obserevable {

  void registerObserver(WeatherForecastObserver observer);

  void unRegisterObserver(WeatherForecastObserver observer);

  void notifyObservers();
}
