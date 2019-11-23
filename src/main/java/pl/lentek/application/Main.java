package pl.lentek.application;

import pl.lentek.domain.Car;
import pl.lentek.domain.CommonwealthFactory;
import pl.lentek.domain.ContinentalFactory;
import pl.lentek.domain.Factory;
import pl.lentek.enums.BMWModel;
import pl.lentek.enums.FordModel;

public class Main {

  public static void main(String[] args) {
    Factory commonwealthFactory = new CommonwealthFactory();
    Factory continentalFactory = new ContinentalFactory();

    Car bmw = commonwealthFactory.buildBMW(BMWModel.E60);
    System.out.println(bmw.getSteeringWheelPosition());

    Car ford = continentalFactory.buildFord(FordModel.CMAX);
    System.out.println(ford.getSteeringWheelPosition());
  }
}
