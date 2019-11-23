package pl.lentek.domain;

import pl.lentek.enums.FuelType;
import pl.lentek.enums.SteeringWheelPosition;

public class Ford extends Car {

  public Ford(String model, double engineCapacity, FuelType fuelType, int productionYear,
      SteeringWheelPosition steeringWheelPosition) {
    super(model, engineCapacity, fuelType, productionYear, steeringWheelPosition);
  }
}
