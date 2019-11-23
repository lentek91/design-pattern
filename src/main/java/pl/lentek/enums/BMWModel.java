package pl.lentek.enums;

public enum BMWModel {
  X5("X5"),
  E60("E60");

  private String model;

  BMWModel(String model) {
    this.model = model;
  }

  public String getModel() {
    return model;
  }
}
