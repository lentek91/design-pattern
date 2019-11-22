package pl.lentek.application;

import pl.lentek.domain.WeatherForecast;
import pl.lentek.observers.InternetNews;
import pl.lentek.observers.RadioNews;
import pl.lentek.observers.TvNews;

public class Main {

  public static void main(String[] args) {
    WeatherForecast weatherForecast = new WeatherForecast(25, 1003);
    RadioNews radioNews = new RadioNews();
    InternetNews internetNews = new InternetNews();
    TvNews tvNews = new TvNews();
    weatherForecast.registerObserver(radioNews);
    weatherForecast.registerObserver(internetNews);
    weatherForecast.registerObserver(tvNews);
    weatherForecast.notifyObservers();
    weatherForecast.unRegisterObserver(tvNews);
    weatherForecast.unRegisterObserver(radioNews);
    System.out.println("Nowa prognoza - powiadomienie tylko dla serwisu internetowego:");
    weatherForecast.updateForecast(18, 1007);
  }
}
