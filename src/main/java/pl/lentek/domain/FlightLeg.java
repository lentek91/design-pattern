package pl.lentek.domain;

import java.math.BigDecimal;

public class FlightLeg {

  private String from;
  private String to;
  private Boolean deleyed;
  private BigDecimal price;

  private FlightLeg(FlightLegBuilder flightLegBuilder) {
    this.from = flightLegBuilder.from;
    this.to = flightLegBuilder.to;
    this.deleyed = flightLegBuilder.deleyed;
    this.price = flightLegBuilder.price;
  }

  @Override
  public String toString() {
    return "FlightLeg{" +
        "from='" + from + '\'' +
        ", to='" + to + '\'' +
        ", deleyed=" + deleyed +
        ", prce=" + price +
        '}';
  }

  public static class FlightLegBuilder {

    private String from;
    private String to;
    private Boolean deleyed;
    private BigDecimal price;

    public FlightLegBuilder(String from, String to) {
      this.from = from;
      this.to = to;
      this.deleyed = false;
    }

    public FlightLegBuilder price(BigDecimal price) {
      this.price = price;
      return this;
    }

    public FlightLeg build() {
      if (this.price == null) {
        throw new IllegalStateException("Brak wymaganego pola - cena");
      }
      return new FlightLeg(this);
    }
  }
}
