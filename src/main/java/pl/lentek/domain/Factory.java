package pl.lentek.domain;

import pl.lentek.enums.BMWModel;
import pl.lentek.enums.FordModel;

public abstract class Factory {

  public abstract BMW buildBMW(BMWModel model);

  public abstract Ford buildFord(FordModel model);
}
