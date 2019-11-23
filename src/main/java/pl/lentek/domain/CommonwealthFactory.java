package pl.lentek.domain;

import pl.lentek.enums.BMWModel;
import pl.lentek.enums.FordModel;
import pl.lentek.enums.FuelType;
import pl.lentek.enums.SteeringWheelPosition;

public class CommonwealthFactory extends Factory {

  private final static SteeringWheelPosition steeringWheelPosition = SteeringWheelPosition.LEFT;

  @Override
  public BMW buildBMW(BMWModel model) {
    switch (model) {
      case E60:
        return new BMW(BMWModel.E60.getModel(), 3.2, FuelType.GASOLINE, 2017,
            steeringWheelPosition);
      case X5:
        return new BMW(BMWModel.X5.getModel(), 4.2, FuelType.DIESEL, 2017, steeringWheelPosition);
      default:
        throw new UnsupportedOperationException(("Błędny model"));
    }
  }

  @Override
  public Ford buildFord(FordModel model) {
    switch (model) {
      case CMAX:
        return new Ford(FordModel.CMAX.getModel(), 1.6, FuelType.DIESEL, 2017,
            steeringWheelPosition);
      case FOCUS:
        return new Ford(FordModel.FOCUS.getModel(), 2.0, FuelType.GAS, 2017, steeringWheelPosition);
      default:
        throw new UnsupportedOperationException(("Błędny model"));
    }
  }
}
