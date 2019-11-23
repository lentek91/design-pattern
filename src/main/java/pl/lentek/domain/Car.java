package pl.lentek.domain;

import pl.lentek.enums.FuelType;
import pl.lentek.enums.SteeringWheelPosition;

public abstract class Car {

  private String model;
  private double engineCapacity;
  private FuelType fuelType;
  private int productionYear;
  private SteeringWheelPosition steeringWheelPosition;

  protected Car(String model, double engineCapacity, FuelType fuelType, int productionYear,
      SteeringWheelPosition steeringWheelPosition) {
    this.model = model;
    this.engineCapacity = engineCapacity;
    this.fuelType = fuelType;
    this.productionYear = productionYear;
    this.steeringWheelPosition = steeringWheelPosition;
  }

  public SteeringWheelPosition getSteeringWheelPosition() {
    return steeringWheelPosition;
  }
}
