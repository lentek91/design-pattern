package main.java.pl.lentek.entity;

import main.java.pl.lentek.observer.Obserevable;

import java.util.HashSet;
import java.util.Observer;
import java.util.Set;

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

  public void setTemperature(int temperature) {
    this.temperature = temperature;
  }

  public int getPressure() {
    return pressure;
  }

  public void setPressure(int pressure) {
    this.pressure = pressure;
  }

  public Set<WeatherForecastObserver> getObserverSet() {
    return observerSet;
  }

  public void setObserverSet(Set<WeatherForecastObserver> observerSet) {
    this.observerSet = observerSet;
  }
}
