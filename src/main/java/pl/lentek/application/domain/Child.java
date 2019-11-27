package pl.lentek.application.domain;

import pl.lentek.application.request.MotherRequest;

public abstract class Child {

  private Child tallerChild;

  public abstract void processRequest(MotherRequest motherRequest);

  public Child getTallerChild() {
    return tallerChild;
  }

  public void setTallerChild(Child tallerChild) {
    this.tallerChild = tallerChild;
  }
}
