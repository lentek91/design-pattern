package pl.lentek.domain;

import pl.lentek.enums.TransportType;

public abstract class WeekDay {

  public final void everyDayIsExactlyTheSame(TransportType transportType) {
    wakeUp();
    getReady();
    int time = goToWork(transportType);
    summary(time);
    work();
    goHome();
  }

  private void goHome() {
    System.out.println("Powrót do domu");
  }

  private void work() {
    System.out.println("Pracuję");
  }

  private void summary(int time) {
    System.out.println("Trasa do pracy zajęła: " + time + " minut");
  }

  protected abstract int goToWork(TransportType transportType);

  private void getReady() {
    System.out.println("Gotowy do wyjścia");
  }

  public void wakeUp() {
    System.out.println("Pobudka");
  }
}
