package pl.lentek.domain;

import java.util.HashSet;
import java.util.Set;
import pl.lentek.observers.Obserevable;

public class WeatherForecast implements Obserevable {

  private int temperature;
  private int pressure;
  private Set<WeatherForecastObserver> observerSet = new HashSet<>();

  public WeatherForecast(int temperature, int pressure) {
    this.temperature = temperature;
    this.pressure = pressure;
  }

  @Override
  public void registerObserver(WeatherForecastObserver observer) {
    observerSet.add(observer);
  }

  @Override
  public void unRegisterObserver(WeatherForecastObserver observer) {
    observerSet.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (WeatherForecastObserver observer : observerSet) {
      observer.updateForecast(this);
    }
  }

  public void updateForecast(int temperature, int pressure) {
    setTemperature(temperature);
    setPressure(pressure);
    notifyObservers();
  }

  public int getTemperature() {
    return temperature;
  }

  private void setTemperature(int temperature) {
    this.temperature = temperature;
  }

  public int getPressure() {
    return pressure;
  }

  private void setPressure(int pressure) {
    this.pressure = pressure;
  }
}
