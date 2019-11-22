package pl.lentek.observers;

import pl.lentek.domain.WeatherForecastObserver;

public interface Obserevable {

  void registerObserver(WeatherForecastObserver observer);

  void unRegisterObserver(WeatherForecastObserver observer);

  void notifyObservers();
}
