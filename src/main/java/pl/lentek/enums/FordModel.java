package pl.lentek.enums;

public enum FordModel {
  FOCUS("FOCUS"),
  CMAX("C-MAX");

  private String model;

  FordModel(String model) {
    this.model = model;
  }

  public String getModel() {
    return model;
  }
}
