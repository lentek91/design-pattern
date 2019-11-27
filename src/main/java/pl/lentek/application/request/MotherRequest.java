package pl.lentek.application.request;

import pl.lentek.application.domain.Shelf;

public class MotherRequest {

  private Shelf shelf;

  public MotherRequest(Shelf shelf) {
    this.shelf = shelf;
  }

  public Shelf getShelf() {
    return shelf;
  }
}
