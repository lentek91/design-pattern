package pl.lentek.domain;

import pl.lentek.enums.TransportType;

public class MyDay extends WeekDay {

  @Override
  protected int goToWork(TransportType transportType) {
    switch (transportType) {
      case BIKE:
        return 15;
      case CAR:
        return 10;
      case TRAM:
        return 20;
      default:
        return 25;
    }
  }
}
