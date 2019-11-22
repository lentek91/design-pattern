package pl.lentek.application;

import java.math.BigDecimal;
import pl.lentek.domain.FlightLeg;

public class Main {
  public static void main(String[] args) {
    FlightLeg leg = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles").price(BigDecimal.valueOf(50)).build();

    System.out.println(leg);

    FlightLeg leg1 = new FlightLeg.FlightLegBuilder("Las Vegas","Los Angeles").build();
    System.out.println(leg1);
  }
}
