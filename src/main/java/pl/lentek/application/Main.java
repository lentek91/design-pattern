package pl.lentek.application;

import pl.lentek.domain.MyDay;
import pl.lentek.domain.WeekDay;
import pl.lentek.enums.TransportType;

public class Main {

  public static void main(String[] args) {
    WeekDay day = new MyDay();
    day.everyDayIsExactlyTheSame(TransportType.BIKE);
  }
}
